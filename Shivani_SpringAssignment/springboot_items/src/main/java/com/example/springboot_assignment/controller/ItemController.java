package com.example.springboot_assignment.controller;

import com.example.springboot_assignment.model.Item;
import com.example.springboot_assignment.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService allservice;

    @GetMapping("/items")
    public List<Item> getItems(){
        return allservice.getItems();
    }

    @GetMapping("/items/{id}")
    public Item getById(@PathVariable("id") Integer id){
        return allservice.getItemById(id);
    }

    @PostMapping("/items")
    public String addItem(@RequestBody Item item){
        return allservice.addItem(item);
    }

    @PutMapping("/items/{id}")
    public List<Item> updateItem(@RequestBody Item item, @PathVariable("id") Integer id){
        return allservice.updateItem(item,id);
    }

    @DeleteMapping("/items/{id}")
    public List<Item> deleteItem(@PathVariable("id") Integer id){
        return allservice.deleteItem(id);
    }

}
