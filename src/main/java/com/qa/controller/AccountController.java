package com.qa.controller;

import java.util.List;

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

	@GetMapping("/find-account/{id}")
	@ResponseBody
	public Account findAccount(@PathVariable long id) {
		return service.findAccount(id);
	}

	@GetMapping("/get-all-accounts/")
	@ResponseBody
	public List<Account> listAccounts() {
		return service.listAllAccounts();
	}

	@GetMapping("/del-account/{id}")
	@ResponseBody
	public String deleteAccount(@PathVariable long id) {
		return service.delAccount(id);
	}

	@GetMapping("/wipe-all-account/{id}")
	@ResponseBody
	public String wipeAccounts(@PathVariable long id) {
		return service.delAllAccount();
	}

}
