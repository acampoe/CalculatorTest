package com.movil.operacionesmovil2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.txtNumber1);
        n2 = findViewById(R.id.txtNumber2);
        res = findViewById(R.id.lblResult);

    }
        public void Calculate(View v){
            double num1, num2, resultado;

            num1 = Double.parseDouble(n1.getText().toString());
            num2 = Double.parseDouble(n2.getText().toString());

            resultado = Metodos.sumar(num1,num2);

            res.setText(String.valueOf(resultado));

    }
}
