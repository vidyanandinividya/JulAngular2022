package fsd.week10.mockitodemo;

import java.util.List;

public class Portfolio {
	private EmployeeService empService;
	private List<Employee> emps;
	public EmployeeService getEmpService() {
		return empService;
	}
	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	

}
