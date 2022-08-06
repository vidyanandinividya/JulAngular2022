package fsd.week10.dockercomposerspring.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fsd.week10.dockercomposerspring.model.Book;
@Repository
public interface BookRepository  extends MongoRepository<Book, Integer>{

}
