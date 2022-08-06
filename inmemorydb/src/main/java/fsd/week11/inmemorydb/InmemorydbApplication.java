package fsd.week11.inmemorydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fsd.week11.inmemorydb.service.EmployeeReadService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class InmemorydbApplication implements CommandLineRunner {
	@Autowired
	private EmployeeReadService employeeReadService;
	public static void main(String[] args) {
		SpringApplication.run(InmemorydbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Fetch All Employees->{}",employeeReadService.getAllEmployees());
	}

}
