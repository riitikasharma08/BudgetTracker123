package com.example.budgettracker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")
public class ExpenseTable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String paymentType;
    private long amount;
    private String description;
    private boolean isIncome;
    public ExpenseTable() {
    }
    public ExpenseTable(int id,String paymentType,long amount,String description,boolean isIncome){
        this.id=id;
        this.paymentType=paymentType;
        this.amount = amount;
        this.description=description;
        this.isIncome = isIncome;
    }
    public int getId(){
        return id;
    }

    public void setIncome(boolean isIncome) {
    }

    public void setDescription(String desc) {
    }

    public void setPaymentType(String type) {
    }

    public void setAmount(long parseLong) {
    }
}
