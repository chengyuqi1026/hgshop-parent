package com.cyq.hgshop.service;

import java.util.List;

import com.cyq.hgshop.pojo.Brand;
import com.cyq.hgshop.pojo.Category;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: GoodsService 
 * @Description: 商品接口
 * @author: ChengYQ
 * @date: 2020年3月4日 下午4:35:24
 */
public interface GoodsService {
	
	/**
	 * 
	* @Title: addBrand updateBrand deleteBrand listBrand
	* @Description:  品牌的增删改查
	* @param brand
	* @return int
	 */
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	PageInfo<Brand> listBrand( String firstChar,int page); 
	
	
	/**
	 * 
	* @Title: addCategory updateCategory deleteCategory listCategory
	* @Description:  分类的增删改查方法 
	* @param category
	* @return int
	 */
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	PageInfo<Category> listCategory( String firstChar,int page); 
	
	
	/**
	 * 
	* @Title: treeCategory 
	* @Description: 以树的形式显示分类
	* @return List<Category>
	 */
	List<Category> treeCategory(); 
	
}
