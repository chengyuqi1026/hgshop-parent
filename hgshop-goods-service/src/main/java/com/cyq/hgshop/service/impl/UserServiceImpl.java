package com.cyq.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cyq.hgshop.config.AdminProperties;
import com.cyq.hgshop.service.UserService;

/**
 * 
 * @ClassName: UserServiceImpl 
 * @Description:用户的实现类
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:37:32
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService {

	
	//得到管理员的信息
	@Autowired
	AdminProperties adminPro;
	
	/**
	 * 登录
	 */
	@Override
	public boolean login(String userName, String passWord) {

		boolean a = adminPro.getAdminName().equals(userName);
		 boolean b = adminPro.getPassword().equals(passWord);
		 
		 if(a==true && b==true) {
			 return true;
		 }else {
			 
			 return false;
		 }
	}

}
