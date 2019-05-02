package com.imall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imall.common.utils.ImallResult;
import com.imall.pojo.TbCategory;
import com.imall.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
//	item/category/list?pid=0
	@RequestMapping("list")
	@ResponseBody
	public ResponseEntity categoryList(@RequestParam("pid") Long pid) {
		List<TbCategory> categories = categoryService.list(pid);
		return ResponseEntity.ok(categories);
	}
}
