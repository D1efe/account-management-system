package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Domain.Account;
import com.qa.service.AccountService;

@RestController
@RequestMapping("/accountapp")
public class AccountController {
	
	@Autowired
	private AccountService service;

	public AccountController(AccountService service) {
		this.service = service;
	}
	
	@GetMapping("/add-account/{addUser}")
	@ResponseBody
	public Account addAccount(@PathVariable Account addUser) {
		return service.addAccount(addUser);
	}

	@GetMapping("/all-accounts/")
	@ResponseBody
	public Iterable<Account> listAccounts() {
		return service.listUsers();
	}
	
	@GetMapping("/del-account/{id}")
	@ResponseBody
	public String deleteAccount(@PathVariable long id) {
		return service.delAccount(id);
	}	

}
