package com.jmk.service;

import java.util.List;

import com.jmk.beans.Granter;

public interface GranterService {
	/**
	 * create new Granter
	 * @param granter
	 * @return
	 */
	public String createGranter(Granter granter);
	/**
	 * 
	 * @return
	 */
	public List<Granter> getAllGranter();
	/**
	 * get granter by id 
	 * @param granterId
	 */
	public Granter getGranter(Integer granterId);
	/**
	 * get granter by mobile
	 * @param
	 * 
	 */
	public Granter getGranter(String mobile);
}
