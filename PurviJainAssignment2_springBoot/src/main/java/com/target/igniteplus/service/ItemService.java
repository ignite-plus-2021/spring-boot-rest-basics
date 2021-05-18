package com.target.igniteplus.service;

import ch.qos.logback.core.joran.spi.ElementSelector;
import com.target.igniteplus.model.Item;
import com.target.igniteplus.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }


    public String addItem(Item item) {
        if (itemRepository.addItem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "oops.....Something is wrong!";
        }
    }

        public List<Item> getItemName(Item item) {
            return itemRepository.getItemName(item.getId());
        }


    public String updateItem(@RequestBody Item item)
    {
         if(itemRepository.updateItem(item.getId(),item.getName())==1)
             return "ITEM UPDATED SUCESSFULLY";

        else
            return "oops.....Something is wrong!";
    }


    public String deleteItem(Item item) {

        if(itemRepository.deleteItem(item.getId())==1)
            return "ITEM DELETED SUCESSFULLY";
        else
            return "oops.....Something is wrong!";
    }
}

