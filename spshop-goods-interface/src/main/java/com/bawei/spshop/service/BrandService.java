package com.bawei.spshop.service;

import java.util.List;

import com.bawei.spshop.pojo.Brand;
import com.github.pagehelper.PageInfo;

/**
 * 品牌的管理
 * 
 * @author l1740
 *
 */
public interface BrandService {

	// 添加
	int add(Brand brand);

	// 修改
	int update(Brand brand);

	// 删除
	int delete(int[] ids);

	// 分页列表
	PageInfo<Brand> list(Brand brand);

	// 查询所有
	List<Brand> list();

	// 查看详情
	Brand getById(int id);

}
