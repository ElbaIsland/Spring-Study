package ch03.sample3;

public class HttpSearchCilentFactory implements SearchClientFactory {

	private String server;
	private String contentType;
	private String encoding;

	public HttpSearchCilentFactory(String server, String contentType, String encoding) {
		this.server = server;
		this.contentType = contentType;
		this.encoding = encoding;
	}
	
	@Override
	public void init() {
		System.out.printf("HttpSearchCilentFactory 초기화 - %s, %s, %s\n", server, contentType, encoding);	
	}
	@Override
	public SearchClient create() {
		// TODO Auto-generated method stub
		return new HttpSearchClient();
	}
	
	@Override
	public String toString() {
		return "HttpSearchCilentFactory [server=" + server + ", contentType=" + contentType + ", encoding=" + encoding
				+ "]";
	}
	
}
