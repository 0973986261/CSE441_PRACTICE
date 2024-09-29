package com.androidcodefinder.prac03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<country> countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rvCountry);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<country> country = new ArrayList<>();
        country.add(new country(R.drawable.viet_nam,"Việt Nam","Hà Nội","213213","21321321","123213","12,3"));
        country.add(new country(R.drawable.trung_quoc,"Trung Quốc","Bắc Kinh","213213","21321321","123213","12,3"));
        country.add(new country(R.drawable.anh,"Anh","London","213213","21321321","123213","12,3"));
        country.add(new country(R.drawable.america,"Hoa Kỳ","New York","213213","21321321","123213","12,3"));
        country.add(new country(R.drawable.phap,"Pháp","Paris","213213","21321321","123213","12,3"));
        country.add(new country(R.drawable.nhat_ban,"Nhật Bản","Tokyo","213213","21321321","123213","12,3"));

        CountryAdapter adapter = new CountryAdapter(countryList, this);
        recyclerView.setAdapter(adapter);
    }
}