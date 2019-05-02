package com.imall.service;

import java.util.List;

import com.imall.common.utils.ImallResult;
import com.imall.common.utils.PageResult;
import com.imall.pojo.TbBrand;

public interface BrandService {
	
	PageResult<TbBrand> brandList(Integer page, Integer rows, String key, String sortBy, Boolean desc);
}
