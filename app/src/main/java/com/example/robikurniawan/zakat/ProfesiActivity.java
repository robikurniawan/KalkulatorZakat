package com.example.robikurniawan.zakat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProfesiActivity extends AppCompatActivity {

    EditText penghasilan,hutang;
    TextView output;
    Double v1,v2,ihasil_profesi;
    Integer param;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesi);

        penghasilan = (EditText) findViewById(R.id.ipenghasilan);
        hutang = (EditText) findViewById(R.id.ihutang);
        output = (TextView) findViewById(R.id.ihasil_profesi);

    }

    public void Home(View view) {
        Intent intent = new Intent(ProfesiActivity.this, MainActivity.class);
        startActivity(intent);
    }

//    public void konver(){
//        //konversi inputan ke double
//        v1 = Double.parseDouble(penghasilan.getText().toString());
//        v2 = Double.parseDouble(hutang.getText().toString());
//    }


    public void BtnProsesx(View view) {
//        konver();
        param = 2;
        ihasil_profesi = param * v1 - v2;  //perhitungan
        output.setText(Double.toString(ihasil_profesi));  //output
    }




}
