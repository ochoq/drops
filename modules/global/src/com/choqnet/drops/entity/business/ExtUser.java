package com.choqnet.drops.entity.business;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "drops_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = -3309474503279136660L;
}