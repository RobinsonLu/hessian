package cn.haohaowo.spring.chapter;

public class HelloApiDecorator implements HelloApi {

	private HelloApi helloApi;
	
	public HelloApiDecorator() {}
	
	public HelloApiDecorator(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
	
	public HelloApi getHelloApi() {
		return helloApi;
	}
	
	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	public void sayHello() {
		System.out.println("======װ��һ��========");
		helloApi.sayHello();
		System.out.println("======װ��һ��========");
	}

}
