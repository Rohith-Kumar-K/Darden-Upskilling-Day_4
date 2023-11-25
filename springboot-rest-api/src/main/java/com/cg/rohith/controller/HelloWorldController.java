/**
 * 
 */
package com.cg.rohith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rohikn
 *
 */
@RestController
public class HelloWorldController {

	/**
	 * 
	 */
	//HTTT Get Request
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

}
