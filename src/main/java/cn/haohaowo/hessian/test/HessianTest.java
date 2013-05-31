package cn.haohaowo.hessian.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.haohaowo.hessian.BasicAPI;

public class HessianTest {

	@Autowired
	private BasicAPI basic;
	@Before
	public void setUp() throws Exception {
		final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-app.xml");
		basic = (BasicAPI) context.getBean("myServiceClient");
	}
	
	@Test
	public void test() {
		assertEquals("Hello1", basic.sayHello());
	}
}
