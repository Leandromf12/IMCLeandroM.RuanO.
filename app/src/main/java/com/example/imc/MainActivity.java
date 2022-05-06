package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPeso;
    private EditText editTextAltura;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        textViewResultado = findViewById(R.id.textViewResultado);
    }
    public void calculoIMC(View v){
            Intent i = new Intent(this,Activity2.class);
            i.putExtra("Peso", editTextPeso.getText().toString());
            i.putExtra("Altura", editTextAltura.getText().toString());
            startActivity(i);
    }
}