package com.sermo.pay.sdk.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sermo.pay.sdk.model.User;
import com.sermo.pay.sdk.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="{username}", method=RequestMethod.GET)
	public User selectUser(@PathVariable String username){
		User user = userService.selectUserByUsername(username);
		logger.info("user: " + user.toString());
		return user;
	}
}
