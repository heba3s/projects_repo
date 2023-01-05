package com.testrest.demo.respository;

import java.util.ArrayList;
import java.util.List;

import com.testrest.demo.model.Account;

public class AccountsRepository {
	
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public Account createAccount(int customerId, double initialCredit) {
		Account account = new Account(customerId,initialCredit);
		return account;
		
	}
	
	public List<Account> listAccounts(){
		// create two accounts and return them 
		Account account1 = new Account(10, 0); 
		Account account2 = new Account(15,1500);
		this.accounts.add(account1);
		this.accounts.add(account2);
		return accounts;
		
	}
	
	
	
	
	

}
