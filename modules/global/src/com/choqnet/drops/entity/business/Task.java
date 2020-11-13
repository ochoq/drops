package com.choqnet.drops.entity.business;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "DROPS_TASK")
@Entity(name = "drops_Task")
@NamePattern("%s|name")
public class Task extends BaseUuidEntity {
    private static final long serialVersionUID = 471883977083436080L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KEY_")
    private String key;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EPIC_ID")
    private Epic epic;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Task parent;

    public Task getParent() {
        return parent;
    }

    public void setParent(Task parent) {
        this.parent = parent;
    }

    public Epic getEpic() {
        return epic;
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
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