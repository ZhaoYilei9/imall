package com.imall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imall.common.utils.ImallResult;
import com.imall.common.utils.PageResult;
import com.imall.pojo.TbBrand;
import com.imall.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Autowired
	private BrandService brandService;

	/**
	 * 	key: 
		page: 1
		rows: 5
		sortBy: id
		desc: 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("page")
	@ResponseBody
	public PageResult<TbBrand> brandList  (@RequestParam("page") Integer page, 
									@RequestParam("rows") Integer rows,
									@RequestParam("sortBy") String sortBy,
									@RequestParam("desc") Boolean desc,
									@RequestParam("key") String key) {
		PageResult<TbBrand> brandList = brandService.brandList(page,rows,key,sortBy,desc);
		return brandList;
	}
}
