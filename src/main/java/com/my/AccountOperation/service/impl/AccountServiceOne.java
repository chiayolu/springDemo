package com.my.AccountOperation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.AccountOperation.dao.AccountDAO;
import com.my.AccountOperation.pojo.User;
import com.my.AccountOperation.service.AccountService;

@Component("accountService")
public class AccountServiceOne implements AccountService{

	@Resource
	AccountDAO accountDAO;
	
	@Override
	public void transfer(User user1, User user2, double money) {
		// TODO Auto-generated method stub
		accountDAO.inMoney(user1, money);
		accountDAO.outmoney(user2, money);
	}

}
