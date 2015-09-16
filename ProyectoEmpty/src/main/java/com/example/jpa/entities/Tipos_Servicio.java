
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TIPOS_SERVICIO")
public class Tipos_Servicio implements Serializable{
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_servicio")
    private String idtiposervicio;
    
   
    private String nombre;
    
       @OneToMany(mappedBy = "tipoServicio")
    private List<Servicios> servicios;
    
    public Tipos_Servicio(){
        
    }
    
     public Tipos_Servicio(short idTipoServicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(String idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }
    
    
    
    
}
