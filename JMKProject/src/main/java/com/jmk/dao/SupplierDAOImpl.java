/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.Supplier;
import com.jmk.dao.util.SQLConstant;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mulayam
 */
@Repository
public class SupplierDAOImpl implements SupplierDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer create(Supplier s) {
        //name, address1, address2, 
        //mobile1, mobile2, arrival_type,
        //emaild_id, id_type, id_number
        return jdbcTemplate.update(SQLConstant.SQL_INSERT_SUPPLIER, s.getName(), s.getAddress1(), s.getAddress2(),
                s.getMobile1(), s.getMobile2(), s.getArrivalType(), s.getEmaild(), s.getIdType(), s.getIdNumber());

    }

    @Override
    public List<Supplier> getAllSupplires() {

        //id,name, address1, address2, 
        //mobile1, mobile2, arrival_type,
        //emaild_id, id_type, id_number
        return jdbcTemplate.query(SQLConstant.SQL_SELECT_ALL_SUPPLIER, (ResultSet rs, int rowNum) -> {
            Supplier s = new Supplier();
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setAddress1(rs.getString(3));
            s.setAddress2(rs.getString(4));
            s.setArrivalType(rs.getString(5));
            s.setEmaild(rs.getString(6));
            s.setIdType(rs.getString(7));
            s.setIdNumber(rs.getString(8));
            return s;
        });
    }

    @Override
    public Integer edit(Supplier s) {
        return jdbcTemplate.update(SQLConstant.SQL_UPDATE_SUPPLIER,
                s.getName(), s.getAddress1(), s.getAddress2(),
                s.getMobile1(), s.getMobile2(), s.getArrivalType(), s.getEmaild(),
                s.getIdType(), s.getIdNumber(), s.getId());

    }

    @Override
    public Integer delete(Integer supplierId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
