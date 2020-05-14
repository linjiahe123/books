package com.example.hello.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.dao.BookDAO;
import com.example.hello.pojo.Book;
import com.example.hello.pojo.User;
import com.example.hello.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookDAO bookDao;
	
	@Override
	public List<Book> list(Integer userid) {
		return bookDao.findALL(userid);
}
}
