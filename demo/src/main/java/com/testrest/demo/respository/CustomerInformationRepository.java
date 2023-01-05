package com.testrest.demo.respository;

import java.util.ArrayList;
import java.util.List;

import com.testrest.demo.model.CurrencyCode;
import com.testrest.demo.model.CustomerInformation;
import com.testrest.demo.model.Transaction;
import com.testrest.demo.model.TransactionType;

public class CustomerInformationRepository {
	
	
	// given transaction id and account id , return customer information
	public CustomerInformation getCustomerInformation(int xactionId,int accountId) {
		CustomerInformation customerInfo = new CustomerInformation("heba","mahmoud",20000);
		// get xaction list associated with customer
		Transaction xaction = new Transaction(accountId,TransactionType.Deposit, CurrencyCode.EGP, 1000);
		Transaction xaction2 = new Transaction(accountId,TransactionType.Deposit, CurrencyCode.EGP, 2000);
		
		List<Transaction> xactions = new ArrayList<Transaction>();
		xactions.add(xaction);
		xactions.add(xaction2);
		customerInfo.setTransactionsList(xactions);
		
		return  customerInfo;
		
	}

}
