package com.target.repository;

import com.target.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //Get all items 
    public List<ItemModel> getAllItems() {

        String query = "SELECT * FROM ITEM ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(ItemModel.class));

    }

    //Add items
    public int addItem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.update(query, id, name);
    }

    //Fetch details
    public List<ItemModel> getItemName(int id) {
        String query = "SELECT NAME FROM ITEM WHERE ID=?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(ItemModel.class));
    }



    //Update item
    public int updateItem(int id, String name)
    {
        String query="UPDATE ITEM SET NAME=? WHERE ID=?";
        return jdbcTemplate.update(query,name,id);
    }


    //Delete item
    public int deleteItem(int id)
    {
        String query="DELETE ITEM WHERE ID=?";
        return jdbcTemplate.update(query,id);
    }
}
