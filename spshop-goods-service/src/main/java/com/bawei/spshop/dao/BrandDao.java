package com.bawei.spshop.dao;

import java.util.List;

import com.bawei.spshop.pojo.Brand;

public interface BrandDao {

	// 查看详情
	Brand findById(int id);

	// 查看所有
	List<Brand> queryAll();

}
