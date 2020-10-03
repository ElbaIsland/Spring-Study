package ch02.sample3.service2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainByXML {

	public static void main(String[] args) {
	
		 String configLocation = "classpath:ch02/sample3/service2/config.xml";
	      // ApplicationContext을 만들면 xml에 설정한 bean이 모두 '일단' '생성'된다
	      AbstractApplicationContext ctx = 
	            new GenericXmlApplicationContext(configLocation);
	      
	      UserRepository ur = ctx.getBean("userRepository", UserRepository.class);
	      System.out.println("---------------------------------");
	      
	      User u = ur.findUserByID("haram511");
	      System.out.println(u);
	      System.out.println("---------------------------------\n");
	      
	      AuthenticationService service
	      = ctx.getBean("authenticationService", AuthenticationService.class);
	      
	      runrunrun(service, "haram511", "1235");
	      runrunrun(service, "haram511", "1238");
	      runrunrun(service, "haram511", "129");
	      
	      try {
	    	  service.authenticate("haram911", "1234");
		} catch (UserNotFoundException e) {
			System.out.println("UserNotFoundException!!(현재 안나오게 처리)");
			// e.printStackTrace(); // 이걸넣으면 오류 출력
		}

	      
	      
	      // 이부분부턴 다음날
	      PasswordChangeService pwchangesv = ctx.getBean(PasswordChangeService.class);
	      pwchangesv.changePassword("haram511","1234","qwer");
	      runrunrun(service, "haram511", "1234");
	      
	      service.authenticate("haram511", "qwer");
	      
	      
	      ctx.close(); // 이걸 해줘야 데이터가 꼬이지 않겄지?
		
	}
	
	public static void runrunrun(AuthenticationService service, String userId, String userPw) {
		try {
			service.authenticate(userId, userPw);
		} catch (AuthException e) {
			System.out.println("AuthException!!(현재 안나오게 처리)");
		}
		
	}
	
}
