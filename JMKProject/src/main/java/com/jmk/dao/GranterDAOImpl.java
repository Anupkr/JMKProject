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
			public Granter mapRow(ResultSet arg0, int arg1) throws SQLException {
				Granter granter = new Granter();
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
