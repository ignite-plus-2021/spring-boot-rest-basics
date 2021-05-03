package com.ignite.assignment.repository;

import com.ignite.assignment.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Item> getAllItems() {
        String query = "SELECT * FROM ITEM ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Item.class));

    }
    public List<Item> findById(int id) {

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