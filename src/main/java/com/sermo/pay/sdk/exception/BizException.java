package com.sermo.pay.sdk.exception;

import com.sermo.pay.sdk.model.BizPacket;

public class BizException extends Exception{

	private static final long serialVersionUID = -1140915452252939794L;
	
    private final BizPacket packet;

    public BizException(BizPacket packet){
    	super(packet.toString());
    	this.packet = packet;
    }
    
    public BizException(BizPacket packet, Throwable cause) {
    	super(packet.toString(), cause);
    	this.packet = packet;
    }
    
	public BizPacket getPacket() {
		return this.packet;
	}

}
