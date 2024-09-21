package com.androidcodefinder.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai bao bien giao dien
    EditText edtA, edtB, edtKQ;
    Button btntong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa id cho cac bien giao dien
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btntong = findViewById(R.id.btntong);

        //xu ly tuong tac voi nguoi dung
        btntong.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a + b ;
                edtKQ.setText(c+"");
            }
        });
    }
}