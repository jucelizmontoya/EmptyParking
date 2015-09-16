
package com.example.jpa.entities;

import java.io.Serializable;



public class Calificaciones_ServicioPK implements Serializable{
    
     private int idservicio;
    private int idusuario;
    
     public Calificaciones_ServicioPK() {
    } 

    public Calificaciones_ServicioPK(int idservicio, int idusuario) {
        this.idservicio = idservicio;
        this.idusuario = idusuario;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idservicio;
        hash = 89 * hash + this.idusuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
          if (obj == null) {
            return false;
        }
          
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calificaciones_ServicioPK other = (Calificaciones_ServicioPK) obj;
        if (this.idservicio != other.idservicio) {
            return false;
        }
        if (this.idusuario != other.idusuario) {
            return false;
        }
        return true;
    }
    
}
