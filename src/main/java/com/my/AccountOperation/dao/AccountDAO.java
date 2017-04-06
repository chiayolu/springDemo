package com.my.AccountOperation.dao;

import org.apache.ibatis.annotations.Param;

import com.my.AccountOperation.pojo.User;

public interface AccountDAO {

	public boolean inMoney(@Param("user1") User user1, @Param("money") double money);

	public boolean outmoney(@Param("user2") User user2, @Param("money") double money);
}
