/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controllers;

import com.example.jpa.entities.Ciudad;
import com.example.jpa.entities.Departamentos;
import com.example.jpa.entities.Roles;
import com.example.jpa.entities.Usuarios;
import com.example.jpa.sessions.UsuariosSession;
import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author julio
 */
@ManagedBean
@ViewScoped
public class UsuariosController implements Serializable{
    
     @EJB
    private UsuariosSession usuarioSession;

    private Usuarios selectedUsuario;
    private int idCiudad;
    private int idDepartamento;
    private String idRol;
    private List<Usuarios> itemsUsuario = null;

    /**
     * Creates a new instance of UsuarioController
     */
    public UsuariosController() {
    }

    public Usuarios getSelectedUsuario() {
        if (selectedUsuario == null) {
            selectedUsuario = new Usuarios();
        }
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuarios selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public String getCiudad() {
        return idCiudad + "," + idDepartamento;
    }

    public void setCiudad(String ciudad) {
        StringTokenizer tokens = new StringTokenizer(ciudad, ",");
        idCiudad = Integer.parseInt(tokens.nextToken());
        idDepartamento = Integer.parseInt(tokens.nextToken());
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public UsuariosSession getUsuarioSession() {
        return usuarioSession;
    }

    public List<Usuarios> getItemsUsuario() {
        if (itemsUsuario == null) {
             try {
                itemsUsuario = getUsuarioSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuario;
    }

    public void create(){
        try {
            selectedUsuario.setIdciudad(new Ciudad(idCiudad, new Departamentos(idDepartamento)));
            selectedUsuario.setIdrol(new Roles(idRol));
            getUsuarioSession().create(selectedUsuario);
        } catch (Exception ex) {
             System.err.println(ex.getMessage());
        }
    }

   
    
    
}
