package ch01.sample2;

public class hello02 {

	public static void main(String[] args) {
		
		// 언어 등 다양한 이유에 따라 두가지 다른 타입의 메소드를 출력시키고 싶다면??
		// 이렇게 interface를 만들어 상황에따라 KR, EN을 사용하도록 하믄 된다잉
		
		MessageBeanInterFace bean = new MessageBeanKR();
		// KR, EN으로 바꿔주기만 하면 상황따라 두가지 타입을 use 건웅!
		// but 실제 근무환경에서 이런식으로 하면...복잡하고 힘들겄지? 그래서 이 다음과정으로 넘어간다.
		bean.sayHello("Spring");
		System.out.println("===================");
		
		
		
	}
}
