package com.bawei.spshop.dao;

import java.util.List;

import com.bawei.spshop.pojo.Category;

public interface CategoryDao {
	int add(Category category);

	int update(Category category);

	int delete(int id);

	List<Category> list(int parentId);

	Category findById(int id);
}
