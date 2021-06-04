package com.ignite.demo.Controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.demo.Model.Item;
import com.ignite.demo.Service.ItemsService;

@RestController
public class ItemController {

	@Autowired
	ItemsService service;

	@PostMapping("/add/{id}/{itemname}")
	public void addItem(@PathVariable("id") int id, @PathVariable("itemname") String itemname) {
		service.addItem(id, itemname);
	}

	@GetMapping("/getAllItems")
	public List<Item> getAllItems() {
		return service.getAllItems();
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable("id") int id) {
		service.deleteItem(id);
		return "Item Deleted Successfully";
	}

	@GetMapping("/getItem/{id}")
	public Item findItemById(@PathVariable("id") int id) {
		return service.getItemById(id);
	}

	@Transactional
	@PutMapping("/update/{id}/{itemname}")
	public String update(@PathVariable("id") int id, @PathVariable("itemname") String itemname) {
		return service.updateItem(id, itemname);
	}
}
