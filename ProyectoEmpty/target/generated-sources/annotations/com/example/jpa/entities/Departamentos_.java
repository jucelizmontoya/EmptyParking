package com.example.jpa.entities;

import com.example.jpa.entities.Ciudad;
import com.example.jpa.entities.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamentos, Pais> idpais;
    public static volatile SingularAttribute<Departamentos, Integer> idDepartamentos;
    public static volatile ListAttribute<Departamentos, Ciudad> ciudades;

}