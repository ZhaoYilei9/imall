package com.imall.common.utils;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageResult<T> {
	//当前页
	private int page;
	//记录
	private List<T> list;
	//总页数
	private long total;
	//总记录数
	private long records;
	

}
