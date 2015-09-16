
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CALIICACIONES_SERVICIO")
public class Calificaciones_Servicio implements Serializable {
    
     @Id
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicios servicio;
    
    private byte puntuacion;
    
    private String comentario;
    
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;   

    public Calificaciones_Servicio() {
    }

    public Calificaciones_Servicio(Usuarios usuarios, Servicios servicios) {
        this.usuario = usuario;
        this.servicio = servicio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    public byte getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(byte puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
