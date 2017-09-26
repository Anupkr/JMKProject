/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.CustomerAccount;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface CustomerAccountService {

    /**
     * This method add product sale/payment information
     *
     * @param customerAccount
     * @return
     */
    public String saveSale(CustomerAccount customerAccount);

    /**
     * Get all transaction list of specific customer id
     *
     * @param customerId
     * @return
     */
    public List<CustomerAccount> getAllTransaction(Long customerId);

    public List<CustomerAccount> getAllTransaction(Date from);

    public List<CustomerAccount> getAllTransaction(Date from, Date to);

    public String deleteTransaction(Long transactionId);

    /**
     * Get current balance of specific accountId
     *
     * @param customerId
     * @return current balance if amount
     */
    public Double getBalance(Long customerId);
}
