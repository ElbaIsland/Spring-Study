package ch02.sample3.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainByXML {

	public static void main(String[] args) {
	
		 String configLocation = "classpath:ch02/sample3/service/config.xml";
	      // ApplicationContext을 만들면 xml에 설정한 bean이 모두 '일단' '생성'된다
	      AbstractApplicationContext ctx = 
	            new GenericXmlApplicationContext(configLocation);
	      
	      UserRepository ur = ctx.getBean("userRepository", UserRepository.class);
	      
	      User u = ur.findUserByID("haram511");
	      System.out.println(u);
	      ctx.close(); // 이걸 해줘야 데이터가 꼬이지 않겄지?
		
	}
	
}
