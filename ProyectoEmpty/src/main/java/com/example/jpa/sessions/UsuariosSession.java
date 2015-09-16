
package com.example.jpa.sessions;

import com.example.jpa.entities.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class UsuariosSession {
@PersistenceContext
    
    EntityManager entitymanager;
    
    public void create (Usuarios usuarios){
        
        entitymanager.persist(usuarios);
        
    }

    public void edit (Usuarios usuarios){
        entitymanager.merge(usuarios);
        
    }
    
    public void remove (Usuarios usuarios){
        entitymanager.remove(usuarios);
    }
    
    public List<Usuarios> findAll (){
        CriteriaQuery cq= entitymanager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuarios.class));
        return entitymanager.createQuery(cq).getResultList();
    }
 
  
}
