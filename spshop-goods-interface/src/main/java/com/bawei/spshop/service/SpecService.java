package com.bawei.spshop.service;

import java.util.List;

import com.bawei.spshop.pojo.Spec;
import com.github.pagehelper.PageInfo;

public interface SpecService {

	// 添加
	int add(Spec spec);

	// 删除
	int delete(int[] ids);

	// 修改
	int update(Spec spec);

	// 列表
	PageInfo<Spec> list(int pageNum, int pageSize, Spec spec);

	// 获取全部的规格
	List<Spec> listAll();

	// 回显
	Spec getById(int id);

}
