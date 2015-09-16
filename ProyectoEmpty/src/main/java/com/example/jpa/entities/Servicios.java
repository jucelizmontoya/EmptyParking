
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="SERVICIOS")
public class Servicios implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_servicio")
    private String idServicios;
    
   
    private String nombreServicio;
    
  
    private String descripcion;
    
  
    private Double valor;
    
    @ManyToOne
    @JoinColumn(name="id_tipo_servicio")
    private Tipos_Servicio idTipoServicio;
    
      @OneToMany(mappedBy = "servicio")
    private List<Calificaciones_Servicio> calificacionesServicios;
    
    public Servicios(){
        
    }
    
      public Servicios(int idServicio) {
        this.idServicios = idServicios;
    }

    public String getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(String idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Tipos_Servicio getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Tipos_Servicio idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public List<Calificaciones_Servicio> getCalificacionesServicios() {
        return calificacionesServicios;
    }

    public void setCalificacionesServicios(List<Calificaciones_Servicio> calificacionesServicios) {
        this.calificacionesServicios = calificacionesServicios;
    }
    
    
    
}
