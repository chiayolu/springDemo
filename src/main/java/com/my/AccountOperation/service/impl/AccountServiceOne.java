package com.my.AccountOperation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.AccountOperation.dao.AccountDAO;
import com.my.AccountOperation.pojo.Account;
import com.my.AccountOperation.service.AccountService;

@Component("accountService")
public class AccountServiceOne implements AccountService{

	@Resource
	AccountDAO accountDAO;
	
	@Override
	public void transfer(Account account1, Account account2, double money) {
		// TODO Auto-generated method stub
		accountDAO.inMoney(account1, money);
		accountDAO.outmoney(account2, money);
//		Account account = new Account();
//		account.setName("User1");
//		account.setMoney(200);
//		accountDAO.updateUser(account);
	}

}
