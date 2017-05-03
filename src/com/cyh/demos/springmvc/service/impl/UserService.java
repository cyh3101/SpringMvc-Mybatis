package com.cyh.demos.springmvc.service.impl;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.stereotype.Service;

import com.cyh.demos.springmvc.dao.IUserDAO;
import com.cyh.demos.springmvc.entity.User;

@Service("userService")
public class UserService implements IUserService{

	@Resource
	private IUserDAO userDao;
	
	@Override
	public User getUserById(int id) {
		User user = this.userDao.findById(id);
		return user;
	}

}
