package com.cyq.hgshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cyq.hgshop.dao.SpecDao;
import com.cyq.hgshop.pojo.Spec;
import com.cyq.hgshop.pojo.SpecOption;
import com.cyq.hgshop.service.SpecService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass=SpecService.class)
public class SpecServiceImpl implements SpecService {

	
	@Autowired
	SpecDao specDao;
	
	@Override
	public PageInfo<Spec> list(String name, int page) {
		
		PageHelper.startPage(page, 3);
		
		return new PageInfo<Spec>(specDao.list(name));
	}

	@Override
	public int add(Spec spec) {
		
		//添加主表数据
		specDao.addSpec(spec);
		//添加子表
		
		
		List<SpecOption> options =spec.getOptions();
		
		int n=1;
		
		for (SpecOption specOption : options) {
			specOption.setId(spec.getId());
			specDao.addOption(specOption);
			n++;
		}
		//返回的是影响数据的条数
		return n;
	}

	
	
	@Override
	public int update(Spec spec) {
		return specDao.updateSpec(spec);
	}

	@Override
	public int delete(int id) {

		//删除子表
		specDao.deleteOptions(id);
		
		//删除主表
		specDao.deleteSpec(id);
		return 1;
	}

	@Override
	public Spec findById(int id) {
		return specDao.get(id);
	}

	@Override
	public int deleteBatch(int[] id) {
		
		//删除子表
		specDao.deleteSpecOtionsBatch(id);
		
		//删除主表
		specDao.deleteSpecBatch(id);
		return 1;
	}

}
