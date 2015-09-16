
package com.example.jpa.sessions;

import com.example.jpa.entities.Tipos_Servicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class TiposServicioSession {

 @PersistenceContext
    private EntityManager entityManager;
    
    public void create (Tipos_Servicio tiposservicio){
        entityManager.persist(tiposservicio);
    }
    
    public void edit (Tipos_Servicio tiposservicio){
        entityManager.merge(tiposservicio);
    }
    
    public void remove (Tipos_Servicio tiposservicio){
        entityManager.remove(tiposservicio);
    }
    
    public List<Tipos_Servicio> findAll () {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Tipos_Servicio.class));
        return entityManager.createQuery(cq).getResultList();
        
    }
}
