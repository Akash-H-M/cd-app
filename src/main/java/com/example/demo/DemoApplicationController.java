package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
  
	
	@GetMapping("/home")  
	public String hello()   
	{  
	return "My first java application";  
	}  
	}  

