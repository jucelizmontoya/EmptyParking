/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controllers;

import com.example.jpa.entities.Ciudad;
import com.example.jpa.entities.Departamentos;
import com.example.jpa.sessions.CiudadSession;
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
public class CiudadController implements Serializable{
    
    @EJB
    private CiudadSession ciudadSessions;

    private Ciudad selectedCiudad;
    private int idDepartamento;
    private List<Ciudad> itemCiudad = null;

    public Ciudad getSelectedCiudad() {
        if (selectedCiudad == null) {
            selectedCiudad = new Ciudad();
        }
        return selectedCiudad;
    }

    public void setSelectedCiudad(Ciudad selectedCiudad) {
        this.selectedCiudad = selectedCiudad;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public CiudadSession getCiudadSessions() {
        return ciudadSessions;
    }

    public List<Ciudad> getItemCiudad() {

        if (itemCiudad == null) {
            try {
                itemCiudad = getCiudadSessions().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemCiudad;
    }

    public void create() {
        try {
            selectedCiudad.setDepartamento(new Departamentos(idDepartamento));
            getCiudadSessions().create(selectedCiudad);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void remove() {
        try {
            getCiudadSessions().remove(selectedCiudad);
            itemCiudad = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
