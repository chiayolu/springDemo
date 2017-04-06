package com.my.AccountOperation.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.AccountOperation.pojo.User;
import com.my.AccountOperation.service.AccountService;

@Component
public class Account {
	@Resource
	AccountService accountService;
	
	User user1 = new User();
	User user2 = new User();
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public void AccountOne() {
//		user1.setName("user1");
//		user2.setName("user2");
//		user1.setMoney(100);
//		user2.setMoney(100);
//		System.out.println("User1:" + user1.getMoney());
//		System.out.println("User2:" + user2.getMoney());
		
		accountService.transfer(user1, user2, 50);
		
//		System.out.println("User1:" + user1.getMoney());
//		System.out.println("User2:" + user2.getMoney());
	}
}
