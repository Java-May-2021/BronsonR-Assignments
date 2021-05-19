package com.bronson.strings.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Strings {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String greeting() {
		return "I hope you are having a great day!";
	}
	
	@RequestMapping(value="/random", method=RequestMethod.GET)
	public String randomMessage() {
		return "Thanks for checking out the page";
	}
	
	
}
