package com.target.ignitePlus.service;

import com.target.ignitePlus.model.ItemModel;
import com.target.ignitePlus.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<ItemModel> getAllItems() {
        return itemRepository.getAllItems();
    }


    public String addItem(ItemModel item) {
        if (itemRepository.addItem(item.getId(), item.getName()) == 1) {
            return "ITEM ADDED!";
        } else {
            return "Unable to add item!";
        }
    }

    public List<ItemModel> getItemName(ItemModel item) {
        return itemRepository.getItemName(item.getId());
    }


    public String updateItem(@RequestBody ItemModel item)
    {
        if(itemRepository.updateItem(item.getId(),item.getName())==1)
            return "ITEM UPDATED!";

        else
            return "Unable to update item!";
    }


    public String deleteItem(ItemModel item) {

        if(itemRepository.deleteItem(item.getId())==1)
            return "ITEM DELETED!";
        else
            return "Unable to delete item!";
    }
}
