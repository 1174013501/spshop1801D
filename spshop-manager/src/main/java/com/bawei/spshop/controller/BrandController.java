package com.bawei.spshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.spshop.pojo.Brand;
import com.bawei.spshop.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {
	
	@Reference
	BrandService brandService;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		List<Brand> list = brandService.list();
		model.addAttribute("list", list);
		
		return "list";
	}
}
