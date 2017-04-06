package com.my.AccountOperation;


import org.junit.Test;

import com.my.AccountOperation.test.AccountCeshi;
import com.my.base.UnitTestBase;

public class TestAccount extends UnitTestBase{

	public TestAccount() {
		super("classpath*:applicationContext.xml");
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
		
	@Test
	public void testAccount(){
		AccountCeshi account = super.getBean("account");
		account.AccountOne();
	}


}
