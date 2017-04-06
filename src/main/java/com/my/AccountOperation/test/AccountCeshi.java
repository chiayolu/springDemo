package com.my.AccountOperation.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.AccountOperation.pojo.Account;
import com.my.AccountOperation.service.AccountService;

@Component("account")
public class AccountCeshi {
	@Resource
	AccountService accountService;
	
	public AccountCeshi() {
		// TODO Auto-generated constructor stub
	}
	
	public void AccountOne() {
		Account account1 = new Account();
		Account account2 = new Account();
		account1.setName("user1");
		account2.setName("user2");
		account1.setMoney(1000);
		account2.setMoney(1000);
//		System.out.println("User1:" + user1.getMoney());
//		System.out.println("User2:" + user2.getMoney());
		
		accountService.transfer(account1, account2, 50);
		
//		System.out.println("User1:" + user1.getMoney());
//		System.out.println("User2:" + user2.getMoney());
	}
}
