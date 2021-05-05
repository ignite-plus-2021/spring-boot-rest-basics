package com.target.igniteplus.model;

public class Item {
    private int id;
    private String Iname;

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.Iname = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Iname;
    }

    public void setName(String name) {
        this.Iname = name;
    }
}
