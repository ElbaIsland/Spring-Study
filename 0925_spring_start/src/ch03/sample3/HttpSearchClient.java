package ch03.sample3;

public class HttpSearchClient implements SearchClient {

	@Override
	public void addDocument(SearchDocument searchDocument) {
		// TODO Auto-generated method stub
		System.out.println("문서추가 완료");
	}

	@Override
	public void checkLive() {
		// TODO Auto-generated method stub
		System.out.println("상태 확인");
	}

}
