package com.example.jpa.entities;

import com.example.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-16T11:21:56")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> idrol;
    public static volatile SingularAttribute<Roles, String> nombrerol;
    public static volatile ListAttribute<Roles, Usuarios> usuarios;

}