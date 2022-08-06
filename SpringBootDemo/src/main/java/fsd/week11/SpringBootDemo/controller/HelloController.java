package fsd.week11.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Welocme to Spring Boot Rest API";
	}
	@GetMapping("/")
	public String home()
	{
		return "Welocme to Home page";
	}

}
