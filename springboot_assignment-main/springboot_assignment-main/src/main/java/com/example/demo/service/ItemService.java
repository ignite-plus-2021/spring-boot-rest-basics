package com.example.demo.service;
import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
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
    public List<Item> updateItemName(Item item) {

        return itemRepository.updateItemName(item.getName(),item.getId());
    }

    public List<Item> addItem(Item item) {
        return  itemRepository.addItem(item.getId(), item.getName());
    }

    public void deleteItem(int id){
        itemRepository.deleteItem(id);
    }
}