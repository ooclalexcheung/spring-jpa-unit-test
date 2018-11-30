package com.oocl.web.sampleWebApp;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
public class SingleEntity {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(length = 10)
    public String name;

}
