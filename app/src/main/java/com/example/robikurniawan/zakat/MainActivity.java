package com.example.robikurniawan.zakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, FitrahActivity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, ProfesiActivity.class);
        startActivity(intent);
    }

    public void lihat(View view) {
        Intent intent = new Intent(MainActivity.this, PiActivity.class);
        startActivity(intent);
    }







}
