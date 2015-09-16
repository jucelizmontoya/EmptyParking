
package com.example.jpa.sessions;

import com.example.jpa.entities.Servicios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class ServiciosSession {

@PersistenceContext
   
   private EntityManager entityManager;
   
   public void create (Servicios servicio){
       entityManager.persist(servicio);
   }
   
   public void edit (Servicios servicio){
       entityManager.merge(servicio);
   }
   
   public void remove (Servicios servicio){
       entityManager.remove(servicio);
   }
   
   public List<Servicios> findAll(){
       CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
       cq.select(cq.from(Servicios.class));
       return entityManager.createQuery(cq).getResultList();
   }
}
