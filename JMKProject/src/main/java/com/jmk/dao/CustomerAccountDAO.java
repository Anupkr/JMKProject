package com.jmk.dao;

import java.util.Date;
import java.util.List;

import com.jmk.beans.CustomerAccount;

public interface CustomerAccountDAO {

    /**
     * This method add product sale/payment information
     *
     * @param customerAccount
     * @return Return last transactionId if success else null
     */
    public Integer saveSale(CustomerAccount customerAccount);

    /**
     * Get all transaction list of specific customer id
     *
     * @param customerId
     * @return
     */
    public List<CustomerAccount> getAllTransaction(Long customerId);

    public List<CustomerAccount> getAllTransaction(Date from);

    public List<CustomerAccount> getAllTransaction(Date from, Date to);

    public Integer deleteTransaction(Long transactionId);

    /**
     * Get current balance of specific accountId
     *
     * @param customerId
     * @return current balance if amount
     */
    public Double getBalance(Long customerId);

    /**
     * This method fetch all transaction from last purchase
     *
     * @param customerId
     * @return List of CustomerAccount
     */
    public List<CustomerAccount> getRecentPyamentTransaction(Long customerId);

}
