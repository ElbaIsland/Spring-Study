package ch03.sample2;

public interface ErpClient {

	public void connect();
	public void close();
	public void sendPurchaseInfo(ErpOrderData oi);
	
}
