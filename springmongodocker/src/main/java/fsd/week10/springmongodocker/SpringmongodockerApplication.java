package fsd.week10.springmongodocker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsd.week10.springmongodocker.model.Book;
import fsd.week10.springmongodocker.repository.BookRepository;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringmongodockerApplication {

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book)
	{
		return bookRepository.save(book);
	}
	@GetMapping
	public List<Book> getBookes()
	{
		return bookRepository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringmongodockerApplication.class, args);
	}

}
