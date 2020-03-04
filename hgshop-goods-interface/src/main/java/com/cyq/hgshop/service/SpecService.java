package com.cyq.hgshop.service;

import com.cyq.hgshop.pojo.Spec;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: SpecService 
 * @Description: 规格接口
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:45:58
 */
public interface SpecService {
	
	PageInfo<Spec> list(String name,int page);
	
	int add(Spec spec);
	
	int update(Spec spec);
	
	int delete(int id);
	
	/**
	 * 查找一个规格 用于修改时候的回显
	 * @param id
	 * @return
	 */
	Spec findById(int id);
	
	
	/**
	 * 批量删除
	 * @param id
	 * @return
	 */
	int deleteBatch(int[] id);
	
	
}
