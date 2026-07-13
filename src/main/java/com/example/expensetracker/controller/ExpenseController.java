package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Get all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    // Get expense by ID
    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {

        return expenseService.getExpenseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {

        return expenseService.saveExpense(expense);
    }

    // Update expense
    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable Long id,
            @RequestBody Expense expense) {

        return expenseService.getExpenseById(id)
                .map(existingExpense -> {

                    existingExpense.setDescription(expense.getDescription());
                    existingExpense.setAmount(expense.getAmount());
                    existingExpense.setCategory(expense.getCategory());
                    existingExpense.setDate(expense.getDate());

                    Expense updatedExpense = expenseService.saveExpense(existingExpense);

                    return ResponseEntity.ok(updatedExpense);

                }).orElse(ResponseEntity.notFound().build());
    }

    // Delete expense
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {

        expenseService.deleteExpense(id);

        return ResponseEntity.noContent().build();
    }
}