
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name="PAISES")
public class Pais implements Serializable {
    
    @Id
    @Column(name="id_pais")
    private String idPais;
    
    @Column(name="nombre_pais")
    @Size (max = 60)
    private String nombrePais;
    
    @OneToMany(mappedBy="idpais")//esto es para mapear una llave foranea
    
    private List<Departamentos>departamento;

    public Pais (){
        
    }
    
    public Pais(String idpais){
        this.idPais= idpais;
    }

    public List<Departamentos> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(List<Departamentos> departamento) {
        this.departamento = departamento;
    }
    
    
    
    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    
    
}
