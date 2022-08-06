package fsd.week12.springsecurityjdbc.model;

import lombok.Data;

@Data
public class MyUser {
private String userName;
private String password;
private String roles;
}
