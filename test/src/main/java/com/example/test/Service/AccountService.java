package com.example.test.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.DTO.AccountInput;
import com.example.test.model.Account;
//import com.example.test.model.Account;
import com.example.test.repository.AccountRepo;

@Service
public class AccountService {
  @Autowired
  public AccountRepo accountRepo;
	
	public Account register(AccountInput accountInput) throws ParseException {
		int count = accountRepo.countUserName(accountInput.getUserName());
		System.out.println(count);
		if(count>0)
		{
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date date = formatter.parse(accountInput.getDayOfUpdate());
		Account account = new Account();
		account.setDayOfUpdate(date);
		account.setUserName(accountInput.getUserName());
		account.setPassword(accountInput.getPassword());
		accountRepo.save(account);
		return account;
	}
	
	
	public String login(String userName,String password) {
		System.out.println(userName);
		System.out.println(password);
	     Account account = accountRepo.checkLogin(userName, password);
	     System.out.println(account);
		if(account != null) {
			return "thanh comg";
		}
		return "that bai";
		
	}
	
	public String changePass(int id,String pass,String passOld) {
		Account account = accountRepo.findById(id).get();
		if(account.getPassword().equals(passOld)) {
			account.setPassword(pass);
			accountRepo.save(account);
			return "thanhcong";
		}
		return "mat khau cu khong dung";
		
	}
}
