/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.ContainerAccount;
import com.jmk.beans.DueContainer;
import com.jmk.dao.util.SQLConstant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class ContainerAccountDAOImpl implements ContainerAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int[] saveContainerAccount(final List<ContainerAccount> list) {

        return jdbcTemplate.batchUpdate(SQLConstant.SQL_INSERT_CONTAINER_ACCOUNT, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

                ContainerAccount ac = list.get(i);
                ps.setLong(1, ac.getTransactionId());
                ps.setLong(2, ac.getCustomerId());
                ps.setLong(3, ac.getContainerId());
                ps.setInt(4, ac.getCredit());
                ps.setInt(5, ac.getDebit());
                ps.setInt(6, ac.getSecurityMoneyPerQty());
                ps.setInt(7, ac.getBalance());
            }

            @Override
            public int getBatchSize() {
                return list.size();
            }
        });

    }

    @Override
    public List<DueContainer> getDuesContainer(Long customerId) {
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_DUE_CONTAINER_BY_CUSTOMER_ID, new RowMapper<DueContainer>() {

            @Override
            public DueContainer mapRow(ResultSet rs, int rowNum) throws SQLException {
                DueContainer dueContainer = new DueContainer();
                dueContainer.setContainer_id(rs.getLong(1));
                dueContainer.setCredit(rs.getInt(2));
                dueContainer.setDebit(rs.getInt(3));
                dueContainer.setSecMoney(rs.getInt(4));
                dueContainer.setContainerName(rs.getString(5));
                return dueContainer;
            }

        }, customerId);

    }

    @Override
    public Integer payContainer(ContainerAccount containerAccount) {

//        (transaction_id,customer_id, container_id,
        //credit, debit, sec_money,current_balance) 
        //VALUES ( ?, ?, ?, ?, ?, ?, ?)"
        return jdbcTemplate.update(SQLConstant.SQL_INSERT_CONTAINER_ACCOUNT,
                containerAccount.getTransactionId(), containerAccount.getCustomerId(), containerAccount.getContainerId(),
                containerAccount.getCredit(), containerAccount.getDebit(),
                containerAccount.getSecurityMoneyPerQty(), containerAccount.getBalance());

    }

}
