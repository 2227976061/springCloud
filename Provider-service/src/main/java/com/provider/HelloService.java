package com.provider.Service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/** 
* @author : ren.zhen
* @date   ：2018年11月22日 上午11:15:39 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public interface HelloService {
	@RequestMapping(value="/feign-service/serviceGet",method=RequestMethod.GET)
	String helloService(@RequestParam("name") String name);
	
	@RequestMapping(value="/feign-service/serviceHead", method=RequestMethod.HEAD)
	String helloService(@RequestHeader("name") String name,
			@RequestHeader("password") String password);
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	String helloService();
}
