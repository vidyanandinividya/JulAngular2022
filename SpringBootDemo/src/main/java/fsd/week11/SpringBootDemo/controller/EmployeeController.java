package fsd.week11.SpringBootDemo.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fsd.week11.SpringBootDemo.model.Employee;

@RestController
@RequestMapping("employee-info")
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployee()
	{
		Employee e1=new Employee("John","Smith");
		Employee e2=new Employee("John1","Smith1");
		Employee e3=new Employee("John2","Smith2");
		Employee e4=new Employee("John3","Smith3");
		List<Employee> empList=Arrays.asList(e1,e2,e3,e4);
		return empList;
	}
	@GetMapping("/default")
	public Employee getDeafultEmployee()
	{
		//Employee e1=Employee.builder().firstName("Hary").build();
		//return e1;
		return new Employee().builder().firstName("Henry").build();
		
	}
	@PostMapping("employeeinfo")
	public Employee employeeInfo(String firstname,String lastname)
	{
		Employee emp=new Employee();
		emp.setFirstName(firstname);
		emp.setLastName(lastname);
		return emp;
	}

}
