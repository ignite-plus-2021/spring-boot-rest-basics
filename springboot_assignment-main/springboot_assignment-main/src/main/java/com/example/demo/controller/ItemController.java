package com.example.demo.controller;
import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    // Get all the items from DB.

    @Autowired
    ItemService itemService;


    @GetMapping("/items/getItems")

    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    //get using id
    @GetMapping("/items/{id}")
    @ResponseBody
    public List<Item> getItemName(@PathVariable("id") int id) {
        return itemService.getItemName(id);
    }



    @PutMapping("/items")
    @ResponseBody
    public Item updateItemName(@RequestBody Item item){
        itemService.updateItemName(item);
        return item;
    }




    @PostMapping("/items")
    @ResponseBody
    public List<Item> addItem(@RequestBody Item item){
        return itemService.addItem(item);

    }
    @DeleteMapping("/items/{id}")
    @ResponseBody
    public String deleteItem(@PathVariable int id){

        itemService.deleteItem(id);
        return "Deleted";

    }

}