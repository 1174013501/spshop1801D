package com.bawei.spshop.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bawei.spshop.pojo.Brand;
import com.bawei.spshop.service.BrandService;

@ContextConfiguration({ "classpath:applicationContext-dubbo-provider.xml", "classpath:applicationContext-dao.xml" })
@RunWith(SpringRunner.class)
public class TestBrand {

	@Autowired
	BrandService bs;

	@Test
	public void testGet() {
		Brand brand = bs.getById(2);
		System.out.println("brand is  " + brand);
	}

}
