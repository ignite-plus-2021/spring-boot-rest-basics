package com.target.igniteplus.conroller;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItems();

    }

    @PostMapping("/items")
    @ResponseBody
    public String addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }


       @GetMapping("/items/{id}")
       @ResponseBody
       public String getItemName(@RequestBody Item item)
       {
           List<Item> x=itemService.getItemName(item);
            return x.get(0).getName();
        }

        @PutMapping("/items")
        @ResponseBody
        public String updateItem(@RequestBody Item item)
        {
            return itemService.updateItem(item);
        }

        @DeleteMapping("/items")
       @ResponseBody
        public String deleteItem(@RequestBody Item item)
        {
            return itemService.deleteItem(item);
        }


}
