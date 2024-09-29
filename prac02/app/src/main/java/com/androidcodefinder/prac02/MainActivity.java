package com.androidcodefinder.prac02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    private StaffViewModel viewModel;
    private StaffAdapter adapter;
    EditText edtId, edtName, edtBirthDate, edtSalary;
    Button btnAdd;
    RecyclerView RvStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtId = findViewById(R.id.edtId);
        edtName = findViewById(R.id.edtName);
        edtBirthDate = findViewById(R.id.edtBirthDate);
        edtSalary = findViewById(R.id.edtSalary);
        btnAdd = findViewById(R.id.btnAdd);
        RvStaff = findViewById(R.id.RvStaff);

        viewModel = new ViewModelProvider(this).get(StaffViewModel.class);
        adapter = new StaffAdapter((List<Staff>) viewModel.getStaffList());
        RvStaff.setAdapter(adapter);

        btnAdd.setOnClickListener(v -> {
            String id = edtId.getText().toString();
            String name = edtName.getText().toString();
            String birthDate = edtBirthDate.getText().toString();
            int tempSalary = Integer.parseInt((edtSalary.getText().toString()));
            Long salary = (long) tempSalary;
            Staff staff = new Staff(id, name, birthDate, salary);
            viewModel.addStaff(staff);
        });

        viewModel.getStaffList().observe(this, staffList -> {
            adapter.notifyDataSetChanged();
        });
    }
    }
