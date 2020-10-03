package ch02.sample2.after;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBySpring {

   public static void main(String[] args) {
      String configLocation = "classpath:ch02/sample2/after/applicationContext.xml";
      // ApplicationContext을 만들면 xml에 설정한 bean 클래스들이 모두 '일단' '생성'된다
      AbstractApplicationContext ctx = 
            new GenericXmlApplicationContext(configLocation);
      Project project = ctx.getBean("sampleProject", Project.class);
      project.build();
      ctx.close();
   }

}