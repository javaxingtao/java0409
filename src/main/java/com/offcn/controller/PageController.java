package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
	
	
	@RequestMapping("/select")
	public String select(){
		return "select";
	}

}
