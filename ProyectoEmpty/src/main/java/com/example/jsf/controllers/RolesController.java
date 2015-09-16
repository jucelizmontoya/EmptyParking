
package com.example.jsf.controllers;

import com.example.jpa.entities.Roles;
import com.example.jpa.sessions.RolesSession;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


@ManagedBean
@ViewScoped
public class RolesController {

      @EJB
        private RolesSession rolesSession;
        private Roles selectedRoles;
        private List<Roles>itemsRoles = null;
    
    public RolesController() {
    }
    
    
     public Roles getSelectedRoles() {
        if (selectedRoles == null){
            selectedRoles = new Roles ();
        }
        return selectedRoles;
    }

    public void setSelectedRoles(Roles selectedRoles) {
        this.selectedRoles = selectedRoles;
    }
    
    public RolesSession getRolesSession(){
        return rolesSession;
    }

    public List<Roles> getItemsRoles() {
        if (itemsRoles == null) {
            try{
                itemsRoles = getRolesSession().findAll();
            }catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsRoles;
    }
           public void create (){
    
   try{
       getRolesSession().create(selectedRoles);
   } catch (Exception ex){
       System.err.println(ex.getMessage());
   }
}
    
}
