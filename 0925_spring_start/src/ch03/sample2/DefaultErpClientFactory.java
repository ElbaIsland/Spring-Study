package ch03.sample2;

import java.util.Properties;

public class DefaultErpClientFactory extends ErpClientFactory {

	private String server;
	
	public DefaultErpClientFactory(Properties prop) {
		this.server = prop.getProperty("server");
	}
	
	
	@Override
	public ErpClient create() {
		
		return new ErpClient() {
			
			@Override
			public void connect() {
				// TODO Auto-generated method stub
				System.out.println("연결완료 > " + server);
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				System.out.println("연결끊음 > " + server);
			}

			@Override
			public void sendPurchaseInfo(ErpOrderData oi) {
				// TODO Auto-generated method stub
				System.out.println("주문정보 전송" + server);
				
			}
			
		};
	}

	
	
	
}
