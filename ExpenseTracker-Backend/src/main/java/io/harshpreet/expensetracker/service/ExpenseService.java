package io.harshpreet.expensetracker.service;

import java.util.List;

import io.harshpreet.expensetracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
