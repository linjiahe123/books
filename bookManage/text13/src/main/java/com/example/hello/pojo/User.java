package com.example.hello.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

	public User() {
		super();
	}
		// TODO Auto-generated constructor stub
	public List<Book> getBook() {
		return book;
	}
	public void setBook( List<Book> book) {

		this.book = book;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 用户标识
	private Integer id;
	// 用户姓名
	private String name;
	// 用户性别
	private String password;
	
	private List<Book> book;
	
    String username;

}