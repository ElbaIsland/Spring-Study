package ch03.sample2;

import java.util.Properties;

public abstract class ErpClientFactory {

	public static ErpClientFactory instance() {
		Properties prop = new Properties();
		prop.setProperty("server", "localhost");
		return instance(prop);
	}
	
	// properties가 들어오면 
	public static ErpClientFactory instance(Properties props) {
		return new DefaultErpClientFactory(props);
	}
	
	protected ErpClientFactory() {}	// 싱글톤, 자원소모를 줄위기 위해 하나의 인스턴스만 활용하게할것
	
	
	// default 클래스에서 이를 오버라이딩해서 활용
	public abstract ErpClient create();
	
}
