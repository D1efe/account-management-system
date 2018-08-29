package com.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.qa.Domain.Account;
import com.qa.Repository.AccountRepository;

@Service
@ApplicationScope
public class AccountService {

	@Autowired
	private AccountRepository accountRepo;

	public AccountService(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	public Account addAccount(Account account) {
		return accountRepo.save(account);
	}

	public Account findAccount(long id) {
		return accountRepo.findById(id).get();
	}

	public List<Account> listAllAccounts() {
		return accountRepo.findAll();
	}

	public String delAccount(long id) {
		accountRepo.deleteById(id);
		return "Account has been deleted";
	}

	public String delAllAccount() {
		accountRepo.deleteAll();
		return "All accounts have been deleted";
	}

}
