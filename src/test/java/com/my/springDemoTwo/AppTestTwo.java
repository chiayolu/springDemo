package com.my.springDemoTwo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.springDemo.App;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class AppTestTwo {
	
	@Resource
	ApplicationContext ctx;
	
	@Test
	public void testDate() {
		App app = (App) ctx.getBean("app");
		app.AppMethod();
	}

}
