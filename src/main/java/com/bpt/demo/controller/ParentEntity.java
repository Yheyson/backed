package com.bpt.demo.controller;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Access(AccessType.FIELD)

public class ParentEntity implements Serializable {

    private static final long serialVersionUID = -156317774386992764L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true,nullable = false)
    private long id;
}
