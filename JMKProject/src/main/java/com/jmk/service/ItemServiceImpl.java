package com.jmk.service;

import com.jmk.beans.Item;
import com.jmk.dao.ItemDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anup
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public String createItem(Item item) {
        String message = StatusMessage.STATUS_FAILED;
        if (item != null) {

            //add  new item
            Integer itemId = itemDAO.createItem(item);
            if (itemId != null && itemId > 0) {
                System.out.println("Item Added Succsessfully");
            } else {
                System.out.println("Item Creation Failed");
            }
        } else {
            message = "Could not add the Item, please check the Fields";
        }
        return message;
    }

    @Override
    public List<Item> getAllItem() {
        return itemDAO.getAllItems();
    }

    @Override
    public Item getItem(Integer itemId) {
        return null;
    }

    @Override
    public Item getItem(String itemname) {
        return null;
    }

}
