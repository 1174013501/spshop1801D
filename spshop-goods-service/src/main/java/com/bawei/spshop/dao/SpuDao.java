package com.bawei.spshop.dao;

import java.util.List;

import com.bawei.spshop.pojo.Spu;
import com.bawei.spshop.pojo.SpuVo;

/**
 * 
 * @author 45466
 *
 */
public interface SpuDao {

	int add(Spu spu);

	int update(Spu spu);

	int delete(int[] ids);

	List<Spu> list(SpuVo spuvo);

	Spu findById(int id);

}
