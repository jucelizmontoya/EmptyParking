
package com.example.jpa.sessions;

import com.example.jpa.entities.Sedes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class SedesSession {

@PersistenceContext
    
    private EntityManager entitymanager;
    
    public void create (Sedes sedes){
       
        entitymanager.persist(sedes);
    }
    
    public void edit (Sedes sedes){
        entitymanager.merge(sedes);
    }
    
    public void remove (Sedes sedes){
        entitymanager.remove(sedes);
    }
    
    
    public List<Sedes> findAll(){
        CriteriaQuery cq= entitymanager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Sedes.class));
        return entitymanager.createQuery(cq).getResultList();
    }

}
