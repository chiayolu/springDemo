package com.my.AccountOperation.service;

import com.my.AccountOperation.pojo.Account;

/**
 * @author Administrator
 *
 */
public interface AccountService {
	
	public void transfer(Account account1, Account account2, int money);
}
