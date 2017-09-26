package com.jmk.dao;

import java.util.List;

import com.jmk.beans.Item;

public interface ItemDAO {

	public Integer createItem(Item item);
	public Integer editItem(Item item);
	
	public List<Item> getAllItems();
	public Item getItem(Integer itemId);
	public Item getItem(String itemName);
	
	

}
