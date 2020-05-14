package com.example.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hello.pojo.Book;


@Service
public interface BookService {
	 public List<Book> list(Integer userid);

}
