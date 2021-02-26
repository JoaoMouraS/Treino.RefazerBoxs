package com.teste.refazerboxs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view) {

        TextInputEditText nome = findViewById(R.id.nome);
        TextInputEditText email = findViewById(R.id.email);
        TextView resultado = findViewById(R.id.textView);
        TextView resultado2 = findViewById(R.id.textView2);
        TextView resultado3 = findViewById(R.id.textView3);
        RadioButton masculino = findViewById(R.id.radioButton2);
        RadioButton feminino = findViewById(R.id.radioButton3);
        RadioButton branco = findViewById(R.id.radioButton);
        RadioButton negro = findViewById(R.id.radioButton4);
        RadioButton pardo = findViewById(R.id.radioButton5);
        RadioButton amarela = findViewById(R.id.radioButton6);
        TextView resultado4 = findViewById(R.id.textView5);


        String resultadoNome = nome.getText().toString();
        String resultadoEmail = email.getText().toString();
        resultado.setText(resultadoNome);
        resultado2.setText(resultadoEmail);


        if (masculino.isChecked()){resultado3.setText("Masculino");}
        else if (feminino.isChecked()){resultado3.setText("Feminino");}
        else {resultado3.setText("");}
        if (branco.isChecked()){resultado4.setText("Branco");}
        else if (pardo.isChecked()){resultado4.setText("Pardo");}
        else if (negro.isChecked()){resultado4.setText("Negro");}
        else {resultado4.setText("Amarela");}








}}