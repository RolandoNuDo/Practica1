package com.rolando.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    Button calcular;
    EditText numero;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView)findViewById(R.id.txtCalculado);
        calcular = (Button)findViewById(R.id.btnCalcular);
        numero = (EditText)findViewById(R.id.numeros);
        calcular.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcular:
                String strNumero = numero.getText().toString().trim();
                if (!strNumero.isEmpty()){
                    double N = Double.parseDouble(strNumero);
                    double suma = 0d;
                    suma = N *(N+1d)/2d;

                    texto.setText(""+suma);
                    texto.setVisibility(View.VISIBLE);
                }

                    break;


        }
    }
}
