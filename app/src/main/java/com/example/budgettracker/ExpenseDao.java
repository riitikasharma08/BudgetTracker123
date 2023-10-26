package com.example.budgettracker;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface ExpenseDao {
    @Insert
    void insertExpense(ExpenseTable expenseTable);
    @Update
    void updateExpense(ExpenseTable expenseTable);
    @Query("delete from expense where id=:id")
    void delete(int id);
    @Query("select * from expense")
    List<ExpenseTable> getAll();

}
