package com.ssmm.model.vo;

import java.util.List;

import com.ssmm.model.User;

public class QueryUserListJson extends BasePageJson {

	private List<User> list;

	public QueryUserListJson(String code, String msg, int pageNum, int pageSize, long total, List<User> list) {
		super(code, msg, pageNum, pageSize, total);
		this.list = list;
	}

	public QueryUserListJson() {
		super();
	}

	public QueryUserListJson(String code, String msg, int pageNum, int pageSize, long total) {
		super(code, msg, pageNum, pageSize, total);
	}

	public QueryUserListJson(String code, String msg) {
		super(code, msg);
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
}
