package com.my.base;


import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * 所有测试类的基类，用于完成对Spring配置文件的加载和销毁。
 * 并通过其getBean()方法获得相应的bean的对象
 */
public class UnitTestBase {
	
	private String springXmlPath;
	
	private ClassPathXmlApplicationContext context;
	
	
	public UnitTestBase(String springXmlPath) {
		this.springXmlPath = springXmlPath;
		
	}

	@Before
	public void before(){
		if (StringUtils.isEmpty(springXmlPath)) {
			springXmlPath = "classpath*:spring-*.xml*";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

	@After
	public void after() {
		context.destroy();
	}

	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		return (T)context.getBean(beanId);
	}

	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
}
