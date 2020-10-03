package ch03.sample2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForErp {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ch03/sample2/Beans.xml");
		ErpClientFactory factory = ctx.getBean("factory", ErpClientFactory.class);
		ErpClient client = factory.create();
		
		client.connect();
		client.close();
		
		ctx.close();
	}
	
}
