package com.example.springboot_assignment.service;

import com.example.springboot_assignment.model.Item;
import com.example.springboot_assignment.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemsrepo;

    public List<Item> getItems(){
        return itemsrepo.findAll();
    }

    public Item getItemById(Integer id){
        return itemsrepo.findById(id)
                .orElseThrow();
    }

    public String addItem(Item item){
        itemsrepo.save(item);
        return "Item added successfully";
    }

    public List<Item> updateItem(Item item, Integer id){
        Item i = itemsrepo.findById(id)
                .orElseThrow();
        i.setName(item.getName());
        itemsrepo.save(i);
        return itemsrepo.findAll();
    }

    public List<Item> deleteItem(Integer id){
        itemsrepo.deleteById(id);
        return itemsrepo.findAll();
    }
}
