package com.ssmm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssmm.dao.UserDao;
import com.ssmm.model.User;
import com.ssmm.model.vo.QueryUserListJson;
import com.ssmm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserDao userDao;

	@Override
	public QueryUserListJson queryUserList(Map<String, Object> parameter) throws Exception {
		int pageNum = (null != parameter.get("page")) ? Integer.parseInt(parameter.get("page").toString().trim()) : 1;
		int pageSize = (null != parameter.get("pageSize")) ? Integer.parseInt(parameter.get("pageSize").toString().trim()) : 20;
		Page<?> page = PageHelper.startPage(pageNum, pageSize);
		List<User> list = userDao.queryUserList(new User());
		return new QueryUserListJson("0000", "查询成功", pageNum, pageSize, page.getTotal(), list);
	}

}
