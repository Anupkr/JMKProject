package com.jmk.beans;

import java.io.Serializable;

/**
 *
 * @author mulayam
 *
 */
public class Item implements Serializable {

    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    private String itemName;
    private boolean status;

}
