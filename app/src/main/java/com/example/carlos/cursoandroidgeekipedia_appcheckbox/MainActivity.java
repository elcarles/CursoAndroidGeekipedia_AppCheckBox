package com.example.carlos.cursoandroidgeekipedia_appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1 ,et_valor2 ;
    private TextView tv_resultado;
    private CheckBox cb_sumar, cb_restar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);
        tv_resultado = findViewById(R.id.tv_resultado);
        cb_sumar = findViewById(R.id.cb_sumar);
        cb_restar = findViewById(R.id.cb_restar);

    }

    public void calcular(View view){

        String valor1_s = et_valor1.getText().toString();
        String valor2_s = et_valor2.getText().toString();


        int valor1_int = Integer.parseInt(valor1_s);
        int valor2_int = Integer.parseInt(valor2_s);
        int res= 0;

        //hacer las operaciones.

        if (cb_sumar.isChecked()) {
            res = valor1_int + valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }
        else
        if (cb_restar.isChecked()) {
            res = valor1_int - valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }

        else
        {
            Toast.makeText(getApplicationContext(), "Debe de marcar alguna operacion " , Toast.LENGTH_LONG).show();}






    }



}
