package com.testrest.demo.model;

public class CustomerAccountRQ {
	private int customerID;
	private int initialCredit;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getInitialCredit() {
		return initialCredit;
	}
	public void setInitialCredit(int initialCredit) {
		this.initialCredit = initialCredit;
	}
	
}
