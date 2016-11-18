package com.ssmm.model.vo;

public class BaseJson {

	private String code;

	private String msg;

	public BaseJson(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public BaseJson() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
