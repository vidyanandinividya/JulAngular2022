package fsd.week11.inmemorydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fsd.week11.inmemorydb.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
