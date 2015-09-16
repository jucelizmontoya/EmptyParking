
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ROLES")
public class Roles implements Serializable {
    
     @Id
    @Column(name="id_rol")
    private String idrol;
    
    @Column (name="nombre_rol")
    private String nombrerol;
    
     @OneToMany(mappedBy = "rol")
    private List<Usuarios> usuarios;
    
    public Roles(){
        
    }

    public Roles(String idrol) {
        this.idrol = idrol;
    }
    
    

    public String getIdrol() {
        return idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
}
