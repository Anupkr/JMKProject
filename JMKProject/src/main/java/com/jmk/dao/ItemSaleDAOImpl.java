package com.jmk.dao;

import java.util.Date;
import java.util.List;

import com.jmk.beans.ItemSale;
import com.jmk.dao.util.SQLConstant;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemSaleDAOImpl implements ItemSaleDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int[] saveItems(final List<ItemSale> list) {

        return jdbcTemplate.batchUpdate(SQLConstant.SQL_INSERT_SALE_ITEMS, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ItemSale itemSale = list.get(i);
                ps.setLong(1, itemSale.getTransactionId());
                ps.setInt(2, itemSale.getItemId());
                ps.setDouble(3, itemSale.getWeight());
                ps.setDouble(4, itemSale.getPrice());
            }

            @Override
            public int getBatchSize() {
                return list.size();
            }
        });

    }

    @Override
    public List<ItemSale> getAllSaleItems() {
        return null;
    }

    @Override
    public List<ItemSale> getAllSaleItems(Long transactionId) {
        return null;
    }

    @Override
    public List<ItemSale> getAllSaleItemsByCustomerId(Long customerId) {
        return null;
    }

    @Override
    public List<ItemSale> getAllSaleItems(Date from) {
        return null;
    }

    @Override
    public List<ItemSale> getAllSaleItems(Date from, Date to) {
        return null;
    }

    @Override
    public Integer deleteTransaction(Long transationId) {
        return null;
    }
}
