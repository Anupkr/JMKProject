package com.jmk.beans;

import java.io.Serializable;

public class Container implements Serializable {

	private int containerId;
	private String name;
	private double securityMoney;

	/**
	 * @return the containerId
	 */
	public int getContainerId() {
		return containerId;
	}

	/**
	 * @param containerId
	 *            the containerId to set
	 */
	public void setContainerId(int containerId) {
		this.containerId = containerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the securityMoney
	 */
	public double getSecurityMoney() {
		return securityMoney;
	}

	/**
	 * @param securityMoney
	 *            the securityMoney to set
	 */
	public void setSecurityMoney(double securityMoney) {
		this.securityMoney = securityMoney;
	}

    @Override
    public String toString() {
        return "Container{" + "containerId=" + containerId + ", name=" + name + ", securityMoney=" + securityMoney + '}';
    }
        

}
