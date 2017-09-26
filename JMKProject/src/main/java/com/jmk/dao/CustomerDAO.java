package com.jmk.dao;

import java.util.List;

import com.jmk.beans.Customer;
import com.jmk.beans.Granter;
import com.jmk.beans.User;

/**
 * 
 * @author mulayam
 *
 */
public interface CustomerDAO {

	/**
	 * This method create new account
	 * 
	 * @param customer
	 * @return Return 1 on success,if fails then null
	 */
	public Integer createCustomer(Customer customer);

	/**
	 * Edit customer details
	 * 
	 * @param customer
	 * @return
	 */
	public Integer editCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public Customer getCustomer(Long customerId);

	/**
	 * 
	 * @param mobile
	 * @return
	 */
	public Customer getCustomer(String mobile);

	public Granter getGranter(Long customerId);

}
