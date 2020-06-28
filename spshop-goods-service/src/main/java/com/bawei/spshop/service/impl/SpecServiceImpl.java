package com.bawei.spshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.spshop.dao.SpecDao;
import com.bawei.spshop.pojo.Spec;
import com.bawei.spshop.pojo.SpecOption;
import com.bawei.spshop.service.SpecService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//规格管理的实现类
@Service(interfaceClass = SpecService.class)
public class SpecServiceImpl implements SpecService {

	@Autowired
	SpecDao specDao;

	@Override
	public int add(Spec spec) {
		// 添加主表
		int result = specDao.addSpec(spec);// 主键自动生成

		// 插入子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			// 设置主键
			specOption.setSpecId(spec.getId());
			result += specDao.addOption(specOption);
		}

		return result;

	}

	@Override
	public int delete(int[] ids) {
		// 先删除子表
		int result = specDao.delOptions(ids);
		// 删除主表
		result += specDao.delSpec(ids);

		return result;
	}

	@Override
	public int update(Spec spec) {
		// 修改主表
		int result = specDao.update(spec);
		// 删除子表
		specDao.delOptions(spec.getId());

		// 重新插入子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			// 设置主键
			specOption.setSpecId(spec.getId());
			result += specDao.addOption(specOption);
		}

		return result;
	}

	@Override
	public PageInfo<Spec> list(int pageNum, int pageSize, Spec spec) {
		// 列表
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Spec>(specDao.list(spec));
	}

	@Override
	public Spec getById(int id) {
		// 回显
		return specDao.findById(id);
	}

}
