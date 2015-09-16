
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="DEPARTAMENTOS")
public class Departamentos implements Serializable {
    
    @Id
    @Column (name="id_departamento")
    private Integer idDepartamentos;
    
    @Column (name="nombre_departamento")
    @Size (max=60)
    private String nombreDepartamento;
    
    @ManyToOne
    @JoinColumn (name="id_pais")
    private Pais idpais;
    
     @OneToMany(mappedBy = "id_departamento")
    private List<Ciudad> ciudades;
    
    
    public Departamentos(){
        
    }
    
      public Departamentos(int idDepartamento) {
        this.idDepartamentos = idDepartamento;
    }


    public Integer getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(Integer idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
    }
    
    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    } 
    
}
