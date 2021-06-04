package com.ignite.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ignite.demo.Model.Item;
import com.ignite.demo.Service.ItemsService;

public interface ItemsRepository extends JpaRepository<Item, Integer> {
	
	Item deleteAllById(int id);

}
