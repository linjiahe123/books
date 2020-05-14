package com.example.hello.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.dao.UserDAO;
import com.example.hello.pojo.User;
import com.example.hello.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	
	@Override
	public User selectUserByNameAndPassword(String userName, String password) {
		return userDao.selectUserByNameAndPassword(userName,password);
	}

}
