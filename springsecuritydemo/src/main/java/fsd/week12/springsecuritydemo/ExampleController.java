package fsd.week12.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/")
	public String hello()
	{
		return "Welcome to my Home page";
	}
	@GetMapping("/index")
	public String index()
	{
		return "Welcome to index page";
	}

}
