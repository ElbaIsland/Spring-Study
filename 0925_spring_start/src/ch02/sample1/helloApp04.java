package ch02.sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ch01.sample2.MessageBeanInterFace;

public class helloApp04 {

	// DL의 두가지 방식 중 첫번째, 생성자를 활용하는 방식(자세한건 pdf참고)
	
	public static void main(String[] args) {
		
		// spring container 생성
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/ch02/sample1/beans.xml"));
		MessageBean bean =
				(MessageBean) factory.getBean("messageBean");	// () 뒤에 interface.class 안붙이면 이렇게 캐스팅을 해줘야... 
				// or factory.getBean("messageBean", MessageBean.class); 로..		
		
		// 실행과 동시에 beans.xml에서 impl에 값을 넣어준다, so xml에서 설정한 그 값이 그대로 출력된다. 
		bean.sayHello();	
		
	}
	
}
