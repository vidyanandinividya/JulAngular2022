package fsd.week11.mysqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import fsd.week11.mysqldemo.entity.User;
import fsd.week11.mysqldemo.exception.DuplicateEmailException;
import fsd.week11.mysqldemo.exception.EmptyInputException;
import fsd.week11.mysqldemo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public Boolean saveUser(User user)
	{
		Boolean isUserCreated=false;
		if(user.getName().isEmpty() || user.getName().length()==0)
		{
			throw new EmptyInputException("601","Input Fields are empty");
		}
		findExistingUser(user.getEmail());
		User savedUser=userRepository.save(user);
		if(savedUser!=null)
		{
			isUserCreated=true;
		}
		return isUserCreated;
	}
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	public List<User> getUserSorted()
	{
		return userRepository.findAll(Sort.by(Direction.DESC));
	}
	public long countUsers()
	{
		return userRepository.count();
	}
	public String pruneTable()
	{
		userRepository.deleteAll();
		return "Users Deleted";
		
	}
	private void findExistingUser(String email)
	{
		User user=new User();
		user.setEmail(email);
		ExampleMatcher matcher=ExampleMatcher.matching()
				.withMatcher("email", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id","name","password");
		Example<User> example=Example.of(user,matcher);
		List<User> existingUser=userRepository.findAll(example);
		if(existingUser!=null && existingUser.size()>0)
		{
			throw new DuplicateEmailException("602","Duplicate Email");
		}
	}
}
