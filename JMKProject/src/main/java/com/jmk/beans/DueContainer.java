/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.beans;

import java.io.Serializable;

/**
 *
 * @author mulayam
 */
public class DueContainer implements Serializable {

    private long container_id;
    private String containerName;
    private int debit;

    public long getContainer_id() {
        return container_id;
    }

    public void setContainer_id(long container_id) {
        this.container_id = container_id;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSecMoney() {
        return secMoney;
    }

    public void setSecMoney(int secMoney) {
        this.secMoney = secMoney;
    }
    private int credit;
    private int secMoney;

    @Override
    public String toString() {
        return "DueContainer{" + "container_id=" + container_id + ", containerName=" + containerName + ", debit=" + debit + ", credit=" + credit + ", secMoney=" + secMoney + '}';
    }

}
