package com.cyq.hgshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: IndexController 
 * @Description: 主页的控制层
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:35:52
 */
@Controller
public class IndexController {
	
	
	@RequestMapping({"/","index"})
	public String index(){
		return "index";
	}
	
}
