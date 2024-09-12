package com.example.calcimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editPeso;
    EditText editAltura;
    TextView textoResult;
    Button buttonCalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.edtPeso);
        editAltura = findViewById(R.id.edtAltura);
        textoResult = findViewById(R.id.txtResultado);
        buttonCalcula = findViewById(R.id.btnCalcula);
    }

    public void calcular(View v){
        double numpeso;
        double numaltura;

        numpeso = Double.parseDouble(editPeso.getText().toString());
        numaltura = Double.parseDouble(editAltura.getText().toString());

        double numimc = numpeso / (Math.pow(numaltura,2));

        if (numimc < 19){
            textoResult.setText(String.format("%.2f", numimc) +" Abaixo do Peso");
        }else if (numimc < 24){
            textoResult.setText(String.format("%.2f", numimc) +" Peso Ideal");
        }else if (numimc < 29){
            textoResult.setText(String.format("%.2f", numimc) +" SobrePeso");
        }else if (numimc < 34){
            textoResult.setText(String.format("%.2f", numimc) +" Obesidade I");
        }else if (numimc < 39){
            textoResult.setText(String.format("%.2f", numimc) + " Obesidade II");
        }else{
            textoResult.setText(String.format("%.2f", numimc) + " Obesidade III");
        }
    }
}