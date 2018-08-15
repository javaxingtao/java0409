package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offcn.pojo.Mobile;
import com.offcn.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileContrller {
	
	@Autowired
	private MobileService mobileService;
	
	@RequestMapping("/query")
	public Mobile query(Integer number){
		
		return this.mobileService.query(number);
		
	}

}
