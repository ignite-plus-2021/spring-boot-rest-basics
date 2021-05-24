package com.example.springboot_assignment.model;


import javax.persistence.*;

@Entity
@Table
public class Item {

    @Id
    @Column
    private  Integer  id;
    @Column
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}