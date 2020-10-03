package ch02.sample3.service2;

public class PasswordChangeService {

	private UserRepository userRepository;
	
	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void changePassword(String userId, String oldPw, String newPw) {
		User user = userRepository.findUserByID(userId);
		if (user == null) {
			throw new UserNotFoundException();
		}
		
		user.changePw(oldPw, newPw);
	}
	
	
}
