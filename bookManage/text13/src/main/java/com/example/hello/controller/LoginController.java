package com.example.hello.controller;

import com.example.hello.result.result;
import com.example.hello.service.UserService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import com.example.hello.pojo.User;


@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public result login(@RequestBody User requestUser) {
    // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        String password = requestUser.getPassword();
        result result = new result();
        
        User user = userService.selectUserByNameAndPassword(username, password);

        if (null == user) {
        	String massage = "账号密码错误";
            return new result(400);
        } else {
        	Map<String,Object> map = new HashMap<String,Object>();
        	result.setCode(200);
        	map.put("userid", user.getId());
        	result.setData(map);
        }
            return result;
        
    }
}
