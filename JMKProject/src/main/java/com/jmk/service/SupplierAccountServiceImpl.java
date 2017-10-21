/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.SupplierAccount;
import com.jmk.dao.SupplierAccountDAO;
import com.jmk.util.StatusMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author mulayam
 */
@Service
public class SupplierAccountServiceImpl implements SupplierAccountService {

    @Autowired
    private SupplierAccountDAO supplierAccountDAO;

    @Override
    public String saveAccount(SupplierAccount account) {
        String message = StatusMessage.STATUS_FAILED;
        try {
            if (account != null && account.getSupplierId() > 0) {
                Integer count = supplierAccountDAO.saveAccount(account);
                if (count != null && count > 0) {
                    message = StatusMessage.STATUS_SUCCESS;
                } else {
                    message = "Account information could not saved,please try again";
                }
            } else {
                message = "Complete Information Required";
            }
        } catch (DataAccessException ex) {

            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(message);
        return message;
    }
}
