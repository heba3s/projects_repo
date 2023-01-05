package com.testrest.demo.model;

import java.util.List;

public class CustomerInformation {
	

	private String name; 
	private String surName; 
	private double balance; 
	private List<Transaction> transactionsList;
	
	public CustomerInformation(String name, String surName, double balance) {
		super();
		this.name = name;
		this.surName = surName;
		this.balance = balance;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<Transaction> getTransactionsList() {
		return transactionsList;
	}
	public void setTransactionsList(List<Transaction> transactionsList) {
		this.transactionsList = transactionsList;
	}
	@Override
	public String toString() {
		return "CustomerInformation [name=" + name + ", surName=" + surName + ", balance=" + balance
				+ ", transactionsList=" + transactionsList + "]";
	}
	

}
