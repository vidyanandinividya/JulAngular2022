package fsd.week10.mockitospringdemo;

public class StudentResource {
	studentService stService;

	public StudentResource(studentService stService) {
		super();
		this.stService = stService;
	}
	public int saveStudent(String name,int age,String address)
	{
		Student student=new Student(name,age,address);
		int studentId=stService.savestudent(student);
		return studentId;
	}

}
