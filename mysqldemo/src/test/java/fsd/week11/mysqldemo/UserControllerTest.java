package fsd.week11.mysqldemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import fsd.week11.mysqldemo.controller.UserController;
import fsd.week11.mysqldemo.entity.User;
import fsd.week11.mysqldemo.service.UserService;

@SpringJUnitConfig
class UserControllerTest {
	@InjectMocks
	UserController userController;
	@Mock
	UserService userService;
	@Test
	public void addUser() {
		MockHttpServletRequest request=new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(userService.saveUser(any(User.class))).thenReturn(true);
		User user=new User(1,"hary","hary@gmail.com","hary@123");
		ResponseEntity<Boolean> responseEntity=userController.saveUsers(user);
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);		
	}

}
