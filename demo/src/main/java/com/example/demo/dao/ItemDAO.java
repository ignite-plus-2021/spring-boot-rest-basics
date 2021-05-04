package com.example.demo.dao;

import com.example.demo.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDAO extends CrudRepository<Item,Integer>
{
    @Override
    List<Item> findAll();
}
