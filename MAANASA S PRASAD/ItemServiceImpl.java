package com.apirest.apirest.services;

import com.apirest.apirest.entity.Items;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    List<Items> list;
    public ItemServiceImpl(){
        list=new ArrayList<>();
        list.add(new Items(2131,"Apple"));
        list.add(new Items(4562,"Orange"));
        list.add(new Items(1283,"Kiwi"));
    }

    @Override
    public List<Items> getItems() {
        return list;
    }



    }
