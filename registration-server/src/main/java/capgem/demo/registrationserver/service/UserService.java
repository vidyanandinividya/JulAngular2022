package capgem.demo.registrationserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import capgem.demo.registrationserver.entity.User;
import capgem.demo.registrationserver.exception.DuplicateEmailException;
import capgem.demo.registrationserver.exception.EmptyInputException;
import capgem.demo.registrationserver.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Boolean saveUsers(User user)
	{
		Boolean isUserCreated = false;
		/*if(user.getFirstname().isEmpty()||user.getFirstname().length()==0)
		{
			throw new EmptyInputException("601","Input Fields are Empty");
		}*/
		findExistingUser(user.getEmail());

		User savedUser = userRepository.save(user);
		if(savedUser != null) {
			isUserCreated = true;
		}
		return isUserCreated;
	}
	
	private void findExistingUser(String email)  {
		User u=new User();
		u.setEmail(email);
		ExampleMatcher matcher=ExampleMatcher.matching()
				.withMatcher("email", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id","name","password","cpassword");
		Example<User> example=Example.of(u,matcher);
		List<User> existingList = userRepository.findAll(example);
		if(existingList != null && existingList.size()>0) {
			throw new DuplicateEmailException("602","Duplicate Email");
		}
	}
	
	public boolean findUser(String email,String password)  {
		boolean isExist=false;
		User u=new User();
		u.setEmail(email);
		ExampleMatcher matcher=ExampleMatcher.matching()
				.withMatcher("email", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id","firstname","lastname","dob","gender","qualification","company","salary","phone","jobexp","password","cpassword");
		Example<User> example=Example.of(u,matcher);
		List<User> existingList = userRepository.findAll(example);
		System.out.println(existingList);
		System.out.println(email);
		System.out.println(password);
		if(existingList != null && existingList.size()>0) {
			isExist=existingList.get(0).getPassword().equals(password);
		}
		return isExist;
	}
	/*public void saveUsers(User user)
	{
		userRepository.save(user);
	}*/
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}

}
