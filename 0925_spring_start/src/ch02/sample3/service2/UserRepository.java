package ch02.sample3.service2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// = 기존 java의 DAO
public class UserRepository {
	
	private Map<String, User> userMap = new HashMap<>();
	
	public User findUserByID(String id) {
	//	System.out.println(userMap.get(id));
		return userMap.get(id);
		
		// map.get : Associates the specified value with the specified key in this map
	}
	
	// user 등록하자마자 usermap이 만들어지고, 거기에 user id와 해당 userdata가 들어감
	public void setUsers(List<User> users) {
		int count = 0;
		for (User u : users) {
			userMap.put(u.getId(), u);
			System.out.println("==user 세팅");
			count++;
		}
		System.out.println(count + "개의 계정 업데이트 완료");
	}
	
	
}
