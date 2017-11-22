/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.SupplierAccount;
import com.jmk.dao.SupplierAccountDAO;
import com.jmk.util.StatusMessage;
import java.util.Arrays;
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
        return message;
    }

    @Override
    public List<SupplierAccount> getAllTransaction(int supplierId) {
        try {
            return supplierAccountDAO.getAllTransaction(supplierId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<SupplierAccount> getAllTransaction(int supplierId, Date from, Date to) {
        try {

            return supplierAccountDAO.getAllTransaction(supplierId, from, to);
        } catch (EmptyResultDataAccessException ex) {
        }
        return null;
    }

    @Override
    public List<SupplierAccount> getListFromTransactionId(int supplierId, int tid) {
        try {

            return supplierAccountDAO.getListFromTransactionId(supplierId, tid);
        } catch (EmptyResultDataAccessException ex) {
        }
        return null;
    }

    @Override
    public Double getCurrentBalanceBeforeTId(int supplierId, int tid) {
        try {
            return supplierAccountDAO.getCurrentBalanceBeforeTId(supplierId, tid);
        } catch (EmptyResultDataAccessException ex) {
        } catch (DataAccessException ex) {

        } catch (Exception ex) {

        }
        return null;
    }

    @Override
    public String updateAccountList(List<SupplierAccount> list) {

        String message = StatusMessage.STATUS_FAILED;
        try {
            if (list != null && list.size() > 0) {
                int count[] = supplierAccountDAO.updateAccountList(list);
                int sum = Arrays.stream(count).sum();
                if (sum == list.size()) {
                    message = StatusMessage.STATUS_SUCCESS;
                }
            }

        } catch (DataAccessException ex) {
            System.out.println(ex);
            message = StatusMessage.STATUS_FAILED;

        } catch (Exception ex) {
            System.out.println(ex);

            message = StatusMessage.STATUS_FAILED;
        }
        return message;
    }
}
