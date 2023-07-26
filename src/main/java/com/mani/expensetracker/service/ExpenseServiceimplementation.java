package com.mani.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.expensetracker.model.Expense;
import com.mani.expensetracker.repository.ExpenseRepository;
@Service
public class ExpenseServiceimplementation implements ExpenseService{
	@Autowired
	private ExpenseRepository repository;
	@Override
	public List<Expense> findall() {
		return repository.findAll();
	}
	@Override
	public void saveExpense(Expense expense) {
		expense.setCreated_at(System.currentTimeMillis());
		repository.save(expense);
	}
	@Override
	public Expense findById(Long id) {
		if(repository.findById(id).isPresent())
		return repository.findById(id).get();
		return null;
	}
	@Override
	public void delete(Long id) {
		Expense expense = findById(id);
		repository.delete(expense);
	}

}
