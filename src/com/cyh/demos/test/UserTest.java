package com.cyh.demos.test;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyh.demos.springmvc.entity.User;
import com.cyh.demos.springmvc.service.impl.IUserService;

public class UserTest {

	@Resource
	private IUserService userService;
	private ApplicationContext ac= null;
	public static void main(String[] args) {
		UserTest userTest = new UserTest();
		userTest.ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userTest.userService = (IUserService) userTest.ac.getBean("userService");
		User user = userTest.userService.getUserById(1);
		System.out.println(user);

	}

}
