/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controllers;

import com.example.jpa.entities.Calificaciones_Servicio;
import com.example.jpa.sessions.CalificacionesServicioSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author julio
 */
@Named
@ViewScoped
public class CalificacionesServiciosController implements Serializable{
    
    @EJB
    private CalificacionesServicioSession calificacionesserviciosession;

    private Calificaciones_Servicio selectedcalificacionesservicio;

    private List<Calificaciones_Servicio> itemCalificacionesServicio = null;

    public CalificacionesServiciosController() {
    }
    
    public Calificaciones_Servicio getSelectedcalificacionesservicio() {

        if (selectedcalificacionesservicio == null) {
            selectedcalificacionesservicio = new Calificaciones_Servicio();
        }

        return selectedcalificacionesservicio;
    }

    public void setSelectedcalificacionesservicio(Calificaciones_Servicio selectedcalificacionesservicio) {
        this.selectedcalificacionesservicio = selectedcalificacionesservicio;
    }

    public CalificacionesServicioSession getCalificacionesserviciosession() {
        return calificacionesserviciosession;
    }

    public List<Calificaciones_Servicio> getItemCalificacionesServicio() {
        if (itemCalificacionesServicio == null) {
            try {
                itemCalificacionesServicio = getCalificacionesserviciosession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemCalificacionesServicio;
    }

    public void create() {

        try {
            getCalificacionesserviciosession().create(selectedcalificacionesservicio);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
}
