package com.my.AccountOperation.dao;

import org.apache.ibatis.annotations.Param;

import com.my.AccountOperation.pojo.Account;

public interface AccountDAO {

	public boolean inMoney(@Param("account1") Account account1, @Param("money") double money);

	public boolean outmoney(@Param("account2") Account account2, @Param("money") double money);
	
//	public boolean updateUser(Account account);
}
