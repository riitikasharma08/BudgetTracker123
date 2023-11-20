package com.example.budgettracker;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities ={ExpenseTable.class},version = 1)

public abstract class ExpenseDatabase extends RoomDatabase {
    public static ExpenseDao getDao() {
        return null;
    }

    public  static volatile ExpenseDatabase INSTANCE;

    public static ExpenseDatabase getInstance(Context context){
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context,ExpenseDatabase.class,"expense")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }
}
