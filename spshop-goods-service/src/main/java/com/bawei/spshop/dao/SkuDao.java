package com.bawei.spshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.spshop.pojo.Sku;
import com.bawei.spshop.pojo.SkuVo;
import com.bawei.spshop.pojo.SpecOption;

/**
 * sku 的curd
 * @author 45466
 *
 */
public interface SkuDao {

	int insert(Sku sku);
	int insertSpecOption(@Param("skuId")  int id, @Param("opt") SpecOption specOption);
	

	int delete(int[] ids);
	int deleteSpecOption(int ...id);

	int update(Sku sku);	

	Sku findById(int id);
	List<Sku> list(SkuVo skuvo);



	

}
