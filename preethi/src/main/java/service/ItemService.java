package service;

import model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public String addItem(Item item) {
        if (itemRepository.additem(item.getId(), item.getName()) == 1) {
            return "Item added successfully!";
        } else {
            return "Somthing is wrong!";
        }

    }

    public String updateItem(Item item) {
        if(itemRepository.updateItem(item.getId(),item.getName()) == 1){
            return "Item updated sucessfully!";
        }
        else{
            return "Something is wrong";
        }
    }

    public String deleteItem(Item item) {
        if(itemRepository.deleteItem(item.getId())==1){
            return "item deleted sucessfully!";
        }
        else {
            return "Something is wrong";
        }
    }
}
