package com.jmk.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jmk.beans.Item;
import com.jmk.dao.util.SQLConstant;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer createItem(Item item) {
        return jdbcTemplate.update(SQLConstant.SQL_INSERT_ITEM, item.getItemName(), item.getContainerId());
    }

    @Override
    public Integer editItem(Item item) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_ITEMS, new RowMapper<Item>() {
            @Override
            public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

                Item item = new Item();
                item.setItemId(rs.getInt(1));
                item.setItemName(rs.getString(2));
                return item;
            }
        });

    }

    @Override
    public Item getItem(Integer itemId) {
        return null;
    }

    @Override
    public Item getItem(String itemName) {

        return null;
    }

}
