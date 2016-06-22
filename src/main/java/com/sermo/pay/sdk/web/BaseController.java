package com.sermo.pay.sdk.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sermo.pay.sdk.exception.BizException;
import com.sermo.pay.sdk.model.BizPacket;

public abstract class BaseController {
	
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected BizPacket getSuccessPacket(Object data) {
		BizPacket packet = new BizPacket();
		packet.setCode(200);
		packet.setMsg("");
		packet.setData(data);
		return packet;
	}
	
	protected BizPacket getErrorPacker(BizException e) {
		BizPacket packet = new BizPacket();
		if (packet.getCode() == 503) {
			logger.error("System error!", e);
		}
		packet.setData("");
		return packet;
	}
}
