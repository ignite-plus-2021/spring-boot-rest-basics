package com.example.demo.repository;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository  {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Getting all the items from Item table
    public List<Item> getAllItems() {

        String query = "SELECT * FROM ITEM ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Item.class));

    }
    public List<Item> getItemName(int id){
        String query = "SELECT * FROM ITEM WHERE ID = ?";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper(Item.class),id);
    }

    // aad items in DB.
    public List<Item> addItem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper(Item.class), id, name);
    }

    //update item name in DB
    public List<Item> updateItemName(String name,int id) {
        String query = "UPDATE ITEM SET NAME=? WHERE ID=?";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper(Item.class), name, id);
    }


    public int deleteItem(int id){
        String query= "DELETE ITEM WHERE ID=?";
        return jdbcTemplate.update(query,id);
    }
}