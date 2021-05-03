package com.target.igniteplus.model;

public class Item {
    private int id;
    private String changedName;

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.changedName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return changedName;
    }

    public void setName(String name) {
        this.changedName = name;
    }
}
