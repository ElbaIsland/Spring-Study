package ch03.sample3;

import org.springframework.beans.factory.FactoryBean;

public class SearchClientFactoryBean implements FactoryBean<SearchClientFactory>{

	private String server;
	private int port;
	private String encoding = "utf-8";
	private String contentType;
	private SearchClientFactory searchClientFactory;
	
	public void setServer(String server) {
		this.server = server;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public void setSearchClientFactory(SearchClientFactory searchClientFactory) {
		this.searchClientFactory = searchClientFactory;
	}
	
	// FactoryBean.getObject를 가져와서 따로 처리하는것, main에서 getbean 실행시 이것도 같이 실행됨
	@Override
	public SearchClientFactory getObject() throws Exception {
		if (this.searchClientFactory != null) {
			return this.searchClientFactory;
		}
		SearchClientFactoryBuilder builder = new SearchClientFactoryBuilder();
		// 서버, 포트 등등등 세팅
		builder.server(server)
			   .port(port)
			   .contentType(contentType == null ? "json" : contentType)
			   .encoding(encoding);
		
		//build()가 SearchClientFactory를 새로운 주소에 넣어주는 역할??
		SearchClientFactory searchClientFactory = builder.build();
		
		
		searchClientFactory.init();
		// 실행 후, HttpSearchCilentFactory 초기화 - 10.20.30.40:8888, json, utf-8 이부분으로...
		// + HttpSearchCilentFactory부분으로 ㄱㄱ
		
		this.searchClientFactory = searchClientFactory;
		return this.searchClientFactory; // 이 리턴 = HttpSearchCilentFactory
		
	}
	
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return SearchClientFactory.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
