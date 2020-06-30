package com.bawei.spshop.dao;

import java.util.List;

import com.bawei.spshop.pojo.Spec;
import com.bawei.spshop.pojo.SpecOption;

public interface SpecDao {

	// 添加主表
	int addSpec(Spec spec);

	// 删除子表
	int delOptions(int... ids);

	// 删除主表
	int delSpec(int[] ids);

	// 修改
	int update(Spec spec);

	// 添加子表
	int addOption(SpecOption specOption);

	// 列表
	List<Spec> list(Spec spec);

	// 回显
	Spec findById(int id);

	List<Spec> listAll();
}
