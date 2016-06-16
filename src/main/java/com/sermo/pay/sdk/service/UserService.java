package com.sermo.pay.sdk.service;

import com.sermo.pay.sdk.model.User;

public interface UserService {
	
	public User selectUserByUsername(String username); 
	
}
