package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public List<Item> getallItems(){
        return itemService.getallItems();
    }

    @RequestMapping("/item/{itemid}")
    public Item getitemById(int itemid){return itemService.getItemById(itemid); }

    @RequestMapping(value="/add-item",method = RequestMethod.POST)
    public void addItem(@RequestBody Item item){
        itemService.addUser(item);
    }

    @RequestMapping(value = "/update-item",method = RequestMethod.PUT)
    public void update(@RequestBody Item item){itemService.update(item);}

    @RequestMapping(value = "/delete-item",method = RequestMethod.DELETE)
    public void delete(@RequestBody Item item){itemService.delete(item);}


}
