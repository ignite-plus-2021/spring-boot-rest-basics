package com.apirest.apirest.entity;

public class Items {
    private long id;
    private String item;

    public Items(long id, String item) {
        super();
        this.id = id;
        this.item = item;
    }
    public Items(){
        super();

    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getItem(){
        return item;
    }
    public void setItem(String item){
        this.item =item;
    }
    @Override
    public String toString() {
        return "Items[id="+id+",item="+ item +"]";

    }
}
