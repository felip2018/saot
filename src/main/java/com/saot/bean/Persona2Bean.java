package com.saot.bean;

import com.saot.model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;


@ManagedBean
@RequestScoped
public class Persona2Bean {

    private static List<Persona> lista = new ArrayList();
    
    public List<Persona> getLista() {
        return lista;
    }
    
    public void setLista(List<Persona> lista){
        this.lista = lista;
    }
    
    public void listar(){
        Persona per = new Persona();
        per.setNombre("Sandra");
        per.setEdad(23);
        lista.add(per);
        
        per = new Persona();
        per.setNombre("Juan");
        per.setEdad(22);
        lista.add(per);
    }
}
