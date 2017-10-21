package com.jmk.service;

import java.util.List;

import com.jmk.beans.Customer;

public interface CustomerService {
	/**
	 * Create new user account
	 * 
	 * @param customer
	 * @return
	 */

	public String createCustomer(Customer customer);

	/**
	 * Get All Customer List
	 * 
	 * @return
	 */
	public List<Customer> getAllCustomer();

	/**
	 * Get customer by customerid
	 * 
	 * @param customerId
	 * @return
	 */
	public Customer getCustomer(Integer customerId);

	/**
	 * Get customer by mobile number
	 * 
	 * @param mobile
	 * @return
	 */
	public Customer getCustomer(String mobile);

}
