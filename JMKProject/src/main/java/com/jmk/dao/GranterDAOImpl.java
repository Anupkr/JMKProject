package com.jmk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jmk.beans.Customer;
import com.jmk.beans.Granter;
import com.jmk.beans.User;
import com.jmk.dao.util.SQLConstant;

@Repository
public class GranterDAOImpl implements GranterDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer createGranter(Granter granter) {
        return jdbcTemplate.update(SQLConstant.SQL_INSERT_GRANTER, granter.getUser().getUserId(), granter.getName(),
                granter.getIdNumber(), granter.getIdType());
    }

    public Integer editGranter(Granter granter) {
        return null;
    }

    public List<Granter> getAllGranter() {
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_GRANTERS, new RowMapper<Granter>() {
            public Granter mapRow(ResultSet rs, int arg1) throws SQLException {
                Granter granter = new Granter();
                granter.setGranterId(Long.MIN_VALUE);
                granter.setName(rs.getString(1));

                User user = new User();
                user.setAddress(rs.getString(2));
                user.setMobile1(rs.getString(3));
                user.setMobile2(rs.getString(4));

                granter.setIdType(rs.getString(5));
                granter.setIdNumber(rs.getString(6));

                user.setUserId((int) rs.getLong(7));
                user.setStatus(rs.getInt(8));
                user.setUserName(rs.getString(9));
                user.setUserRole(rs.getString(10));

                granter.setUser(user);

                return granter;
            }
        });
    }

    public Granter getGranter(Integer cid) {
        return null;
    }

    public Granter getGranter(String mobile) {
        return null;
    }

}
