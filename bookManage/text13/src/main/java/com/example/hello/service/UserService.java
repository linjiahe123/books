package com.example.hello.service;

import org.springframework.stereotype.Service;

import com.example.hello.pojo.User;
@Service
public interface UserService {
	public User selectUserByNameAndPassword(String userName, String password);

}
