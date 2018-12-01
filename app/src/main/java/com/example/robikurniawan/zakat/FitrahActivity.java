package com.example.robikurniawan.zakat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FitrahActivity extends AppCompatActivity {

    EditText hargaberas,jml_keluarga;
    TextView output;
    Double v1,v2,ihasil_fitrah;
    Integer param;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitrah);

        hargaberas = (EditText) findViewById(R.id.ihargaberas);
        jml_keluarga = (EditText) findViewById(R.id.ijml_keluarga);
        output = (TextView) findViewById(R.id.ihasil_fitrah);
    }

    public void Home(View view) {
        Intent intent = new Intent(FitrahActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void konver(){
        //konversi inputan ke double
        v1 = Double.parseDouble(hargaberas.getText().toString());
        v2 = Double.parseDouble(jml_keluarga.getText().toString());
    }


    public void BtnProsesx(View view) {
        konver();
        param = 4;
        ihasil_fitrah = param * v1 * v2;  //perhitungan
        output.setText(Double.toString(ihasil_fitrah));  //output
    }


}
