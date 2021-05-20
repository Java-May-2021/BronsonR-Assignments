package com.bronson.routing.dojocontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class Dojo {
	 @RequestMapping(value="/dojo", method=RequestMethod.GET)
	public String dojo() {
		return "The Dojo is awesome!";
	}
	 
	@RequestMapping(value="/dojo/{part2}", method=RequestMethod.GET)
	public String burbank(@PathVariable("part2") String part2 ) {
		if (part2 == "burbank") {
			return "Burbank Dojo is located in Southern California";
		} else if (part2 == "san-jose") {
			return "SJ Dojo is headquarters";
		} else {
			return null;
		}
	}
}
