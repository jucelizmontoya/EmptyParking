package com.example.jpa.entities;

import com.example.jpa.entities.Servicios;
import com.example.jpa.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Calificaciones_Servicio.class)
public class Calificaciones_Servicio_ { 

    public static volatile SingularAttribute<Calificaciones_Servicio, Date> fecha;
    public static volatile SingularAttribute<Calificaciones_Servicio, Servicios> servicio;
    public static volatile SingularAttribute<Calificaciones_Servicio, Byte> puntuacion;
    public static volatile SingularAttribute<Calificaciones_Servicio, Usuarios> usuario;
    public static volatile SingularAttribute<Calificaciones_Servicio, String> comentario;

}