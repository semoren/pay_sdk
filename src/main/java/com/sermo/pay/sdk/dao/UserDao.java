package com.sermo.pay.sdk.dao;

import com.sermo.pay.sdk.model.User;

public interface UserDao {
	public User selectUserByUsername(String username); 
}
