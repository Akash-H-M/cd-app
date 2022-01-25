package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
  
	
	@RequestMapping("/home")  
	public String hello()   
	{  
	return "My first java application";  
	}  
	}  

