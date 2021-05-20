package com.bronson.routing.codingcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class Coding {
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String greeting() {
		return "Hello Coding Dojo";
	}
	
	@RequestMapping(value="/coding/python", method=RequestMethod.GET)
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value="/coding/java", method=RequestMethod.GET)
	public String java() {
		return "Java/Spring is better!";
	}
}
