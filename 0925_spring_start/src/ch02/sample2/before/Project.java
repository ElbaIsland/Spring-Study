package ch02.sample2.before;

import java.util.List;

public class Project {

	private List<String> srcDirs;
	private String binDir;
	private MavenBuildRunner buildRunner;	// spring을 안쓸시의 와이어링?
	
	public void build() {
		buildRunner.build(srcDirs, binDir);
	}

	public void setSrcDirs(List<String> srcDirs) {
		this.srcDirs = srcDirs;
	}
	public void setBinDir(String binDir) {
		this.binDir = binDir;
	}
	public void setBuildRunner(MavenBuildRunner buildrunner) {
		this.buildRunner = buildrunner;
	}
	
	
	
}
