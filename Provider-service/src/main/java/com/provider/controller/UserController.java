package com.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provider.Service.HelloService;

@RestController
public class UserController  {

	public Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/getUser")
	public String getUser() {
		log.info("getUser***************:"+port);
		return "getUser:"+port;
	}
	
	@RequestMapping("/getProviderServiceApi")
	public String getProviderServiceApi() {
	 
		return "this is Provider工程";
	}
	
	
}
