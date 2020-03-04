package com.cyq.hgshop.dao;

import java.util.List;

import com.cyq.hgshop.pojo.Spec;
import com.cyq.hgshop.pojo.SpecOption;

public interface SpecDao {

	List<Spec> list(String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteOptions(int id);

	int deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOtionsBatch(int[] id);

	int deleteSpecBatch(int[] id);

}
