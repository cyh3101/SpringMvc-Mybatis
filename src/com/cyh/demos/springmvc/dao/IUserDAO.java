package com.cyh.demos.springmvc.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.cyh.demos.springmvc.entity.User;

@MapperScan
public interface IUserDAO {
		void save(User user);
		boolean update(User user);
		boolean delete(int id);
		User findById(int id);
		List<User> findAll();
}
