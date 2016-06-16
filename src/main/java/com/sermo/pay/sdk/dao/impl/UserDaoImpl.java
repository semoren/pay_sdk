package com.sermo.pay.sdk.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.sermo.pay.sdk.dao.UserDao;
import com.sermo.pay.sdk.mapper.UserMapper;
import com.sermo.pay.sdk.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User selectUserByUsername(String username) {
		return userMapper.selectUserByUsername(username);
	}

}
