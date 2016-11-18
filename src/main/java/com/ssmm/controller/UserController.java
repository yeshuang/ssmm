package com.ssmm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssmm.model.User;
import com.ssmm.model.vo.QueryUserListJson;
import com.ssmm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		try {
			Map<String, Object> parameter = new HashMap<>();
			parameter.put("pageNum", "1");
			parameter.put("pageSize", 20);
			QueryUserListJson quj = userService.queryUserList(parameter);
			System.out.println("用户名:");
			for (User user : quj.getList()) {
				System.out.println(user.getUserName());
			}
			System.out.println("pageNum: " + quj.getPageNum() + ",pageSize: " + quj.getPageSize() + ",total: " + quj.getTotal());
			model.addAttribute("user", quj.getList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showUser";
	}
}