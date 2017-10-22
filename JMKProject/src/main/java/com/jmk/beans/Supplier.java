/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.beans;

/**
 *
 * @author mulayam
 */
public class Supplier {

    private int id;
    private String name;
    private String arrivalType;
    private String mobile1;
    private String mobile2;
    private String address1;
    private String address2;
    private String emaild;
    private String idType;
    private String idNumber;
    private Double currentBalance;

    public Supplier() {
    }

    public Supplier(String name, String arrivalType, String mobile1, String mobile2, String address1, String address2, String emaild, String idType, String idNumber, double currentBalance) {
        this.name = name;
        this.arrivalType = arrivalType;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.address1 = address1;
        this.address2 = address2;
        this.emaild = emaild;
        this.idType = idType;
        this.idNumber = idNumber;
        this.currentBalance = currentBalance;
    }

    public Supplier(String name, String arrivalType, String mobile1, String mobile2, String address1, String address2, String emaild, String idType, String idNumber) {
        this.name = name;
        this.arrivalType = arrivalType;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.address1 = address1;
        this.address2 = address2;
        this.emaild = emaild;
        this.idType = idType;
        this.idNumber = idNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrivalType() {
        return arrivalType;
    }

    public void setArrivalType(String arrivalType) {
        this.arrivalType = arrivalType;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getEmaild() {
        return emaild;
    }

    public void setEmaild(String emaild) {
        this.emaild = emaild;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Double getCurrentBalance() {
       
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

 
    
    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", arrivalType=" + arrivalType + ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", address1=" + address1 + ", address2=" + address2 + ", emaild=" + emaild + ", idType=" + idType + ", idNumber=" + idNumber + ", currentBalance=" + currentBalance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supplier other = (Supplier) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
