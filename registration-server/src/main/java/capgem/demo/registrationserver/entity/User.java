package capgem.demo.registrationserver.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String qualification;
	private String email;
	private String password;
	private int phone;
	private String company;
	private String jobexp;
	private int salary;
	private String dob;

}
