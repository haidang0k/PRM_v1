package com.example.prm_s1.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.prm_s1.R;

public class Tuan21SecondMainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_second_main);
        tv1=findViewById(R.id.tuan21tvi1);
        //don giu lieu
        Intent i1=getIntent();
        //don hang
        String chuoi1=i1.getExtras().getString("so1");
        String chuoi2=i1.getExtras().getString("so2");
        //-----
        float so1=Float.parseFloat(chuoi1);//chuyan sang so
        float so2=Float.parseFloat(chuoi2);
        float tong= so1+so2;
        //Hien thi ket qua
        tv1.setText(String.valueOf(tong));
    }
}