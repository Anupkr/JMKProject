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

    public Integer createItem(Item item) {
        return null;
    }

    public Integer editItem(Item item) {
        return null;
    }

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

    public Item getItem(Integer itemId) {
        return null;
    }

    public Item getItem(String itemName) {

        return null;
    }

}
