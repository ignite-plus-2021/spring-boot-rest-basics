package com.example.demo.Service;

import com.example.demo.dao.ItemDAO;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class ItemService
{
    @Autowired
    private ItemDAO itemDAO;

    private List<Item> itemList= new CopyOnWriteArrayList<>();
    public Item addItem(Item item)
    {

        return itemDAO.save(item);
    }
    public List<Item> getItem()
    {
        return itemDAO.findAll();
    }
    public Item getItem(int itemNum)
    {
        return (Item) itemDAO.findById(itemNum).get();
    }
    public Item updateItem(int itemNum,Item item)
    {
        item.setItemNum(itemNum);
        return itemDAO.save(item);
    }
    public void deleteItem(int itemNum)
    {
        itemDAO.deleteById(itemNum);
    }
}
