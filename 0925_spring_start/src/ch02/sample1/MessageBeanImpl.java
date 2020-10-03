package ch02.sample1;

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
		System.out.println("===이부분은 output test start===");
		try {
			outputter.output(message);
			System.out.println("파일 작성 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Outputter outputter;

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
	
	
}
