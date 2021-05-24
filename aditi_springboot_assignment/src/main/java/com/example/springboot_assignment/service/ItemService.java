package com.example.springboot_assignment.service;

import com.example.springboot_assignment.model.Item;
import com.example.springboot_assignment.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository repo;

    public List<Item> getItems(){
        return repo.findAll();
    }

    public Item getItemById(Integer id){
        return repo.findById(id)
                .orElseThrow();
    }

    public String addItem(Item item){
        repo.save(item);
        return "Item added successfully";
    }

    public List<Item> updateItem(Item item, Integer id){
        Item i = repo.findById(id)
                .orElseThrow();
        i.setName(item.getName());
        repo.save(i);
        return repo.findAll();
    }

    public List<Item> deleteItem(Integer id){
        repo.deleteById(id);
        return repo.findAll();
    }
}
