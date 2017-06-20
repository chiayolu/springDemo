package com.my.springDemoOne;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.my.base.UnitTestBase;
import com.my.springDemo.App;


@RunWith(BlockJUnit4ClassRunner.class)	//Junit通过Runner来执行你的代码。BlockJUnit4ClassRunner为默认Runner，所以这条语句可以不写
public class AppTestOne extends UnitTestBase {

	public AppTestOne() {
		super("classpath*:applicationContext.xml");
	}

	@Test
	public void testDate() {
		App app = super.getBean("app");
		app.AppMethod();
	}

}
