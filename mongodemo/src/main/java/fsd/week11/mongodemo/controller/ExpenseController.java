package fsd.week11.mongodemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsd.week11.mongodemo.model.Expense;
import fsd.week11.mongodemo.service.ExpenseService;

@RestController
@RequestMapping("expense")
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
	@PostMapping
	public ResponseEntity addExpense(@RequestBody Expense expense)
	{
		expenseService.addExpenses(expense);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@GetMapping
	public ResponseEntity<List<Expense>> getAllExpense()
	{
		return ResponseEntity.ok(expenseService.getAllExpense());
	}
	

}
