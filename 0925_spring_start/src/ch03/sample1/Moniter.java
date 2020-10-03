package ch03.sample1;

import java.util.Map;

public class Moniter {

	private Map<String, Sensor> sensorMap;
	private Map<String, Integer> config;
	
	public void setSensorMap(Map<String, Sensor> sensorMap) {
		this.sensorMap = sensorMap;
	}
	public void setConfig(Map<String, Integer> config) {
		this.config = config;
	}
	
	@Override
	public String toString() {
		return "Moniter [sensorMap=" + sensorMap + ", config=" + config + "]";
	}
	
	
	
}
