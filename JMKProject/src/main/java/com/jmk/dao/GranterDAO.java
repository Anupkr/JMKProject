package com.jmk.dao;

import java.util.List;

import com.jmk.beans.Customer;
import com.jmk.beans.Granter;

/**
 * 
 * @author mulayam
 *
 */
public interface GranterDAO {

	public Integer createGranter(Granter Granter);

	public Integer editGranter(Granter Granter);

	public List<Granter> getAllGranter();

	public Granter getGranter(Integer cid);

	public Granter getGranter(String mobile);
}
