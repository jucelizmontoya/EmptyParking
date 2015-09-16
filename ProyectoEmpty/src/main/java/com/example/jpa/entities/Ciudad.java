
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="CIUDADES")
@IdClass(value=CiudadPK.class)
public class Ciudad implements Serializable {
    
    @Id
   @Column(name="id_ciudad")
    private int idCiudad;
    
    @Id
    @ManyToOne
    @JoinColumn(name="id_departamento")
    private Departamentos Departamento;
    
    @Column (name="nombre_ciudad")
    @Size (max = 60)
    private String nombreciudad; 
    
    @OneToMany(mappedBy = "ciudad")
    private List<Usuarios> usuarios;
    
    @OneToMany(mappedBy = "ciudad")
    private List<Sedes>sedes;
    
    public Ciudad(){
        
    }
    
    public Ciudad (int idCiudad, Departamentos idDepartamento){
        this.idCiudad = idCiudad;
        this.Departamento = idDepartamento;
       
    }

    public Departamentos getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(Departamentos Departamento) {
        this.Departamento = Departamento;
    }

    
    
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamentos getIdDepartamento() {
        return Departamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.Departamento = idDepartamento;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Sedes> getSedes() {
        return sedes;
    }

    public void setSedes(List<Sedes> sedes) {
        this.sedes = sedes;
    }
    
    
    
    
}
