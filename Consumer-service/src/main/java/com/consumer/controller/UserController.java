package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("getUser")
	public String getUser() {
		return userService.getUser();
	}
	
	@RequestMapping("getConsumerServiceApi")
	public String getConsumerServiceApi() {
		return "this Consumer 订单服务工程";
	}
	
}
