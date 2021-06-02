package com.target.service;

import ch.qos.logback.core.joran.spi.ElementSelector;
import com.target.model.ItemModel;
import com.target.repository.ItemRepository;
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
            return "Item added successfully!";
        } else {
            return "oops.....Something is wrong!";
        }
    }

    public List<ItemModel> getItemName(ItemModel item) {
        return itemRepository.getItemName(item.getId());
    }


    public String updateItem(@RequestBody ItemModel item)
    {
        if(itemRepository.updateItem(item.getId(),item.getName())==1)
            return "ITEM UPDATED SUCESSFULLY";

        else
            return "oops.....Something is wrong!";
    }


    public String deleteItem(ItemModel item) {

        if(itemRepository.deleteItem(item.getId())==1)
            return "ITEM DELETED SUCESSFULLY";
        else
            return "oops.....Something is wrong!";
    }
}
