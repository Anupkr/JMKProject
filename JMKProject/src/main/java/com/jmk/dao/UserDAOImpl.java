package com.jmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import com.jmk.beans.User;
import com.jmk.dao.util.SQLConstant;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer createUser(final User user) {

        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection con) -> {
            PreparedStatement ps = con.prepareStatement(SQLConstant.SQL_INSERT_USER,
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getMobile1());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getMobile1());
            ps.setString(4, user.getMobile2());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getUserRole());
            ps.setInt(7, user.getStatus());
            return ps;
        }, generatedKeyHolder);

        return generatedKeyHolder.getKey().intValue();
    }

    @Override
    public Integer editUser(User user) {

//    update user_name=?, password=?, address=?, mobile1=?, mobile2=?, user_role=?, status=? WHERE user_id=?;
        return jdbcTemplate.update(SQLConstant.SQL_UPDATE_USER, user.getUserName(), user.getPassword(),
                user.getAddress(), user.getMobile1(), user.getMobile2(), user.getUserRole(), user.getStatus(), user.getUserId());

    }

}
