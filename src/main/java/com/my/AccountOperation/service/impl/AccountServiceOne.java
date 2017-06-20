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
	
	/**
	 * 从account1转money的钱数到account2
	 * */
	@Override
	public void transfer(Account account1, Account account2, int money) {
		// TODO Auto-generated method stub
//		accountDAO.inMoney(account1, money);
//		accountDAO.outmoney(account2, money);

		
		account1 = accountDAO.getAccountByName(account1.getName());
		account2 = accountDAO.getAccountByName(account2.getName());
		account1.setMoney(account1.getMoney() - money);
		account2.setMoney(account2.getMoney() + money);
		accountDAO.updateUser(account1);
//		System.out.println(1/0);
		accountDAO.updateUser(account2);
		
	}

}
