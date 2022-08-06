package fsd.week10.di_ioc_demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Customer {
	private int id;
	private String name;
	private String email;
	public void display()
	{
		System.out.println("Object Returned Successfully");
	}

}
