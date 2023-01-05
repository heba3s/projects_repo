package com.testrest.demo.model;

import java.util.UUID;

public class Transaction {
	
	
	private int transID; 
	private int accountNo; //accountId
	private TransactionType transType; // withdraw , deposit,bank transfer. 
	private CurrencyCode currencyCode;
	private double xactionAmount;
	
	public Transaction(int accountNo, TransactionType deposit, CurrencyCode egp, double d) {
		super();
		//generate xactionId
		this.transID = (int) UUID.randomUUID().getLeastSignificantBits();
		this.accountNo = accountNo;
		this.transType = deposit;
		this.currencyCode = egp;
		this.xactionAmount = d;
	}
	

	
	public int getTransID() {
		return transID;
	}
	public void setTransID(int transID) {
		this.transID = transID;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public TransactionType getTransType() {
		return transType;
	}
	public void setTransType(TransactionType transType) {
		this.transType = transType;
	}
	public CurrencyCode getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(CurrencyCode currencyCode) {
		this.currencyCode = currencyCode;
	}
	public double getXactionAmount() {
		return xactionAmount;
	}
	public void setXactionAmount(int xactionAmount) {
		this.xactionAmount = xactionAmount;
	}
	

}
