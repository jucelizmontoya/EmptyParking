package com.example.jpa.entities;

import com.example.jpa.entities.Departamentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> idPais;
    public static volatile ListAttribute<Pais, Departamentos> departamento;
    public static volatile SingularAttribute<Pais, String> nombrePais;

}