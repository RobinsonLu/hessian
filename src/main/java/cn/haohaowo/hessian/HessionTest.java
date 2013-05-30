package cn.haohaowo.hessian;


import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://localhost:8888/hessian/test/test";
		
		HessianProxyFactory proxy = new HessianProxyFactory();
		try {
			BasicAPI basic = (BasicAPI) proxy.create(BasicAPI.class, url);
			System.out.println("hello() : " + basic.sayHello());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
