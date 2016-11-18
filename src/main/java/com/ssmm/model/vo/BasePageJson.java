package com.ssmm.model.vo;

public class BasePageJson extends BaseJson {
	private int pageNum;

	private int pageSize;

	private long total;

	public BasePageJson(String code, String msg, int pageNum, int pageSize, long total) {
		super(code, msg);
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.total = total;
	}

	public BasePageJson() {
		super();
	}

	public BasePageJson(String code, String msg) {
		super(code, msg);
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

}
