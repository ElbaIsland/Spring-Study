package ch02.sample3.service;

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
	
	
	
}
