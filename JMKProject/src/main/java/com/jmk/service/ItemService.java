/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.Item;
import java.util.List;

/**
 *
 * @author anup
 */
public interface ItemService
{
    /**
     * create new Item
     * @param Item
     * @return 
     */
    public String createItem(Item item);
    /**
     * 
     * @return All Item
     */
    public List<Item> getAllItem();
    /**
     * @param get Item by Id
     * @retrun
     */
    public Item getItem(Integer itemId);
    /**
     * @param get Item by name
     * @return
     */
    public Item getItem(String itemname);
}
