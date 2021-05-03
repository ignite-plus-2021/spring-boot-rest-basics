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

    public List<Item> getItemName(int id){
        return itemRepository.getItemName(id);
    }

    public String updateItemName(Item item) {
        if (itemRepository.updateItemName( item.getName(),item.getId()) == 1) {
            return "Item Updated successfully!";
        } else {
            return "Something is wrong!";
        }
    }

    public String addItem(Item item) {
        if (itemRepository.additem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "Something is wrong!";
        }

    }

    public String deleteItem(Item item){
        if(itemRepository.deleteItem(item.getId()) ==1){
            return "Item deleted successfully!";
        }
        else{
            return "Something's wrong!";

        }
    }
}
