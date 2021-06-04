package com.ignite.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	private int id;
	private String itemname;

	public Item() {
	}

	public Item(int id, String itemname) {
		super();
		this.id = id;
		this.itemname = itemname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + "]";
	}

}
