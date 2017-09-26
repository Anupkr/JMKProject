package com.jmk.beans;

/**
 * This class hold the information of container payment
 *
 * @author mulayam
 *
 */
public class ContainerAccount {

    private long id;
    private long transactionId;
    private long customerId;
    private long containerId;
    private int credit;
    private int debit;
    private int securityMoneyPerQty;
    private int totalSecurityMoney;
    private int balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getContainerId() {
        return containerId;
    }

    public void setContainerId(long containerId) {
        this.containerId = containerId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getSecurityMoneyPerQty() {
        return securityMoneyPerQty;
    }

    public void setSecurityMoneyPerQty(int securityMoneyPerQty) {
        this.securityMoneyPerQty = securityMoneyPerQty;
    }

    public int getTotalSecurityMoney() {
        return totalSecurityMoney;
    }

    public void setTotalSecurityMoney(int totalSecurityMoney) {
        this.totalSecurityMoney = totalSecurityMoney;
    }

    public int getBalance() {
        return balance;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    

}
