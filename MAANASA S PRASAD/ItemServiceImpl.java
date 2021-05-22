package com.apirest.apirest.services;

import com.apirest.apirest.entity.Items;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ItemServiceImpl implements ItemService{

    List<Items> list;
    public ItemServiceImpl(){
        list=new ArrayList<>();
        list.add(new Items(2131, "Apple"));
        list.add(new Items(4562,"Orange"));
        list.add(new Items(1283,"Kiwi"));
    }



    @Override
    public List<Items> getItems() {
        return list;
    }

    @Override
    public Items getItems(long itemId)
    {
        Items c=null;
        for(Items item:list)
        {
            if(item.getId()==itemId)
            {
                c=item;
                break;
            }
        }
        return c;
    }

    @Override
    public Items addItems(Items item)
    {
        list.add(item);
        return item;
    }

    @Override
    public Items updateItems(Items item)
    {
        list.forEach(e ->{
            if(e.getId()==item.getId())
            {
                e.setItem(item.getItem());

            }
        });
        return item;
    }

    @Override
    public void deleteItems(long parseLong)
    {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

    }


}




