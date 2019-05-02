package com.imall.common.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImallResult {
	private Integer status;
	private String msg;
	private Object data;
	
	public static ImallResult ok() {
		
		return new ImallResult(null);
	}
	
	public static ImallResult ok(Object data) {
		
		return new ImallResult(data);
	}
	public static ImallResult errorMsg(String msg) {
		
		return new ImallResult(500, msg);
	}
	public static ImallResult errorMap(Object data) {
		return new ImallResult(501, "error", data);
	}
	public static ImallResult errorokenMsg(String msg) {
		return new ImallResult(502, msg, null);
	}
	public static ImallResult errorException(String msg) {
		return new ImallResult(555, msg, null);
	}
	public ImallResult(Object data) {
		super();
		this.status = 200;
		this.data = data;
	}

	public ImallResult(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public ImallResult() {
		super();
	}

	public ImallResult(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	
	
}
