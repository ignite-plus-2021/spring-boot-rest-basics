package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getallItems(){
        List<Item> items=new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    public Item getItemById(int itemid){
        return itemRepository.findById(itemid).get();
    }

    public void addUser(Item item){
        itemRepository.save(item);
    }

    public void update(Item item){
        itemRepository.save(item);
    }

    public void delete(Item item){
        itemRepository.delete(item);}




}
