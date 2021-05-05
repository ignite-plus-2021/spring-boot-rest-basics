package com.target.igniteplus.conroller;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.repository.ItemRepository;
import com.target.igniteplus.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    // Get all the items from DB.

    @Autowired
    ItemService itemService;



    @GetMapping("/items")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItems();

    }

    @GetMapping("/items/{id}")
    @ResponseBody
    public String getItems(@RequestBody Item item){
        List<Item> getItem=itemService.getItem(item);
        return getItem.get(0).getName();

    }

    @PostMapping("/items")
    @ResponseBody
    public String addItem(@RequestBody Item item){
       return itemService.addItem(item);

    }


    @PutMapping("/items")
    @ResponseBody
    public String updateItem(@RequestBody Item item)
    {
        return itemService.updateItem( item);
    }

    @DeleteMapping("/items")
    @ResponseBody
    public String deleteItem(@RequestBody Item item) {
        return itemService.deleteItem(item);
    }




}
