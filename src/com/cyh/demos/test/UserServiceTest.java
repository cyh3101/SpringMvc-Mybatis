package com.cyh.demos.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.demos.springmvc.entity.User;
import com.cyh.demos.springmvc.service.impl.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserServiceTest {

	//@Resource
	private IUserService userService = null;
	//private ApplicationContext ac = null;
	@Test
	public void testGetUserById() {
		//ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");  
        //userService = (IUserService) ac.getBean("userService"); 
		User user = userService.getUserById(1);
		System.out.println(user);
	}

}
