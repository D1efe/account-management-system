package com.qa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.qa.Domain.Account;
import com.qa.Repository.AccountRepository;

@Service
@ApplicationScope
public class AccountService {

	private AccountRepository accountRepo;
	
	public AccountService(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}
	
	public Account addAccount(Account account) {
		return accountRepo.save(account);
	}
	
	public Iterable<Account> listUsers() {
		return accountRepo.findAll();
	}
	
	public String delAccount(long id) {
		accountRepo.deleteById(id);
		return "Account has been deleted";
	}
	
}
