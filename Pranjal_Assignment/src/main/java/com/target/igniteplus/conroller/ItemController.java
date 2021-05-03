package com.target.igniteplus.conroller;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/items/getname")
    @ResponseBody
    public List<Item> getItemName(@RequestBody int id){
        return itemService.getItemName(id);

    }

    @PutMapping("/items/update")
    @ResponseBody
    public String updateItemName(@RequestBody Item item){
        return itemService.updateItemName(item);

    }

    @PostMapping("/items/additem")
    @ResponseBody
    public String addItem(@RequestBody Item item){
       return itemService.addItem(item);

    }

    @DeleteMapping("/items/delete")
    @ResponseBody
    public String deleteItem(@RequestBody Item item){
        return itemService.deleteItem(item);
    }


}
