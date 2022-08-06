package fsd.week10.springmongodocker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fsd.week10.springmongodocker.model.Book;


@Component
public interface BookRepository  extends MongoRepository<Book, Integer>{

}
