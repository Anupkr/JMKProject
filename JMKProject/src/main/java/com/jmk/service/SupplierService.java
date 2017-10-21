/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.Supplier;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface SupplierService {

    public String create(Supplier supplier);

    public List<Supplier> getAllSupplires();

    public String edit(Supplier supplier);

    public String delete(Integer supplierId);

    public Supplier getSupplierById(Integer id);

}
