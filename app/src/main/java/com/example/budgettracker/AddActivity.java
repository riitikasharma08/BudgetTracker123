package com.example.budgettracker;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

        import com.example.budgettracker.databinding.ActivityAddBinding;

public class AddActivity extends AppCompatActivity {
    ActivityAddBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        boolean update = getIntent().getBooleanExtra("update",false);
        Toast.makeText(this,""+update, Toast.LENGTH_SHORT).show();
        String desc = getIntent().getStringExtra("desc");
        long  amount = getIntent().getLongExtra("amount",-1);
        int id= getIntent().getIntExtra("id",-1);
        String ptype= getIntent().getStringExtra("paymenttype");
        boolean isIncome = getIntent().getBooleanExtra("isincome",false);

        if(update){
            binding.addText.setText("Update");
            binding.amount.setText(amount+"");
            binding.paymentType.setText(ptype);
            binding.description.setText(desc);
            if(isIncome){
                binding.incomeRadio.setChecked(true);
            }else{
                binding.expenseRadio.setChecked(true);
            }
        }
        

        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = binding.amount.getText().toString();
                String type = binding.paymentType.getText().toString();
                String desc = binding.description.getText().toString();
                boolean isIncome = binding.incomeRadio.isChecked();
                ExpenseTable expenseTable = new ExpenseTable();
                expenseTable.setAmount(Long.parseLong(amount));
                expenseTable.setDescription(desc);
                expenseTable.setIncome(isIncome);
                expenseTable.setPaymentType(type);

                ExpenseDatabase expenseDatabase = ExpenseDatabase.getInstance(view.getContext());
                ExpenseDao expenseDao = expenseDatabase.getDao();
                 if(!update){

                     expenseDao.insertExpense(expenseTable);
                 }else{
                     expenseTable.setId(id);
                     expenseDao.updateExpense(expenseTable);
                 }

                finish();
            }
        });
    }
}