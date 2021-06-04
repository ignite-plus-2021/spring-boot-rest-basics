package com.ignite.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ignite.demo.Model.Item;
import com.ignite.demo.Repository.ItemsRepository;

@Service
public class ItemsService {

	@Autowired
	private ItemsRepository repo;

	//This method adds item into the database. Method takes item id and name as arguments. Id is primary key of table in database
	public void addItem(int id, String name) {
		Item item = new Item();
		item.setId(id);
		item.setItemname(name);
		repo.save(item);
	}
	
	//This method returns all the items from the database
	public List<Item> getAllItems() {
		return repo.findAll();
	}
	
	//This method deletes an items from the databasewith particular id
	public void deleteItem(int id) {
		repo.deleteById(id);

	}

	//This method returns the item with particular id from the database
	public Item getItemById(int id) {
		return repo.findById(id).orElseThrow();

	}

	//This method updates item with the specified id with the given name in the database 
	public String updateItem(int id, String itemname) {
		Item item = new Item();
		item = repo.findById(id).orElseThrow();
		item.setItemname(itemname);
		repo.save(item);
		return "updated";

	}
}
