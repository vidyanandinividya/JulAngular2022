package fsd.week11.mysqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsd.week11.mysqldemo.entity.User;
import fsd.week11.mysqldemo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<Boolean> saveUsers(@RequestBody User user)
	{
		boolean isUserCreated=userService.saveUser(user);
		return ResponseEntity.status(isUserCreated?HttpStatus.CREATED:HttpStatus.NOT_ACCEPTABLE)
				.body(isUserCreated);
	}
	@GetMapping("/read")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	@GetMapping("/sorteduser")
	public List<User> getUserSorted()
	{
		return userService.getUserSorted();
	}
	@GetMapping("/countUsers")
	public long countUsers()
	{
		return userService.countUsers();
	}
	@DeleteMapping("/deleteUsers")
	public String deleteUsers()
	{
		userService.pruneTable();
		return "Data Deleted";
	}

}
