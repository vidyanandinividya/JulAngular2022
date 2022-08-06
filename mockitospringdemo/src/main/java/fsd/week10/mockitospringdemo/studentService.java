package fsd.week10.mockitospringdemo;

public class studentService {
	StudentDAO studentDAO;

	public studentService(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}
	public int savestudent(Student student)
	{
		int count=studentDAO.save(student);
		return count;
	}

}
