package com.mani.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mani.expensetracker.model.Expense;
import com.mani.expensetracker.service.ExpenseService;

@Controller
public class MasterController {
	@Autowired
	private ExpenseService service;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		view.addObject("message", "List of Expenses");
		List<Expense> list = service.findall();
		view.addObject("expenses", list);
		return view;
	}

	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView view = new ModelAndView("expense");
		view.addObject("expense", new Expense());
		return view;
	}

	@PostMapping("/expense")
	public String save(@ModelAttribute("expense") Expense expense) {
		service.saveExpense(expense);
		return "redirect:/";
	}

	@GetMapping("/expense/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView view = new ModelAndView("expense");
		Expense expense = service.findById(id);
		view.addObject("expense", expense);
		return view;
	}
	@GetMapping("/expense/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		service.delete(id);
		return "redirect:/";
	}
}
