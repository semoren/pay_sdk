package com.sermo.pay.sdk.model;

import org.springframework.data.annotation.Id;

import com.alibaba.druid.support.monitor.annotation.MTable;

@MTable(name = "users")
public class User {
	@Id
	private String username;
	private String password;
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
}
