package com.choqnet.drops.entity.business;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "DROPS_PORTFOLIO")
@Entity(name = "drops_Portfolio")
@NamePattern("%s|name")
public class Portfolio extends BaseUuidEntity {
    private static final long serialVersionUID = 6798572486423337867L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KEY_")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}