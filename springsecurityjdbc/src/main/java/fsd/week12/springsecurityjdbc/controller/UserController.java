package fsd.week12.springsecurityjdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fsd.week12.springsecurityjdbc.model.MyUser;
import lombok.Data;

@RestController
@Data
public class UserController {
	
	/**
	 * 1. /register-user - it is used to create a new user and it is accessed by everyone
	 * 2. /admin - can be accessed by an user has role 'ADMIN' only
	 * 3. /user -is allowed for a user has a role 'ADMIN' or 'USER'
	 * 4. /(root) -is allowed for everyone
	 */
	
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@PostMapping("/register-user")
	public String register(@RequestBody MyUser myUser)
	{
		List<GrantedAuthority> authorities=new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myUser.getRoles()));
		String encoddedPassword=passwordEncoder.encode(myUser.getPassword());
		User user=new User(myUser.getUserName(),encoddedPassword,authorities);
		jdbcUserDetailsManager.createUser(user);
		return "user created";
	}
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome Admin";
	}
	@GetMapping("/user")
	public String user()
	{
		return "Hello User";
	}
	@GetMapping("/")
	public String index()
	{
		return "Welcome All";
	}

}
