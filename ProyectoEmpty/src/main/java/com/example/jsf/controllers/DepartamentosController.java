
package com.example.jsf.controllers;

import com.example.jpa.entities.Departamentos;

import com.example.jpa.sessions.DepartamentosSession;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class DepartamentosController {
    
    @EJB
  private DepartamentosSession departamentoSessions;
  private Departamentos selectedDepartamento;
  private List<Departamentos> itemDepartamento = null;
  
   
    
  

    public Departamentos getSelectDepartamento() {
        if (selectedDepartamento == null){
            selectedDepartamento= new Departamentos();
        }
        return selectedDepartamento;
    }

    public void setSelectDepartamento(Departamentos selectDepartamento) {
        this.selectedDepartamento = selectDepartamento;
    }

    public DepartamentosSession getDepartamentoSessions() {
        return departamentoSessions;
    }

    public List<Departamentos> getItemDepartamento() {
        
        if (itemDepartamento == null){
            try{
                itemDepartamento=getDepartamentoSessions().findAll();
            }catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemDepartamento;
    }
    
    
public void create (){
    
    try{
        
        getDepartamentoSessions().create(selectedDepartamento);
    }catch (Exception ex){
        System.err.println(ex.getMessage());
    }
}
    
}
