package capgem.demo.registrationserver.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import capgem.demo.registrationserver.entity.User;
import capgem.demo.registrationserver.service.UserService;

@ExtendWith(MockitoExtension.class)
@SpringJUnitConfig
class UserControllerTest {
	@InjectMocks
    UserController userController;
     
    @Mock
    UserService userService;
     
	@Test
	 public void testAddEmployee() 
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        when(userService.saveUsers(any(User.class))).thenReturn(true);
         
        //User user = new User(1, "Hary", "hary@gmail.com", "hary123","hary123");
        //ResponseEntity<Boolean> responseEntity = userController.saveUsers(user);
         
        //assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
        
    }

}
