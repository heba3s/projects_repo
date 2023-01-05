package com.testrest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testrest.demo.model.Account;
import com.testrest.demo.model.CustomerInformation;
import com.testrest.demo.model.Transaction;
import com.testrest.demo.respository.CustomerInformationRepository;
import com.testrest.demo.respository.TransactionsRepository;

@RestController
public class CustomerTransactionController {
	
	private TransactionsRepository xactionRepository; 
	private CustomerInformationRepository customerInfoRepo;
	
	@Autowired
	public CustomerTransactionController() {
		xactionRepository = new TransactionsRepository();
		customerInfoRepo = new CustomerInformationRepository();
	}
	
	
	//given account , create a xaction of this account(Internal API).
	@PostMapping("/customer_transactions")
	public ResponseEntity<?>  addTransaction(Account account) {
		Transaction xaction = xactionRepository.addTransaction(account);
		// given transaction id and account id , return customer information
		CustomerInformation userInfo = customerInfoRepo.getCustomerInformation(xaction.getTransID(),account.getAccountId());
		return   new ResponseEntity < CustomerInformation > (userInfo, HttpStatus.OK);
		
	}

}
