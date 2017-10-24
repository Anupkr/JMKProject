/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.SupplierAccount;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface SupplierAccountService {

    public String saveAccount(SupplierAccount account);

    public List<SupplierAccount> getAllTransaction(int supplierId);

    public List<SupplierAccount> getAllTransaction(int supplierId, Date from, Date to);

    public Double getCurrentBalanceBeforeTId(int supplierId, int tid);

    public List<SupplierAccount> getListFromTransactionId(int supplier_id, int tid);

    public String updateAccountList(List<SupplierAccount> list);

}
