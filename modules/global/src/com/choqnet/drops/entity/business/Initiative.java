package com.choqnet.drops.entity.business;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "DROPS_INITIATIVE")
@Entity(name = "drops_Initiative")
@NamePattern("%s|name")
public class Initiative extends BaseUuidEntity {
    private static final long serialVersionUID = 1438659623332090994L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KEY_")
    private String key;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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