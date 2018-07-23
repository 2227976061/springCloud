package org.configure.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCircuitBreaker
@RestController
public class ConfigureClientController {

	 @Value("${foo}") // git配置文件里的key
	private String userName;
	
	@RequestMapping("/getUserName")
	public String getUserName() {
		return userName;
	}
}
