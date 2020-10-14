package com.saot.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orden_trabajo")
public class OrdenTrabajo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_trabajo")
    private int idOrdenT;
    
    @Column(name = "id_usuario")
    private int idUsuario;
    
    @Column(name = "numero_orden")
    private int numeroOrden;
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "tipo_falla")
    private String tipoFalla;
    
    @Column(name = "asignado")
    private String asignado;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "contacto")
    private String contacto;
        
    @Column(name = "ubicacion")
    private String ubicacion;
    
    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;    

    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "localidad")
    private String localidad;
        
    @Column(name = "barrio")
    private String barrio;
            
    @Column(name = "numero_rotulo")
    private int numeroRotulo;
                
    @Column(name = "punto_fisico")
    private int puntoFisico;
                    
    @Column(name = "numero_camara")
    private int numeroCamara;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
        
    @Column(name = "estado_registro")
    private String estadoRegistro;

    public int getIdOrdenT() {
        return idOrdenT;
    }

    public void setIdOrdenT(int idOrdenT) {
        this.idOrdenT = idOrdenT;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoFalla() {
        return tipoFalla;
    }

    public void setTipoFalla(String tipoFalla) {
        this.tipoFalla = tipoFalla;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getNumeroRotulo() {
        return numeroRotulo;
    }

    public void setNumeroRotulo(int numeroRotulo) {
        this.numeroRotulo = numeroRotulo;
    }

    public int getPuntoFisico() {
        return puntoFisico;
    }

    public void setPuntoFisico(int puntoFisico) {
        this.puntoFisico = puntoFisico;
    }

    public int getNumeroCamara() {
        return numeroCamara;
    }

    public void setNumeroCamara(int numeroCamara) {
        this.numeroCamara = numeroCamara;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    
}
