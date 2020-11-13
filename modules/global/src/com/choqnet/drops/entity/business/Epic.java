package com.choqnet.drops.entity.business;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "DROPS_EPIC")
@Entity(name = "drops_Epic")
@NamePattern("%s|name")
public class Epic extends BaseUuidEntity {
    private static final long serialVersionUID = 7517276339970372538L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KEY_")
    private String key;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INITIATIVE_ID")
    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    private Initiative initiative;

    public Initiative getInitiative() {
        return initiative;
    }

    public void setInitiative(Initiative initiative) {
        this.initiative = initiative;
    }

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