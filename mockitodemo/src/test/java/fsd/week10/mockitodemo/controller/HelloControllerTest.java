package fsd.week10.mockitodemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
public class HelloControllerTest {
	@Test
	void hello()
	{
		HelloController controller=new HelloController();//instance of the controller
		String response=controller.hello("Hello World");; //act
		assertEquals("Hello World", response);//assert
		
	}

}
