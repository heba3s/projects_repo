package com.testrest.demo.respository;

import java.util.ArrayList;
import java.util.List;

import com.testrest.demo.model.Account;
import com.testrest.demo.model.CurrencyCode;
import com.testrest.demo.model.Transaction;
import com.testrest.demo.model.TransactionType;

public class TransactionsRepository {

	
	public Transaction addTransaction(Account account) {
		Transaction xaction = new Transaction(account.getAccountId(),TransactionType.Deposit,CurrencyCode.EGP,account.getInitialCredit());
		return xaction;
		
	}
	
	//given account Id , retrieve list of xactions associated to this account. 
	
	public List<Transaction> getAccountXactions(Account account){
		//connect to service which connects to database to retrieve xactions by account Id 
		Transaction xaction = new Transaction(account.getAccountId(),TransactionType.Deposit,CurrencyCode.EGP,1000);
		Transaction xaction1 = new Transaction(account.getAccountId(),TransactionType.Deposit,CurrencyCode.EGP,2000);
		
		 List<Transaction> transactions = new ArrayList<>();
		 transactions.add(xaction);
		 transactions.add(xaction1);
			
		return transactions;	
	}
	
	

}
