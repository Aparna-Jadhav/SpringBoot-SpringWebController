package com.bridgeLabz.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This class use Controller for handle web request
 */
@Controller
public class HelloWebController {
	
	/**
	 * RequestMapping handle request with mapping URL
	 * @return string name
	 */
		@GetMapping("/web")
		public String hello()
		{
			return "Hello";
		}
}
