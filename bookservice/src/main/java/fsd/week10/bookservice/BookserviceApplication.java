package fsd.week10.bookservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookserviceApplication {
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return Stream.of(new Book(1,"Java",999),
				new Book(2,"Spring",1999),new Book(3,"Hibernate",499),
				new Book(4,"Angular",899)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

}
