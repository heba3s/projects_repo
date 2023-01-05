package com.testrest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testrest.demo.model.Account;
import com.testrest.demo.model.CustomerAccountRQ;
import com.testrest.demo.respository.AccountsRepository;

@RestController
public class CustomerAccountsController {
	
	
	private AccountsRepository accountRepository ;
	private CustomerTransactionController customerXactionController;
	
	@Autowired
	public CustomerAccountsController() {
		accountRepository = new AccountsRepository();
		customerXactionController = new CustomerTransactionController();
		
	}
	
	@PostMapping("/accounts")
    public ResponseEntity<?> createCurrentAccount(@RequestBody CustomerAccountRQ customerAccRq) {
		//create customer account 
		Account account = accountRepository.createAccount(customerAccRq.getCustomerID(), customerAccRq.getInitialCredit());
		if(customerAccRq.getInitialCredit()!=0) {
			return customerXactionController.addTransaction(account) ;		

		}	
        return new ResponseEntity < Account > (account, HttpStatus.OK);
    }
	
	
}
