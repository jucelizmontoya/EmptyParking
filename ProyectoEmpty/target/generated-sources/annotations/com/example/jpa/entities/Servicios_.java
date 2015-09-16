package com.example.jpa.entities;

import com.example.jpa.entities.Calificaciones_Servicio;
import com.example.jpa.entities.Tipos_Servicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> nombreServicio;
    public static volatile SingularAttribute<Servicios, String> descripcion;
    public static volatile ListAttribute<Servicios, Calificaciones_Servicio> calificacionesServicios;
    public static volatile SingularAttribute<Servicios, Double> valor;
    public static volatile SingularAttribute<Servicios, String> idServicios;
    public static volatile SingularAttribute<Servicios, Tipos_Servicio> idTipoServicio;

}