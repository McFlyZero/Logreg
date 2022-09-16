package com.sarrazin.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        Button btn_volver = (Button) findViewById(R.id.btn_cerrar);
        Button btn_registrar = (Button) findViewById(R.id.btn_registrar);


        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(SignupActivity.this, MenuActivity.class);
               // startActivity(intent);
            }
        });

        Spinner sp = findViewById(R.id.sp_reg_date);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.nacionalidades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setAdapter(adapter);

    }
}