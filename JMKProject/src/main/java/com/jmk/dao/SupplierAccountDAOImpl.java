/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.Supplier;
import com.jmk.beans.SupplierAccount;
import com.jmk.dao.util.SQLConstant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mulayam
 */
@Repository
public class SupplierAccountDAOImpl implements SupplierAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer saveAccount(SupplierAccount account) {

//        supplier_id, date, purchase_ammount, 
//         sale_amount, paid_amount, particular, current_balance
        return jdbcTemplate.update(SQLConstant.SQL_INSERT__SUPPLIER_ACCOUNT,
                account.getSupplierId(), account.getDate(), account.getPurchaseAmount(),
                account.getSaleAmount(), account.getPaidAmount(), account.getParticular(), account.getCurrentBalance());
    }
}
