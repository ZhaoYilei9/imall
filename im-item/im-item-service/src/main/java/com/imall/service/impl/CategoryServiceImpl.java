package com.imall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imall.mapper.TbCategoryMapper;
import com.imall.pojo.TbCategory;
import com.imall.service.CategoryService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private TbCategoryMapper tbCategoryMapper;
	@Override
	public List<TbCategory> list(Long pid) {
		Example example = new Example(TbCategory.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("parentId", pid);
		List<TbCategory> categories = tbCategoryMapper.selectByExample(example);
		return categories;
	}
	

}
