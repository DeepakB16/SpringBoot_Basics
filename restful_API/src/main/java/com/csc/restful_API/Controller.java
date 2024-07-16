package com.csc.restful_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//Handling Request Parameter
	@RequestMapping("/hello")
	public String welcome()                   //default search request
	{
		return "Hello";
	}
	
	@GetMapping("/hello1")
	public String welcome1(@RequestParam String name)      //mapping search with parameters
	{
		return "Hello "+name;
	}
	
	@GetMapping("/hello2")
	public String welcome2(@RequestParam(value="name",defaultValue="Soldiers") String name)     //mapping with default value for parameter
	{
		return "Hello "+name;
	}
	
	//Handling path variable
	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable String name)      //mapping search with parameters
	{
		return "Hello "+name;
	}

}
