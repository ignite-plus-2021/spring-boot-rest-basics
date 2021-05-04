package repository;

import model.Item;
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
    public int additem(int id, String name) {

        String query = "INSERT INTO ITEM VALUES(?,?)";
        return jdbcTemplate.update(query, id, name);
    }

    public int updateItem(int id, String name) {
     String query = "UPDATE ITEM SET NAME=? WHERE ID=?;";
     return jdbcTemplate.update(query,name,id);
    }

    public int deleteItem(int id) {
        String query = "DELETE ITEM WHERE ID=?;";
        return jdbcTemplate.update(query,id);
    }
}

