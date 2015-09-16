package com.example.jpa.entities;

import com.example.jpa.entities.Departamentos;
import com.example.jpa.entities.Sedes;
import com.example.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile ListAttribute<Ciudad, Sedes> sedes;
    public static volatile SingularAttribute<Ciudad, Departamentos> Departamento;
    public static volatile ListAttribute<Ciudad, Usuarios> usuarios;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudad;
    public static volatile SingularAttribute<Ciudad, String> nombreciudad;

}