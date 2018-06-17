package com.pluralsight.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class HelloController {

	@RequestMapping(value ="greeting")
	public String sayHello (Model model) {
		
		model.addAttribute("greeting", "Hello World");
		
		return "hello";
	}
	
}
