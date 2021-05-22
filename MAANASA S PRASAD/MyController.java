package com.apirest.apirest.controller;


import com.apirest.apirest.entity.Items;
import com.apirest.apirest.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private ItemService itemserve;



    @GetMapping("/Items")
public List<Items> getItems(){
        return this.itemserve.getItems();
    }

}
