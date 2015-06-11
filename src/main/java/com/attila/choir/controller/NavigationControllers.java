package com.attila.choir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationControllers {

	@RequestMapping(value="/index")
	public String getIndex(){
		return "static/index.html";
	}
	
}
