/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.beans;

import com.jmk.util.AmmountFormater;
import java.util.Date;

/**
 *
 * @author mulayam
 */
public class SupplierAccount {

    private int id;
    private long supplierId;
    private Date date;
    private double purchaseAmount;
    private double saleAmount;
    private double paidAmount;
    private String particular;
    private double currentBalance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getPurchaseAmountAsString() {
        return AmmountFormater.formateDoubleToString(purchaseAmount);
    }

    public String getCurrentBalanceAsString() {
        return AmmountFormater.formateDoubleToString(currentBalance);
    }

    public String getSaleAmountAsString() {
        return AmmountFormater.formateDoubleToString(saleAmount);
    }

    public String getPaidAmountAsString() {
        return AmmountFormater.formateDoubleToString(paidAmount);
    }

    @Override
    public String toString() {
        return "SupplierAccount{" + "id=" + id + ", supplierId=" + supplierId + ", date=" + date + ", purchaseAmount=" + purchaseAmount + ", saleAmount=" + saleAmount + ", paidAmount=" + paidAmount + ", particular=" + particular + ", currentBalance=" + currentBalance + '}'+"\n";
    }

}
