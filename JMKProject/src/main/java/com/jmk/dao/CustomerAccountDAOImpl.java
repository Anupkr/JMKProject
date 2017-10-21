package com.jmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.jmk.beans.CustomerAccount;
import com.jmk.dao.util.SQLConstant;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerAccountDAOImpl implements CustomerAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Transactional(rollbackFor = Exception.class)
    public Integer saveSale(final CustomerAccount account) {
        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {

            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

                PreparedStatement statement = con.prepareStatement(SQLConstant.SQL_INSERT_ACCOUNT_TRANSACTION,
                        Statement.RETURN_GENERATED_KEYS);
                statement.setLong(1, account.getCustomerId());
                statement.setDouble(2, account.getProductAmount());
                statement.setDouble(3, account.getSecurityMoney());
                statement.setDouble(4, account.getCoolieAmount());
                statement.setDouble(5, account.getDebitAmount());
                statement.setDouble(6, account.getCreditAmount());
                statement.setString(7, account.getTransactionType());
                statement.setString(8, account.getDescription());
                statement.setDouble(9, account.getCurrentBalance());

                return statement;
            }
        }, generatedKeyHolder);
        return generatedKeyHolder.getKey().intValue();
    }

    public List<CustomerAccount> getAllTransaction(Long customerId) {
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_TRANSACTION_BY_CUSTOMER_ID, new RowMapper<CustomerAccount>() {
            @Override
            public CustomerAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                CustomerAccount customerAccount = new CustomerAccount();
                //transaction_id,customer_id,product_amount,security_money,coolie_amount,
                //debit_amount,credit_amount,transaction_type,description,current_balance,transaction_date
                customerAccount.setTransactionId(rs.getLong(1));
                customerAccount.setCustomerId(rs.getLong(2));
                customerAccount.setProductAmount(rs.getDouble(3));

                customerAccount.setSecurityMoney(rs.getDouble(4));
                customerAccount.setCoolieAmount(rs.getDouble(5));
                customerAccount.setDebitAmount(rs.getDouble(6));
                customerAccount.setCreditAmount(rs.getDouble(7));
                customerAccount.setTransactionType(rs.getString(8));
                customerAccount.setDescription(rs.getString(9));
                customerAccount.setCurrentBalance(rs.getDouble(10));
                customerAccount.setDate(null);
                return customerAccount;
            }
        }, customerId);
    }

    @Override
    public List<CustomerAccount> getAllTransaction(Date from) {
        return null;
    }

    @Override
    public List<CustomerAccount> getAllTransaction(Date from, Date to) {
        return null;
    }

    public Integer deleteTransaction(Long transactionId) {
        return null;
    }

    @Override
    public Double getBalance(Long customerId) {
        return jdbcTemplate.queryForObject(SQLConstant.SQL_SELECT_CURRENT_BALANCE, Double.class, customerId);

    }

    @Override
    public List<CustomerAccount> getRecentPyamentTransaction(Long customerId) {

        return jdbcTemplate.query(SQLConstant.SQL_SELECT_RECENT_PAYMENT_TRANSACTION, (ResultSet rs, int rowNum) -> {
            CustomerAccount customerAccount = new CustomerAccount();
            //transaction_id,customer_id,product_amount,security_money,coolie_amount,
            //debit_amount,credit_amount,transaction_type,description,current_balance,transaction_date
            customerAccount.setTransactionId(rs.getLong(1));
            customerAccount.setCustomerId(rs.getLong(2));
            customerAccount.setProductAmount(rs.getDouble(3));
            
            customerAccount.setSecurityMoney(rs.getDouble(4));
            customerAccount.setCoolieAmount(rs.getDouble(5));
            customerAccount.setDebitAmount(rs.getDouble(6));
            customerAccount.setCreditAmount(rs.getDouble(7));
            customerAccount.setTransactionType(rs.getString(8));
            customerAccount.setDescription(rs.getString(9));
            customerAccount.setCurrentBalance(rs.getDouble(10));
            customerAccount.setDate(rs.getDate(11));
            return customerAccount;
        }, customerId, customerId);
    }
}
