package ch02.sample3.service2;

public class User {

	private String id;
	private String pw;
	
	public User(String id, String pw) {
		this.id = id;	this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return "고갱님의 계정 정보입니다. id=" + id + ", pw=" + pw + " 입니다.";
	}

	public boolean matchPw(String inputpw) {
		return pw.equals(inputpw);	// 맞으면 true가 리턴되겄구만
	}

	public void changePw(String oldPw, String newPw) {
		if (!matchPw(oldPw)) {
			throw new IllegalArgumentException("비번틀림");
		}
		pw = newPw;
		System.out.println("비번change완료 >" + this);
	}
	
	
	
}
