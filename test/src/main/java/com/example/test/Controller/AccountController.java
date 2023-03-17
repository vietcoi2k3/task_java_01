package com.example.test.Controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.DTO.AccountInput;
import com.example.test.Service.AccountService;
import com.example.test.model.Account;

@RestController

public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public Account Register(@RequestBody AccountInput accountInput) throws ParseException {
		return accountService.register(accountInput); 
	}
	
	@RequestMapping(value ="/login",method = RequestMethod.POST)
	public String Login( String userName, String pass) {
		return accountService.login(userName, pass);
	}
	
	@RequestMapping(value = "/changePass",method = RequestMethod.PUT)
	public String changePass( int id, String pass, String passOld) {
		return accountService.changePass(id, pass,passOld);
	}
}
