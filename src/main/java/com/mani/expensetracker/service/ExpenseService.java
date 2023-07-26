package com.mani.expensetracker.service;

import java.util.List;

import com.mani.expensetracker.model.Expense;

public interface ExpenseService {
	public List<Expense> findall();
	public void saveExpense(Expense expense);
	public Expense findById(Long id);
	public void delete(Long id);
}
