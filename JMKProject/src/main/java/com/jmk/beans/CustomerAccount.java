package com.jmk.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * This class hold the customer account information and is sent across the
 * network
 *
 * @author mulayam
 *
 */
public class CustomerAccount implements Serializable {

    private long transactionId;
    private long customerId;
    private double productAmount;
    private double securityMoney;

    private double coolieAmount;
    private double debitAmount;
    private double creditAmount;
    private String transactionType;
    private String description;
    private double currentBalance;

    private Date date;
    private List<ItemSale> itemSaleList;

    private List<ContainerAccount> containerAccountList;

    public List<ContainerAccount> getContainerAccountList() {
        return containerAccountList;
    }

    public void setContainerAccountList(List<ContainerAccount> containerAccountList) {
        this.containerAccountList = containerAccountList;
    }

    public List<ItemSale> getItemSaleList() {
        return itemSaleList;
    }

    public void setItemSaleList(List<ItemSale> itemSaleList) {
        this.itemSaleList = itemSaleList;
    }

    /**
     * @return the transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the customerId
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the productAmount
     */
    public double getProductAmount() {
        return productAmount;
    }

    /**
     * @param productAmount the productAmount to set
     */
    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * @return the securityMoney
     */
    public double getSecurityMoney() {
        return securityMoney;
    }

    /**
     * @param securityMoney the securityMoney to set
     */
    public void setSecurityMoney(double securityMoney) {
        this.securityMoney = securityMoney;
    }

    /**
     * @return the coolieAmount
     */
    public double getCoolieAmount() {
        return coolieAmount;
    }

    /**
     * @param coolieAmount the coolieAmount to set
     */
    public void setCoolieAmount(double coolieAmount) {
        this.coolieAmount = coolieAmount;
    }

    /**
     * @return the debitAmount
     */
    public double getDebitAmount() {
        return debitAmount;
    }

    /**
     * @param debitAmount the debitAmount to set
     */
    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    /**
     * @return the creditAmount
     */
    public double getCreditAmount() {
        return creditAmount;
    }

    /**
     * @param creditAmount the creditAmount to set
     */
    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the currentBalance
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * @param currentBalance the currentBalance to set
     */
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" + "transactionId=" + transactionId + ", customerId=" + customerId + ", productAmount=" + productAmount + ", securityMoney=" + securityMoney + ", coolieAmount=" + coolieAmount + ", debitAmount=" + debitAmount + ", creditAmount=" + creditAmount + ", transactionType=" + transactionType + ", description=" + description + ", currentBalance=" + currentBalance + ", date=" + date + ", itemSaleList=" + itemSaleList + ", containerAccountList=" + containerAccountList + '}';
    }

}
