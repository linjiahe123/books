package com.example.hello.controller;
import com.example.hello.result.result;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import com.example.hello.pojo.Book;
import com.example.hello.pojo.User;
import com.example.hello.service.BookService;;	


@Controller
public class libraryController {
	
	@Autowired
	BookService bookService;
	
    @CrossOrigin
    @GetMapping(value = "/api/books")
    @ResponseBody
    public List<Book> listBooks(@RequestParam("userid")String userid){
    	
    	System.out.println("here");
    	Integer userID = new Integer(userid);
    	List<Book> books = bookService.list(userID);
    	return books;
    }

}
