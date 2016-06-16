package com.sermo.pay.sdk.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sermo.pay.sdk.dao.UserDao;
import com.sermo.pay.sdk.model.User;
import com.sermo.pay.sdk.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Resource
	private UserDao userDao;

	@Override
	public User selectUserByUsername(String username) {
		logger.info("username: " + username);
		return userDao.selectUserByUsername(username);
	}

}
