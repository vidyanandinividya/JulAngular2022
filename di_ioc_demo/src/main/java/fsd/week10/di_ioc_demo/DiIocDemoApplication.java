package fsd.week10.di_ioc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiIocDemoApplication {
	@Autowired
	private Customer c;
	public static void main(String[] args) {
		
		//SpringApplication.run(DiIocDemoApplication.class, args);
		/*ConfigurableApplicationContext context=
				SpringApplication.run(DiIocDemoApplication.class, args);
		Customer c=context.getBean(Customer.class);*/
		
		
	}

}
