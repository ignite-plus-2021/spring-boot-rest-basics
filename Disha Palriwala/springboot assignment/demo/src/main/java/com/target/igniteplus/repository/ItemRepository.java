package com.target.ignitePlus.repository;

import com.target.ignitePlus.model.ItemModel;
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
    public List<ItemModel> getAllItems() {

        String query = "SELECT * FROM ITEM ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(ItemModel.class));

    }

    // aad items in DB.
    public int addItem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.update(query, id, name);
    }

    //FETCHING DETAILS
    public List<ItemModel> getItemName(int id) {
        String query = "SELECT NAME FROM ITEM WHERE ID=?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(ItemModel.class));
    }



    //UPDATING ITEMS IN DB
    public int updateItem(int id, String name)
    {
        String query="UPDATE ITEM SET NAME=? WHERE ID=?";
        return jdbcTemplate.update(query,name,id);
    }


    //DELETE ITEM
    public int deleteItem(int id)
    {
        String query="DELETE ITEM WHERE ID=?";
        return jdbcTemplate.update(query,id);
    }
}
