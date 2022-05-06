package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public  Integer[] resourceimage;
    public int posicaoimg;
    private TextView resultado;
    private ImageView imageViewR;
    private float fPeso, fAltura, fResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        resultado = findViewById(R.id.textViewResultado);

        Intent i = getIntent();
        fPeso = Float.parseFloat(i.getStringExtra("Peso"));
        fAltura = Float.parseFloat(i.getStringExtra("Altura"));
        fResultado = fPeso / (fAltura * fAltura);

        this.resourceimage= new Integer[]{R.drawable.abaixopeso, R.drawable.normal, R.drawable.obesidade1, R.drawable.obesidade2,
        R.drawable.obesidade3, R.drawable.sobrepeso};
        imageViewR = findViewById(R.id.imageViewResultado);
        posicaoimg = 0;

        if(fResultado < 18.5){
            posicaoimg = 0;
            resultado.setText("Seu IMC é : " + fResultado +" Está abaixo do peso.");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);

        }else if (fResultado >= 18.5 && fResultado <= 24.9){
            posicaoimg = 1;
            resultado.setText("Seu IMC é : " + fResultado +" Está com o peso ideal.");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);
        }else if(fResultado >=25 && fResultado <= 29.99){
            posicaoimg = 5;
            resultado.setText("Seu IMC é : " + fResultado +" Está levemente acima do peso.");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);
        }else if(fResultado>=30 && fResultado <= 34.99){
            posicaoimg = 2;
            resultado.setText("Seu IMC é : " + fResultado +" Está com obesidade grau 1).");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);
        }else if(fResultado>=35 && fResultado <= 39.99){
            posicaoimg = 3;
            resultado.setText("Seu IMC é : " + fResultado +" Está com obesidade grau 2");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);
        }else if(fResultado>40){
            posicaoimg = 4;
            resultado.setText("Seu IMC é : " + fResultado +" Está com obesidade grau 3.");
            imageViewR.setImageResource(this.resourceimage[posicaoimg]);
        }

    }
}