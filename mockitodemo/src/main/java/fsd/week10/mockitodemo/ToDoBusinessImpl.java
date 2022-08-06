package fsd.week10.mockitodemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ToDoBusinessImpl {
	@Autowired
	private ToDoService toDoService;
	
	public List<String> retrieve(String user)
	{
		List<String> filteredTodos=new ArrayList<>();
		List<String> allTodos=toDoService.retrieveTodos(user);
		for(String todo:allTodos )
		{
			if(todo.contains("Spring"))
			{
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
