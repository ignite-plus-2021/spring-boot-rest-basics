package com.ignite.assignment.controller;

import com.ignite.assignment.model.Item;
import com.ignite.assignment.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItems();

    }
    @GetMapping("/items/{id}")
    @ResponseBody
    public String getOneItem(@RequestBody Item item){
        List<Item> x=itemService.getOneItem(item);
        return x.get(0).getName();

    }
    @PostMapping("/items")
    @ResponseBody
    public String addItem(@RequestBody Item item){
        return itemService.addItem(item);

    }
    @PutMapping("/items")
    @ResponseBody
    public String updateItem(@RequestBody Item item){
        return itemService.updateItem(item);
    }

    @DeleteMapping("/items")
    @ResponseBody
    public String deleteItem(@RequestBody Item item){
        return itemService.deleteItem(item);
    }

}
