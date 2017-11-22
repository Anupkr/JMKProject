package com.jmk.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mulayam
 *
 */
public class Granter implements Serializable {

    private Long granterId;
    private User user;
    private String name;
    private String idNumber;
    private String idType;

    private List<Customer> customerList;

    public Long getGranterId() {
        return granterId;
    }

    public void setGranterId(Long granterId) {
        this.granterId = granterId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.granterId);
        return hash;
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
        final Granter other = (Granter) obj;
        if (!Objects.equals(this.granterId, other.granterId)) {
            return false;
        }
        return true;
    }

}
