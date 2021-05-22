package com.apirest.apirest.services;

import com.apirest.apirest.entity.Items;

import java.util.List;

public interface ItemService {
    public List<Items> getItems();
    public Items getItems(long itemId);
    public Items addItems(Items item);
    public Items updateItems(Items item);
    public void deleteItems(long parseLong);

}
