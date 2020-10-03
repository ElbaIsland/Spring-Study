package ch02.sample2.before;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// 스프링을 안쓰고 무식하게 코딩하는 과정, 이것이 after에서 어떻게 바뀌는지 check하자!
		
		MavenBuildRunner buildrunner = new MavenBuildRunner();
		buildrunner.setMavenPath("c:\\temp");
		
		Project sampleProject = new Project();
		List<String> srcDirs = new ArrayList<>();
		srcDirs.add("src");
		srcDirs.add("srcResources");
		sampleProject.setSrcDirs(srcDirs);
		sampleProject.setBinDir("bin");
		sampleProject.setBuildRunner(buildrunner);	// project클래스와 MavenBuildRunner클래스를 인젝션
		
		sampleProject.build();
	}
	
	
}
