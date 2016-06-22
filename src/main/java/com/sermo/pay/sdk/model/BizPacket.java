package com.sermo.pay.sdk.model;

import com.sermo.pay.sdk.util.StringUtil;

public class BizPacket {
	
	private int code;
	
	private String msg;
	
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return StringUtil.format("code{#0}, msg{#1}, data{#2}", new Object[] { Integer.valueOf(this.code), this.msg, this.data });
	}
}
