package com.example.hello.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.hello.pojo.Book;



@Mapper
public interface BookDAO 
	{
		@Select ("SELECT * FROM BOOKS WHERE USER_ID = #{id}")
		@Results({
			@Result(id=true,column="id", property="id"),
			@Result(column="title" ,property="title"),
			@Result(column="author", property="author"),
			@Result(column="press", property="press"),
			@Result(column="date", property="date"),
			@Result(column="cover" ,property="cover"),
			@Result(column="abstract" ,property="abs")
			
		})
		List<Book> findALL(Integer user_id);
	}