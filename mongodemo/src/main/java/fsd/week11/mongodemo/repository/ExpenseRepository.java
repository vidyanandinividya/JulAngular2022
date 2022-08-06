package fsd.week11.mongodemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fsd.week11.mongodemo.model.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense,String> {

}
