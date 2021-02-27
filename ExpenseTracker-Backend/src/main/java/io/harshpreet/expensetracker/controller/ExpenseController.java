package io.harshpreet.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.harshpreet.expensetracker.model.Expense;
import io.harshpreet.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api/v1")
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get() {
		List<Expense> expenses = expenseService.findAll();
		return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);
	}
}
