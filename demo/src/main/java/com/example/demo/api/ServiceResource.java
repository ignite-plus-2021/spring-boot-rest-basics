package com.example.demo.api;

import com.example.demo.Service.ItemService;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/items")
public class ServiceResource
{
    @Autowired
    private ItemService itemService;
    @PostMapping
    public Item addItem(@RequestBody Item item)
    {
        return itemService.addItem(item);
    }
    @GetMapping
    public List<Item> getItem()
    {
        return itemService.getItem();
    }
    @GetMapping(value="/{itemNum}")
    public Item getItem(@PathVariable("itemNum") int itemNum)
    {
        return itemService.getItem(itemNum);
    }
    @PutMapping(value="/{itemNum}")
    public Item updateItem(@PathVariable("itemNum")int itemNum,@RequestBody Item item)
    {
        return itemService.updateItem(itemNum,item);
    }
    @DeleteMapping(value="/{itemNum}")
    public void deleteItem(@PathVariable("itemNum")int itemNum)
    {
        itemService.deleteItem(itemNum);
    }
    
}
