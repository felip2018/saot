package com.saot.controller;

import com.saot.ejb.UsuarioFacadeLocal;
import com.saot.model.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuarioController implements Serializable {
    
    private Usuario usuario;
    
    private List<Usuario> listadoUsuarios;
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
        usuario.setFechaRegistro(new Date());
        usuario.setEstadoRegistro("Activo");
        
        listadoUsuarios = usuarioEJB.findAll();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> listado) {
        this.listadoUsuarios = listado;
    }
    
    
    
    public String iniciarSesion(){
        String urlRedireccionamiento = "";
        Usuario u; 
        try {
            u = usuarioEJB.iniciarSesion(usuario);
            
            if (u != null) {
                
                switch (u.getIdRol()) {
                    case 1:
                        urlRedireccionamiento = "vistas/AgenteCentroControl/AgenteCentroControlInicio?faces-redirect=true";
                        break;
                    case 2:
                        urlRedireccionamiento = "vistas/LiderCuadrilla/LiderCuadrillaInicio?faces-redirect=true";
                        break;
                    case 3:
                        urlRedireccionamiento = "vistas/AgenteLogistica/AgenteLogisticaInicio?faces-redirect=true";
                        break;
                }
                
            } else {
                FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Aviso",
                    "El usuario no existe!"));
            }
            
        } catch (Exception e) {
            
        }
        return urlRedireccionamiento;
    }
    
    public void registrarUsuario(){
        try {
            usuarioEJB.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Aviso",
                    "El usuario ha sido creado correctamente!"));
        } catch (Exception e) {
            throw e;
        }
    }
}
