package ch02.sample1;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {

	private String filePath;
	
	public void output(String message) throws IOException{
		
		// FileWriter 기억나제?? file에다가 message 내용을 작성해줄겨
		FileWriter fw = new FileWriter(filePath);
		fw.write(message);
		fw.close();
		
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	
}
