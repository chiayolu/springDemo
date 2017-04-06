package com.my.AccountOperation.service;

import com.my.AccountOperation.pojo.User;

/**
 * @author Administrator
 *
 */
public interface AccountService {
	
	public void transfer(User user1, User user2, double money);
}
