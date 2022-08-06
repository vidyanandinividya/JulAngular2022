package fsd.week11.SpringBootDemo.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
	private String firstName;
	private String lastName;
}
