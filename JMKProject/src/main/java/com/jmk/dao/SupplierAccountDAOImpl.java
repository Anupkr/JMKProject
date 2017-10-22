/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.CustomerAccount;
import com.jmk.beans.Supplier;
import com.jmk.beans.SupplierAccount;
import com.jmk.dao.util.SQLConstant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

    @Override
    public List<SupplierAccount> getAllTransaction(int supplierId) {

//        id,supplier_id,date,purchase_ammount,sale_amount,paid_amount,particular,current_balance
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_SUPPLIER_ACCOUNT_BY_ID, new RowMapper<SupplierAccount>() {
            @Override
            public SupplierAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                SupplierAccount account = new SupplierAccount();
                //transaction_id,customer_id,product_amount,security_money,coolie_amount,
                //debit_amount,credit_amount,transaction_type,description,current_balance,transaction_date
                account.setId(rs.getInt(1));
                account.setSupplierId(rs.getInt(2));
                account.setDate(rs.getDate(3));
                account.setPurchaseAmount(rs.getDouble(4));

                account.setSaleAmount(rs.getDouble(5));
                account.setPaidAmount(rs.getDouble(6));
                account.setParticular(rs.getString(7));
                account.setCurrentBalance(rs.getDouble(8));
                return account;
            }
        }, supplierId);
    }

    @Override
    public List<SupplierAccount> getAllTransaction(int supplierId, Date from, Date to) {

//        id,supplier_id,date,purchase_ammount,sale_amount,paid_amount,particular,current_balance
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_SUPPLIER_ACCOUNT_FROM_TO, new RowMapper<SupplierAccount>() {
            @Override
            public SupplierAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                SupplierAccount account = new SupplierAccount();
                //transaction_id,customer_id,product_amount,security_money,coolie_amount,
                //debit_amount,credit_amount,transaction_type,description,current_balance,transaction_date
                account.setId(rs.getInt(1));
                account.setSupplierId(rs.getInt(2));
                account.setDate(rs.getDate(3));
                account.setPurchaseAmount(rs.getDouble(4));

                account.setSaleAmount(rs.getDouble(5));
                account.setPaidAmount(rs.getDouble(6));
                account.setParticular(rs.getString(7));
                account.setCurrentBalance(rs.getDouble(8));
                return account;
            }
        }, supplierId, from, to);
    }

}
