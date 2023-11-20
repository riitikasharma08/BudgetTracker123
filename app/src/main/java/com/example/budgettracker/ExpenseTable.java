package com.example.budgettracker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")
public class ExpenseTable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String paymentType;
    public String description;
    private boolean isIncome;
    public ExpenseTable() {
    }
    public ExpenseTable(int id,String paymentType,long amount,String description,boolean isIncome){
        this.id=id;
        this.paymentType=paymentType;
        this.description=description;
        this.isIncome = isIncome;
    }

    public static int getTitle() {
        return 0;
    }

    public static long getAmount() {
        return 0;
    }

    public static int getDescription() {
        return 0;
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

    public String getPaymentType() {
        return null;
    }

    public boolean isIncome() {
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }
}
