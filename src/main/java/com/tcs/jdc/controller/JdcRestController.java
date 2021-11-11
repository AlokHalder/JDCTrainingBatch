package com.tcs.jdc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class JdcRestController {
	
	@GetMapping("/emp")
	public List<String> home() {
		
		List<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Neha");
		list.add("Kuntal");
		
		return list;
		
	}

}
