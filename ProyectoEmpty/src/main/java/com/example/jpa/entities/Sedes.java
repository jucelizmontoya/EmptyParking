
package com.example.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SEDES")
public class Sedes implements Serializable {
    
    @Id
    
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    @Column(name="id_sede")
    private int idsede;
    
 
    private String nombre;
    
   
    private String telefono;
    
    private String correo;
      
   
    
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="id_ciudad",referencedColumnName="id_ciudad"),
    @JoinColumn(name="id_departamento",referencedColumnName="id_departamento") })
     
    private Ciudad idciudad;
   
    public Sedes (){
        
    }

    public Sedes(int idsede) {
        this.idsede = idsede;
    }

    public int getIdsede() {
        return idsede;
    }

    public void setIdsede(int idsede) {
        this.idsede = idsede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Ciudad getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Ciudad idciudad) {
        this.idciudad = idciudad;
    }
    
    
}
