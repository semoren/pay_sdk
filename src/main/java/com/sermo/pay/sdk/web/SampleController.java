package com.sermo.pay.sdk.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	String home(){
		return "ok";
	}
	
}
