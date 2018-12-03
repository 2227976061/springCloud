package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.HomeService;
import com.consumer.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private HomeService homeService;
	@RequestMapping("getUser")
	public String getUser() {
		return userService.getUser();
	}
	@RequestMapping("getHome")
	public String getHome() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return homeService.index();
	}
	
	@RequestMapping("getConsumerServiceApi")
	public String getConsumerServiceApi() {
		return "this Consumer 订单服务工程";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String demoServiceTest() {
		return homeService.helloService("yuanyuan")+":"+homeService.helloService("yjt","xixihaha");
		
	}
	@RequestMapping(value="/yuanyuan", method=RequestMethod.GET)
	public String helloService1() {
		return homeService.helloService("yuanyuan");
		
	}
	@RequestMapping(value="/yjt", method=RequestMethod.GET)
	public String helloService2() {
		return homeService.helloService("yjt","xixihaha");
		
	}
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		 
		return homeService.helloService();
		
	}
	
}
