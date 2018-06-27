package com.wangfeng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangfeng.bean.User;
import com.wangfeng.bean.UserExample;
import com.wangfeng.bean.UserExample.Criteria;
import com.wangfeng.dao.UserMapper;
@Service
public class UserService {
	
//用于登录
	@Autowired
	private UserMapper userMapper;
	
	/*public User login(User user) {
		return userMapper.login(user);
	}*/
	
	public boolean checkLogin(String username,String password) {
		UserExample userExample = new UserExample();
		
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> userlist = userMapper.selectByExample(userExample);
		if(userlist.isEmpty()) {
			return false;
		}
		criteria.andPasswordEqualTo(password);
		List<User> result = userMapper.selectByExample(userExample);
		//System.out.println("result: "+result);
		//System.err.println("userExample: "+userExample);
		if(result.isEmpty()) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * 检验用户名是否可用
	 * true 
	 * @param username
	 * @return true ; 代表当前姓名可用   false:不可用
	 */
	public boolean checkUser(String username) {
		UserExample example = new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(username);
		long count = userMapper.countByExample(example); //通过名字看是否有这个记录数
		return count == 0;
	}

	//	用于注册,insertSelective可以不插入id，但select必须要插入id
		public void registerUser(User user) {
			// TODO Auto-generated method stub
			userMapper.insertSelective(user); //不需要id
		}
	
}

	
