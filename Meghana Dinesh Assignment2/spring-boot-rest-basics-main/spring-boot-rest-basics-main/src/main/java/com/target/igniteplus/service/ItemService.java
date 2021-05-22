package com.target.igniteplus.service;

import com.target.igniteplus.model.Item;
import com.target.igniteplus.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems()
    {
        return itemRepository.getAllItems();
    }

    public List<Item> getItem(int id)
    {
        return itemRepository
                .getItem(id);
    }

    public String addItem(Item item)
    {
        if (itemRepository.additem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "Something is wrong!";
        }

    }
    public String updateItem(Item item)
    {
        if (itemRepository.updateItem(item.getId(), item.getName()) == 1) {
            return "Item updated successfully!";
        } else {
            return "Something is wrong!";
        }
    }
    public String deleteItem(int id)
    {
        if(itemRepository.deleteItem(id)==1){
            return "Item deleted successfully";

            }
        else{
            return "Something went wrong";
        }
    }
}
