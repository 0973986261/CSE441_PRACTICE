package com.androidcodefinder.prac01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Your_Information extends AppCompatActivity {
    EditText edtName, edtGPA;
    Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_information);
        edtName =findViewById(R.id.edtName);
        edtGPA = findViewById(R.id.edtGPA);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String gpa = edtGPA.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("name", name);
                resultIntent.putExtra("gpa",gpa);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }

}