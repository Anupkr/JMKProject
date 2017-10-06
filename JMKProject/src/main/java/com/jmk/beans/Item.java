package com.jmk.beans;

import java.io.Serializable;

/**
 *
 * @author mulayam
 *
 */
public class Item implements Serializable {

    private int itemId;
    private String itemName;
    private int containerId;

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

    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

}
