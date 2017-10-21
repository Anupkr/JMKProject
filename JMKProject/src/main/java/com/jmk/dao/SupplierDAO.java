/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.Supplier;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface SupplierDAO {

    public Integer create(Supplier supplier);

    public List<Supplier> getAllSupplires();

    public Integer edit(Supplier supplier);

    public Integer delete(Integer supplierId);

    public Supplier getSupplierById(Integer id);

}
