package ch01.sample4;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {

	// DL의 두가지 방식 중 첫번째, 생성자를 활용하는 방식(자세한건 pdf참고)
	// (두번째 방식은 setter 활용하는 방식)
	
	private String name;
	private String greeting;
	
	// 생성자(xml constructor-arg)
	public MessageBeanImpl(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public void sayHello() {
		String message = greeting + name + "!!";
		System.out.println(message + "\n");		
	}
	
}
