package com.mani.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mani.expensetracker.model.Expense;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
