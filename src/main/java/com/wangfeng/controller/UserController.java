package com.wangfeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.catalina.deploy.LoginConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangfeng.bean.Msg;
import com.wangfeng.bean.User;
import com.wangfeng.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// @RequestMapping("/login")
	// public String login(User user,HttpServletRequest request){
	// User resultUser=userService.login(user);
	// if(resultUser==null){
	// request.setAttribute("user", user);
	// request.setAttribute("errorMsg", "用户名或密码错误！");
	// return "redirect:/login.jsp";
	// }else{
	// return "redirect:/Uav.jsp";
	// }
	// }
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Msg login(@RequestParam("username") String username, @RequestParam("password") String password) {
	   
		boolean result = userService.checkLogin(username, password);
		if(result) {
			System.out.println(username+"登录成功！");
			return Msg.success();
		}else{
			
			System.out.println("用户名或者密码错误！");
			return Msg.fail().add("errorMsg", "用户名或者密码错误！");	
		}
	}

	@RequestMapping("/checkuser")
	@ResponseBody
	public Msg checkuse(@RequestParam(value = "username") String username) {
		// 先判断用户名是否是合法的表达式
		String regx = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";

		if (!(username.matches(regx))) {
			System.out.println("不可用");
			return Msg.fail().add("va_msg", "用户名必须是6-16位数字和字母的组合或者2-5位中文");
		}
		// 数据库用户名重复校验
		boolean b = userService.checkUser(username);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}

	}

	/**
	 * 用户注册
	 * 
	 * @param employee
	 * @return 1.支持JSR303校验 2.导入Hibernate-Validator
	 */

	@RequestMapping(value = "/register", method = RequestMethod.POST) // 定义为POST请求
	@ResponseBody
	public Msg registerUser(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			Map<String, Object> map = new HashMap<String, Object>();
			// 校验失败，应该返回失败，在模态框中显示校验失败的信息
			List<FieldError> errors = result.getFieldErrors(); // 提取出错误信息
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名:" + fieldError.getField());
				System.out.println("错误信息:" + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			userService.registerUser(user);
			return Msg.success();
		}

	}

}
