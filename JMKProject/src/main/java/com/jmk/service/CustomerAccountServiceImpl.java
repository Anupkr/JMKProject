/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.ContainerAccount;
import com.jmk.beans.CustomerAccount;
import com.jmk.dao.ContainerAccountDAO;
import com.jmk.dao.CustomerAccountDAO;
import com.jmk.util.StatusMessage;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author mulayam
 */
@Service
public class CustomerAccountServiceImpl implements CustomerAccountService {

    @Autowired
    private CustomerAccountDAO customerAccountDAO;
    @Autowired
    private ContainerAccountDAO containerAccountDAO;

    @Override
    public List<CustomerAccount> getAllTransaction(Long customerId) {
        try {
            return customerAccountDAO.getAllTransaction(customerId);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<CustomerAccount> getAllTransaction(Date from) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerAccount> getAllTransaction(Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String saveSale(CustomerAccount customerAccount) {

        String message = StatusMessage.STATUS_FAILED;
        if (customerAccount != null && customerAccount.getCustomerId() > 0) {
            try {
                Integer transactionId = customerAccountDAO.saveSale(customerAccount);
                System.out.println(transactionId);
                if (transactionId != null && transactionId > 0) {

                    List<ContainerAccount> containerAccountList = customerAccount.getContainerAccountList();
                    if (containerAccountList != null && containerAccountList.size() > 0) {

                        for (ContainerAccount containerAccount : containerAccountList) {
                            containerAccount.setCustomerId(customerAccount.getCustomerId());
                            containerAccount.setTransactionId(transactionId);
//                            containerAccountDAO.saveContainerAccount(containerAccount);
                        }
                    }
                    message = StatusMessage.STATUS_SUCCESS;
                }
            } catch (DataAccessException exception) {
                System.out.println(exception);
                message = "Could not save please try again";
            } catch (Exception ex) {
                System.out.println(ex);
                message = "Could not save please try again";

            }
        } else {
            message = "Account details required";
        }
        return message;
    }

    @Override
    public String deleteTransaction(Long transactionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getBalance(Long customerId) {

        try {
            return customerAccountDAO.getBalance(customerId);

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
