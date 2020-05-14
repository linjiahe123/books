package com.example.hello.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.example.hello.pojo.User;

@Mapper
public interface UserDAO {
	
	@Select("SELECT * FROM ONETOONE_USER WHERE name = #{username}")

	@Results({
		@Result(id=true,column="Id",property="id"),
		@Result(column="Name",property="name"),
		@Result(column="Password",property="password"),
		@Result(column="card_id",property="card",
		many=@Many(select="com.example.hello.mapper.CardMapper.findALL",fetchType= FetchType.LAZY))
})

	public  User selectUserByNameAndPassword(@Param("username") String userName, @Param("password") String password);

}
