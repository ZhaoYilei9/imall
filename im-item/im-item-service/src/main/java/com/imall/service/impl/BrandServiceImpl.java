package com.imall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imall.common.utils.ImallResult;
import com.imall.common.utils.PageResult;
import com.imall.mapper.TbBrandMapper;
import com.imall.pojo.TbBrand;
import com.imall.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;

	@Override
	public PageResult<TbBrand> brandList(Integer page, Integer rows, String key, String sortBy, Boolean desc) {
		PageHelper.startPage(page, rows);
		List<TbBrand> brands = brandMapper.selectAll();
		if (brands != null && brands.size() > 0) {
			PageInfo<TbBrand> pageInfo = new PageInfo<>(brands);
			PageResult<TbBrand> pageResult = new PageResult<>();
			pageResult.setList(pageInfo.getList());
			pageResult.setTotal(pageInfo.getPages());
			pageResult.setPage(pageInfo.getPageNum());
			pageResult.setRecords(pageInfo.getTotal());
			return pageResult;
		}
		return null;
	}

	
}
