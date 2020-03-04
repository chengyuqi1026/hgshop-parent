package com.cyq.hgshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyq.hgshop.pojo.Spec;
import com.cyq.hgshop.service.SpecService;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: SpecController 
 * @Description: 规格的控制层
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:48:58
 */

@Controller
@RequestMapping("spec")
public class SpecController {
	
	@Reference
	SpecService specService;
	
	/**
	 * 
	* @Title: list 
	* @Description: 进入规格的列表
	* @param m
	* @param page
	* @param name
	* @return String
	 */
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue="1")int page,@RequestParam(defaultValue="")String name) {
		
		 PageInfo<Spec> pageInfo = specService.list(name, page);
		 m.addAttribute("pageInfo", pageInfo);
		return "spec/list";
	}
	
	
	@RequestMapping("add")
	@ResponseBody
	public String add(HttpServletRequest request,Spec spec 
	) {
		//System.out.println("spec" + spec);
		//System.out.println();
		spec.getOptions().removeIf(x->{return x.getOptionName()==null;});
		//System.out.println("spec 处理后：" + spec);
		//调用服务
		int add = specService.add(spec);
		return add>0?"success":"false";
	}
}
