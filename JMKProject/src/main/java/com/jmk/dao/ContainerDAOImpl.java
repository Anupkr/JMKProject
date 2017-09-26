package com.jmk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jmk.beans.Container;
import com.jmk.dao.util.SQLConstant;

/**
 *
 * @author mulayam
 *
 */
@Repository
public class ContainerDAOImpl implements ContainerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer createContainer(Container container) {
        return jdbcTemplate.update(SQLConstant.SQL_INSERT_CONTAINER, container.getName(), container.getSecurityMoney());
    }

    public Integer editContainer(Container container) {
        return null;
    }

    public List<Container> getAllContainer() {
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_CONTAINER, new RowMapper<Container>() {

            public Container mapRow(ResultSet rs, int arg1) throws SQLException {
                Container container = new Container();
                container.setContainerId(rs.getInt(1));
                container.setName(rs.getString(2));
                container.setSecurityMoney(rs.getDouble(3));
                return container;
            }
        });
    }

    public Container getContainer(Integer containerId) {
        return null;
    }

    public Container getContainer(String name) {
        return null;
    }
}
