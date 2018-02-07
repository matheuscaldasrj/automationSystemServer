/**
 * 
 */
package com.mcaldas.automation.core;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Automation properties definition
 *  
 * @author mcaldas
 */
@Component
@ConfigurationProperties(prefix="automation")
public class AutomationProperties {

	private String configLightMapping;
	private String nodePath;
	private String light1;
	private String light2;
	private String light3;
	
	public String getConfigLightMapping() {
		return configLightMapping;
	}
	public void setConfigLightMapping(String configLightMapping) {
		this.configLightMapping = configLightMapping;
	}
	public String getNodePath() {
		return nodePath;
	}
	public void setNodePath(String nodePath) {
		this.nodePath = nodePath;
	}

	public void setLight1(String light1) {
		this.light1 = light1;
	}

	public void setLight2(String light2) {
		this.light2 = light2;
	}

	public void setLight3(String light3) {
		this.light3 = light3;
	}
	
	
	public String getLightPin(String lightNumber) {
		switch (lightNumber) {
		case "1":
			return this.light1;
		case "2":
			return this.light2;
		case "3":
			return this.light3;
		default:
			break;
		}
		return null;
	}
	
	
	


}