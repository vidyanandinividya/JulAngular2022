package fsd.week10.mockitospringdemo;


import org.mockito.Mockito;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MockitospringdemoApplicationTests {
	StudentResource studentResource;
	studentService stService;

	public static void main(String[] args) {
		MockitospringdemoApplicationTests resourceTest=
				new MockitospringdemoApplicationTests();
		resourceTest.setup();
		resourceTest.shouldSaveStudent();
	}
	public void setup()
	{
		stService=Mockito.mock(studentService.class);
		studentResource=new StudentResource(stService);
	}
	public void shouldSaveStudent()
	{
		Student student=new Student("John",23,"Bengaluru");
		Mockito.when(stService.savestudent(student)).thenReturn(1);
	
		int result=studentResource.saveStudent("Jack",23,"Bengaluru");
		if(result==1)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
