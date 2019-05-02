package com.imall.service;

import java.util.List;

import com.imall.pojo.TbCategory;

public interface CategoryService {
	List<TbCategory> list(Long pid);
}
