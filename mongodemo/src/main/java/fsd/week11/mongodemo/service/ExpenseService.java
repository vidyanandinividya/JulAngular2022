package fsd.week11.mongodemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fsd.week11.mongodemo.model.Expense;
import fsd.week11.mongodemo.repository.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public void addExpenses(Expense expense)
	{
		expenseRepository.insert(expense);
	}
	public List<Expense> getAllExpense()
	{
		return expenseRepository.findAll();
	}

}
