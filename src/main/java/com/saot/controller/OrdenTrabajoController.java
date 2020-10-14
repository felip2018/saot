package com.saot.controller;

import com.saot.model.OrdenTrabajo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.saot.ejb.OrdenTrabajoFacadeLocal;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@ViewScoped
public class OrdenTrabajoController implements Serializable {

    private List<OrdenTrabajo> listaOT;

    @EJB
    private OrdenTrabajoFacadeLocal orden_trabaEJB;
    String mensaje = "";
    private OrdenTrabajo ordenTrabajo;

    @PostConstruct
    public void init() {
        ordenTrabajo = new OrdenTrabajo();
        ordenTrabajo.setFechaRegistro(new Date());
        ordenTrabajo.setEstadoRegistro("Activo");

        listaOT = orden_trabaEJB.findAll();

    }

    public List<OrdenTrabajo> getListaOT() {
        return listaOT;
    }

    public void setListaOT(List<OrdenTrabajo> listado) {
        this.listaOT = listado;
    }

    public OrdenTrabajo getorden_trabajo() {
        return ordenTrabajo;
    }

    public void setorden_trabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public void eliminar(OrdenTrabajo C) {
        try {
            this.orden_trabaEJB.remove(C);
            this.ordenTrabajo = new OrdenTrabajo();
            this.mensaje = "Eliminado con exito";
        } catch (Exception e) {
            e.printStackTrace();
            this.mensaje = "Error : " + e.getMessage();

        }
        FacesMessage mens = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, mens);
    }
}
