package com.saot.controller;

import com.saot.ejb.ProductoFacadeLocal;
import com.saot.model.Producto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class managedProductos implements Serializable{
    
    @EJB
    private ProductoFacadeLocal pruductoFacade;
    private List<Producto> ListaProducto;
    private Producto producto;

    public List<Producto> getListaProducto() {
        this.ListaProducto = this.pruductoFacade.findAll();
        return ListaProducto;
    }

    public void setListaProducto(List<Producto> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    @PostConstruct
    public void init(){
        this.producto = new Producto();
    }
}
