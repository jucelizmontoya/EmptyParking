
package com.example.jpa.sessions;

import com.example.jpa.entities.Calificaciones_Servicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class CalificacionesServicioSession {
    
    @PersistenceContext
    
    EntityManager entitymanager;
    
    public void create (Calificaciones_Servicio calificacionesservicio){
        
        entitymanager.persist(calificacionesservicio);
    }
    
    public void edit (Calificaciones_Servicio calificacionesservicio){
        entitymanager.merge(calificacionesservicio);
    }
    
    public void remove (Calificaciones_Servicio calificacionesservicio){
        entitymanager.remove(calificacionesservicio);
    }
    
    public List<Calificaciones_Servicio> findAll(){
        
        CriteriaQuery cq= entitymanager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Calificaciones_Servicio.class));
        return entitymanager.createQuery(cq).getResultList();
    }


    
}
