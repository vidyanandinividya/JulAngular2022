package fsd.week11.inmemorydb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsd.week11.inmemorydb.entity.Employee;
import fsd.week11.inmemorydb.repository.EmployeeRepository;

@Service
public class EmployeeReadService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}

}
