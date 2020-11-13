package com.choqnet.drops.entity.business;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "DROPS_PROJECT")
@Entity(name = "drops_Project")
@NamePattern("%s|name")
public class Project extends BaseUuidEntity {
    private static final long serialVersionUID = -8026340981311820510L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "UID_")
    private String key;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PORTFOLIO_ID")
    private Portfolio portfolio;

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
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