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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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

    @Override
    public List<SupplierAccount> getListFromTransactionId(int supplierId, int tid) {

        return jdbcTemplate.query(SQLConstant.SQL_SELECT_SUP_ACC_FROM_TID, new RowMapper<SupplierAccount>() {
            @Override
            public SupplierAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                SupplierAccount account = new SupplierAccount();
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
        }, supplierId, tid);

    }

    /**
     *
     * @param supplierId
     * @param tid
     * @return
     */
    @Override
    public Double getCurrentBalanceBeforeTId(int supplierId, int tid) {
        return jdbcTemplate.queryForObject(SQLConstant.SQL_SELECT_SUP_CURR_BALANCE_BEFORE_TID, Double.class, supplierId, tid);

    }

    @Override
    public int[] updateAccountList(List<SupplierAccount> list) {

        return jdbcTemplate.batchUpdate(SQLConstant.SQL_UPDATE_SUP_ACCOUNT, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

//  date=?, purchase_ammount=?, sale_amount=?, paid_amount=?, current_balance=? where id=?
                SupplierAccount a = list.get(i);
                ps.setDate(1, new java.sql.Date(a.getDate().getTime()));
                ps.setDouble(2, a.getPurchaseAmount());
                ps.setDouble(3, a.getSaleAmount());
                ps.setDouble(4, a.getPaidAmount());
                ps.setDouble(5, a.getCurrentBalance());
                ps.setInt(6, a.getId());
            }

            @Override
            public int getBatchSize() {
                return list.size();
            }
        });

    }
}
