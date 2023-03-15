package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test(){
		System.out.println("源码环境构建成功...");
		return "源码环境构建成功";
	}

	/*@Value("${com.name}")
	private String name;

	@Value("${com.location}")
	private String location;

	@RequestMapping("/profile")
	public String profileTest(){
		System.out.println(name + "hello springboot ! " + location);
		return name + "hello springboot ! " + location;
	}*/


}
