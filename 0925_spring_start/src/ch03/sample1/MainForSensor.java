package ch03.sample1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSensor {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ch03/sample1/Beans.xml");
		Moniter moniter = ctx.getBean(Moniter.class);
		System.out.println(moniter);
		ctx.close();
	}
	
}
