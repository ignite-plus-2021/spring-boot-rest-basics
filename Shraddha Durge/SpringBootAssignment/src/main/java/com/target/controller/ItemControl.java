package com.target.controller;

import com.target.model.ItemModel;
import com.target.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ItemControl {
    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    @ResponseBody
    public List<ItemModel> getAllItems(){
        return itemService.getAllItems();

    }

    @PostMapping("/items")
    @ResponseBody
    public String addItem(@RequestBody ItemModel item) {
        return itemService.addItem(item);
    }


    @GetMapping("/items/{id}")
    @ResponseBody
    public String getItemName(@RequestBody ItemModel item)
    {
        List<Item> x=itemService.getItemName(item);
        return x.get(0).getName();
    }

    @PutMapping("/items")
    @ResponseBody
    public String updateItem(@RequestBody ItemModel item)
    {
        return itemService.updateItem(item);
    }

    @DeleteMapping("/items")
    @ResponseBody
    public String deleteItem(@RequestBody ItemModel item)
    {
        return itemService.deleteItem(item);
    }
}
