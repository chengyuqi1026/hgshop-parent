package com.cyq.hgshop.service;

/**
 * 
 * @ClassName: UserService 
 * @Description: 用户接口
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:35:34
 */
public interface UserService {
	
	/**
	 * 
	* @Title: login 
	* @Description: 登录的方法 
	* @param userName
	* @param passWord
	* @return boolean
	 */
	boolean login(String userName,String passWord);
	
}
