package com.target.igniteplus.service;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }



    public List<Item> getOneItem(Item item) {

        return itemRepository.getOneItem(item.getId());
    }

    public String addItem(Item item) {
        if (itemRepository.additem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "Somthing is wrong!";
        }


    }

    public String updateItem(Item item) {
        if(itemRepository.updateitem(item.getId(),item.getName()) ==1) {
            return "Item updated successfully!";
        }
        else{
            return "Something's wrong!";
        }
    }

    public String deleteItem(Item item){
        if(itemRepository.deleteitem(item.getId()) ==1){
            return "Item updated successfully!";
        }
        else{
            return "Something's wrong!";

        }
    }
}
