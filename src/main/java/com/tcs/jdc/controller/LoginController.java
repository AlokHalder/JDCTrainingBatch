package com.tcs.jdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
   
	@RequestMapping("/")
	public String login() {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String home(@RequestParam String user, @RequestParam String password){		
		
		System.out.println( " User : "+ user + " Password :  "+ password);
		
	
		
		
		
		return "home";
	}
	
}
