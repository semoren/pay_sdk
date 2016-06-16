package com.sermo.pay.sdk.mapper;

import com.sermo.pay.sdk.model.User;

public interface UserMapper {
	public User selectUserByUsername(String username); 
}
