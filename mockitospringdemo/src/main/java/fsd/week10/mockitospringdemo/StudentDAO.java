package fsd.week10.mockitospringdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentDAO {
	static int i=1;
	Map<Integer, Student> studentStore=new HashMap<>();
	public int save(Student student)
	{
		studentStore.put(i,student);
		return i++;
	}

}
