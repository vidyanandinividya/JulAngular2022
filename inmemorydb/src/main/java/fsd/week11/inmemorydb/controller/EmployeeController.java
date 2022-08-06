package fsd.week11.inmemorydb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsd.week11.inmemorydb.entity.Employee;
import fsd.week11.inmemorydb.service.EmployeeReadService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeReadService employeeReadService;
	@GetMapping("/getemp")
	public List<Employee> getEmployees()
	{
		return employeeReadService.getAllEmployees();
	}
	@PostMapping("/saveemp")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return employeeReadService.saveEmployee(emp);
	}

}
