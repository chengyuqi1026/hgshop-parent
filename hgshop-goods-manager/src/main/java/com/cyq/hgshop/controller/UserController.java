package com.cyq.hgshop.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyq.hgshop.service.UserService;


/**
 *
 * @ClassName: UserController 
 * @Description: 用户控制层
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:36:09
 */
@Controller
public class UserController {
	
	
	
	@Reference(timeout=2000,version="1.0.0")
	UserService userService;
	
	/**
	 * 
	* @Title: toLogin 
	* @Description: 去到登录页面的方法 
	* @return String
	 */
	@RequestMapping("tologin")
	public String toLogin() {
		return "login";
	}
	
	/**
	 * 
	* @Title: login 
	* @Description: 登录的方法 
	* @param name
	* @param password
	* @return String
	 */
	@RequestMapping("login")
	public String login(String name,String password ) {
		
		System.out.println("name " + name + " password " + password);
		
		if(userService.login(name, password))
			return "redirect:/";
		else {
			return "login";
		}
	}
	
	
	
}
