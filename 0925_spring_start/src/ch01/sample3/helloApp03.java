package ch01.sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ch01.sample2.MessageBeanInterFace;

public class helloApp03 {

	public static void main(String[] args) {
		
		// 	기본적인 스프링 생성 : 아래구문을 통해, 해당 xml파일에서 bean태그를 전부 읽은 뒤(beanfactory는 spring core의 핵심부분)													
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/ch01/sample3/beans.xml")); // FileSystemResource(/으로 클래스 구분하기(?))
	
		// 팩토리.겟 빈(아이디, 아이디에 있는 클래스를 가져올 타입) ==> xml 주소 클래스는 각각 interface의 클래스를 상속받았기에 이렇게 받아올 수 있다!
		MessageBeanInterFace bean = factory.getBean("messageBean", MessageBeanInterFace.class);
		bean.sayHello("Spring");
		System.out.println("===================");
		MessageBeanInterFace bean2 = factory.getBean("messageBean2", MessageBeanInterFace.class);
		bean2.sayHello("Spring");		

		
	}
}
