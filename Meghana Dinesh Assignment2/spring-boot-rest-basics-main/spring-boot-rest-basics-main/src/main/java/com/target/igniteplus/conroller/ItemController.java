package com.target.igniteplus.conroller;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/items")
public class ItemController {

    // Get all the items from DB.

    @Autowired
    ItemService itemService;

    @GetMapping
    @ResponseBody
    public List<Item> getAllItems()
    {
        return itemService.getAllItems();
    }
    @GetMapping(value="{id}")
    public List<Item> getItem(@PathVariable("id")int id)
    {
        return itemService.getItem(id);
    }
    @PutMapping
    public String updateItem(@RequestBody Item item){
        return itemService.updateItem(item);
    }
    @DeleteMapping(value="{id}")
    public String deleteItem(@PathVariable("id")int id)
    {
        return itemService.deleteItem(id);
    }
    @PostMapping
    @ResponseBody
    public String addItem(@RequestBody Item item){
       return itemService.addItem(item);
    }


}
