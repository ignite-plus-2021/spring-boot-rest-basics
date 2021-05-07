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

    // aad items in DB.
    public int addItem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.update(query, id, name);
    }

    public List<Item> getItemName(int id) {
        String query = "SELECT NAME FROM ITEM WHERE ID=?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Item.class));
    }




    public int updateItem(int id, String name)
    {
        String query="UPDATE ITEM SET NAME=? WHERE ID=?";
        return jdbcTemplate.update(query,name,id);
    }

    public int deleteItem(int id)
    {
        String query="DELETE ITEM WHERE ID=?";
        return jdbcTemplate.update(query,id);
    }

}


/* Create a GET endpoint by which I can pull the name of an Item providing the item id as input.
2. Create a PUT endpoint by which I can update the name of a specific Item.
3. Crate a DELETE endpoint by which I can delete an item.
4. In this project, we have used the name of data members(id, name),same as the columns of the Database.
   If I use different names in the data member( e.g: ItemName instead of name ), will I be able to pull the data from Database?
       i. If yes, how?
       i.If no, why ?*/