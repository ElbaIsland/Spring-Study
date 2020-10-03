package ch02.sample2.after;

import java.util.List;

public class Project {

	private List<String> srcDirs;
	private String binDir;
	private MavenBuildRunner buildRunner;
	
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
