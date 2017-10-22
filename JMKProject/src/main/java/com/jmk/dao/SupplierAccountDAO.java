/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.SupplierAccount;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface SupplierAccountDAO {

    public Integer saveAccount(SupplierAccount account);

    public List<SupplierAccount> getAllTransaction(int supplierId);

    public List<SupplierAccount> getAllTransaction(int supplierId, Date from, Date to);

}
