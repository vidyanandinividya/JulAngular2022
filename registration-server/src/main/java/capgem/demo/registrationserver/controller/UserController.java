package capgem.demo.registrationserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import capgem.demo.registrationserver.entity.User;
import capgem.demo.registrationserver.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*@PostMapping("/create")
	public Boolean saveUsers(@RequestBody @Valid User user)
	{
		return userService.saveUsers(user);
	}*/
	
	@PostMapping("/create")
	public ResponseEntity<Boolean> saveUsers(@RequestBody User user)
	{
		boolean isUserCreated=userService.saveUsers(user);
	
		
		return 
				ResponseEntity.status(isUserCreated ? HttpStatus.CREATED : HttpStatus.NOT_ACCEPTABLE).body(isUserCreated);
	}
	@GetMapping("/read")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/login")
	public boolean loginUser(@RequestParam String email, @RequestParam String password)
	{
		return userService.findUser(email, password);
	}
}
