package ch02.sample3.service2;

public class AuthFalilLogger {

	private int threshold;
	private int failCount;
	
	public void insertBadPw(String userId, String inputPw) {
		System.out.printf("AuthFail [type=badpw, userid=%s, pw=%s]\n", userId, inputPw);
		failCount++;
		if (threshold > 0 && failCount > threshold) {	// threshold > 0을 굳이 할필요가 있나? 저거 지워도 ok
			notifyTooManyFail();
			failCount = 0;
		}
	}

	private void notifyTooManyFail() {
		System.out.println("로그인 시도횟수 초과!!!!!");		
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	
	
	
}
