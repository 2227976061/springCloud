package com.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getUser() {
		return restTemplate.getForObject("http://provider-service/getUser", String.class);
	}
	
}
