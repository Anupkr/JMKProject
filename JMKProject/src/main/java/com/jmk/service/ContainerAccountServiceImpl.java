/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.ContainerAccount;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.DueContainer;
import com.jmk.beans.ItemSale;
import com.jmk.dao.ContainerAccountDAO;
import com.jmk.dao.ContainerDAO;
import com.jmk.dao.CustomerAccountDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mulayam
 */
@Repository
public class ContainerAccountServiceImpl implements ContainerAccountService {

    @Autowired
    private ContainerAccountDAO containerAccountDAO;

    @Autowired
    private CustomerAccountDAO customerAccountDAO;

    @Override

    public List<DueContainer> getDuesContainer(Long customerId) {
        try {
            return containerAccountDAO.getDuesContainer(customerId);
        } catch (EmptyResultDataAccessException e) {
            System.out.println(e);

        } catch (DataAccessException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public String payContainer(CustomerAccount customerAccount, ContainerAccount containerAccount) {

        String message = StatusMessage.STATUS_FAILED;
        if (customerAccount != null && customerAccount.getCustomerId() > 0 && containerAccount != null && containerAccount.getCustomerId() > 0) {
            try {
                //save CustomerAccount payment information in Customer_Account table 
                Integer transactionId = customerAccountDAO.saveSale(customerAccount);
                System.out.println("Transaction ID:" + transactionId);
                if (transactionId != null && transactionId > 0) {

                    //set new generated transaction Id
                    containerAccount.setTransactionId(transactionId);

                    //save containerAccount informatio in container_account table
                    Integer count = containerAccountDAO.payContainer(containerAccount);
                    if (count != null && count > 0) {
                        message = StatusMessage.STATUS_SUCCESS;
                    }

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
}
