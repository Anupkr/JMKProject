/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.Supplier;
import com.jmk.beans.User;
import com.jmk.dao.SupplierDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author mulayam
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public String create(Supplier supplier) {

        String message = StatusMessage.STATUS_FAILED;

        try {
            if (supplier != null && supplier.getName().trim().length() > 2 && supplier.getArrivalType().length() > 0) {

                Integer count = supplierDAO.create(supplier);
                if (count != null && count > 0) {
                    message = "Supplier Account Successfully Created";
                }
            } else {
                message = "Invalid Supplier information";
            }
        } catch (DataAccessException e) {
            System.out.println(e);
            message = "Sorry ! Supplier Account Creation Failed, Please try again";
        } catch (Exception e) {
            message = "Sorry ! Supplier Account Creation Failed, Please try again";
        }
        return message;
    }

    @Override
    public List<Supplier> getAllSupplires() {
        return supplierDAO.getAllSupplires();
    }

    @Override
    public String edit(Supplier supplier) {
        String message = StatusMessage.STATUS_FAILED;

        try {
            if (supplier != null && supplier.getId() > 0 && supplier.getName().trim().length() > 2 && supplier.getArrivalType().length() > 0) {
                Integer count = supplierDAO.edit(supplier);
                if (count != null && count > 0) {
                    message = "Supplier Account Successfully Update";
                }
            } else {
                message = "Invalid Supplier information";
            }
        } catch (DataAccessException e) {
            System.out.println(e);
            message = "Sorry ! Supplier Account Updation Failed, Please try again";
        } catch (Exception e) {
            message = "Sorry ! Supplier Account Updation Failed, Please try again";
        }
        return message;
    }

    @Override
    public String delete(Integer supplierId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Supplier getSupplierById(Integer id) {

        if (id != null && id > 0) {
            return supplierDAO.getSupplierById(id);
        } else {
            return null;
        }
    }
}
