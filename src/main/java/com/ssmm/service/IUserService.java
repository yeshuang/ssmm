package com.ssmm.service;

import java.util.Map;

import com.ssmm.model.vo.QueryUserListJson;

public interface IUserService {

	QueryUserListJson queryUserList(Map<String, Object> parameter) throws Exception;

}
