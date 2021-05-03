package com.ignite.assignment.service;

import com.ignite.assignment.model.Item;
import com.ignite.assignment.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;

    public List<Item> getAllItems() {

        return itemRepo.getAllItems();
    }
    public List<Item> getOneItem(Item item) {
        return itemRepo.getOneItem(item.getId());
    }

    public String addItem(Item item) {
        if (itemRepo.additem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "Something is wrong!";
        }

    }

    public String updateItem(Item item) {
        if(itemRepo.updateitem(item.getId(),item.getName()) ==1) {
            return "Item updated successfully!";
        }
        else{
            return "Something's wrong!";
        }
    }

    public String deleteItem(Item item){
        if(itemRepo.deleteitem(item.getId()) ==1){
            return "Item deleted!";
        }
        else{
            return "Something's wrong!";
        }
    }
}
