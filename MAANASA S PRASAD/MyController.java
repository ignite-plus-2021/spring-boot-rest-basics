package com.apirest.apirest.controller;


import com.apirest.apirest.entity.Items;
import com.apirest.apirest.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private ItemService itemserve;



    @GetMapping("/Items")
public List<Items> getItems(){
        return this.itemserve.getItems();
    }

    @GetMapping("/Items/{itemId}")
    public Items getItems(@PathVariable String itemId)
    {
        return this.itemserve.getItems(Long.parseLong(itemId));
    }

    @PostMapping("/Items")
    public Items addItems(@RequestBody Items item)
    {
        return this.itemserve.addItems(item);
    }

    @PutMapping("/Items")
    public Items updateItems(@RequestBody Items item)
    {
        return this.itemserve.updateItems(item);
    }

    @DeleteMapping("/Items/{itemId}")
    public ResponseEntity<HttpStatus> deleteItems(@PathVariable String itemId)
    {
        try{
            this.itemserve.deleteItems(Long.parseLong(itemId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
