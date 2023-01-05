package com.testrest.demo.model;

public class Account {
	private int accountId;
	private int customerId;
	private double initialCredit;
	
	
	public Account(int customerId, double initialCredit) {
		this.customerId = customerId;
		this.initialCredit = initialCredit;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getInitialCredit() {
		return initialCredit;
	}
	public void setInitialCredit(double initialCredit) {
		this.initialCredit = initialCredit;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerId=" + customerId + ", initialCredit=" + initialCredit
				+ "]";
	}

}
