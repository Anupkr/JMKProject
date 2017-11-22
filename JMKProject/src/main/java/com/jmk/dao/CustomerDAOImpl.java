package com.jmk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.Granter;
import com.jmk.beans.User;
import com.jmk.dao.util.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer createCustomer(Customer customer) {

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(SQLConstant.SQL_INSERT_CUSTOMER,
                        Statement.RETURN_GENERATED_KEYS);

                ps.setLong(1, customer.getGranter().getGranterId());
                ps.setInt(2, customer.getUser().getUserId());
                ps.setString(3, customer.getName());
                ps.setString(4, customer.getIdNumber());
                ps.setString(5, customer.getIdType());
                return ps;
            }
        }, generatedKeyHolder);
        return generatedKeyHolder.getKey().intValue();
    }

    @Override
    public Integer editCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        /* "select
        c.customer_id,
        c.granter_id,
        c.id_number,
        c.id_type,
        c.name,
        c.user_id,
        u.address,
        u.mobile1,
        u.mobile2,
        u.status,
        u.user_name,
        u.user_role 
       current_balance
         */

        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_CUSTOMER, (ResultSet rs, int arg1) -> {
            User user = new User();
            Granter granter = new Granter();

            Customer customer = new Customer();
            customer.setCustomerId(rs.getLong(1));
            granter.setGranterId(rs.getLong(2));
            customer.setGranter(granter);

            customer.setIdNumber(rs.getString(3));
            customer.setIdType(rs.getString(4));

            customer.setName(rs.getString(5));

            user.setUserId(rs.getInt(6));
            user.setAddress(rs.getString(7));
            user.setMobile1(rs.getString(8));
            user.setMobile2(rs.getString(9));
            user.setStatus(rs.getInt(10));
            user.setUserName(rs.getString(11));
            user.setUserRole(rs.getString(12));
            CustomerAccount customerAccount = new CustomerAccount();
            customerAccount.setCurrentBalance(rs.getDouble(13));

            customer.setCustomerAccount(customerAccount);
            customer.setUser(user);
            return customer;
        });
    }

    @Override
    public Customer getCustomer(String mobile) {

        return null;
    }

    @Override
    public Customer getCustomer(Long customerId) {

        return jdbcTemplate.queryForObject(SQLConstant.SQL_SELECT_CUSTOMER_BY_ID, (ResultSet rs, int rowNum) -> {
            User user = new User();
            Granter granter = new Granter();

            Customer customer = new Customer();
            customer.setCustomerId(rs.getLong(1));
            granter.setGranterId(rs.getLong(2));
            customer.setGranter(granter);

            customer.setIdNumber(rs.getString(3));
            customer.setIdType(rs.getString(4));

            customer.setName(rs.getString(5));

            user.setUserId(rs.getInt(6));
            user.setAddress(rs.getString(7));
            user.setMobile1(rs.getString(8));
            user.setMobile2(rs.getString(9));
            user.setStatus(rs.getInt(10));
            user.setUserName(rs.getString(11));
            user.setUserRole(rs.getString(12));
            return customer;
        }, customerId);

    }

    @Override
    public Granter getGranter(Long customerId) {
        return null;
    }

    @Override
    public Integer updateCustomer(Customer customer) {
//        "update customer set name=?, id_number=?, id_type=?, granter_id=? where customer_id=?"
        return jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(SQLConstant.SQL_UPDATE_CUSTOMER);

                ps.setString(1, customer.getName());
                ps.setString(2, customer.getIdNumber());
                ps.setString(3, customer.getIdType());
                ps.setLong(4, customer.getGranter().getGranterId());
                ps.setLong(5, customer.getCustomerId());

                return ps;
            }
        });
    }
}
