package com.example.budgettracker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExpenseAdaptor extends RecyclerView.Adapter<ExpenseAdaptor.MyViewHolder>{
    @null
    @Override
    public MyViewHolder onCreativeViewHolder(@NonNull ViewGroup parent,int viewType){
        return null;
    }
    @Override
    public MyViewHolder onCreativeViewHolder(@NonNull ViewGroup holder,int position){
    }
    @Override

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

        }
    }

}
