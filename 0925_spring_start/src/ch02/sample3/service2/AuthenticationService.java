package ch02.sample3.service2;

public class AuthenticationService {

	private UserRepository userRepository;
	private AuthFalilLogger failLogger;
	
	public AuthInfo authenticate(String id, String pw) {
		User user = userRepository.findUserByID(id);
		if (user == null) {
			throw new UserNotFoundException();
		}
		if (!user.matchPw(pw)) {
			failLogger.insertBadPw(id, pw);
			throw new AuthException();
		}
		return new AuthInfo(user.getId());
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void setFailLogger(AuthFalilLogger failLogger) {
		this.failLogger = failLogger;
	}
	
	
	
}
