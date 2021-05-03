package com.target.igniteplus.repository;

import com.target.igniteplus.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // Getting all the items from Item table
    public List<Item> getAllItems() {

        String query = "SELECT * FROM ITEM ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Item.class));

    }



    public List<Item> getOneItem(int id) {

        String query = "SELECT * FROM ITEM WHERE ID=?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Item.class),id);

    }

    // aad items in DB.
    public int additem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.update(query, id, name);
    }


    public int updateitem(int id, String name) {
        String query = "UPDATE ITEM SET NAME=? WHERE ID=?;";
        return jdbcTemplate.update(query, name, id);
    }

    public int deleteitem(int id){
        String query= "DELETE ITEM WHERE ID=?;";
                return jdbcTemplate.update(query,id);
    }


}