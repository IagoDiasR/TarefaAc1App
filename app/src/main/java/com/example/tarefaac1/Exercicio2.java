package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void operacaoSoma(View view) {
        EditText editTextNum1 = findViewById(R.id.editTextNum1);
        EditText editTextNum2 = findViewById(R.id.editTextNum2);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double resultado = num1 + num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

    public void operacaoSubtrair(View view) {
        EditText editTextNum1 = findViewById(R.id.editTextNum1);
        EditText editTextNum2 = findViewById(R.id.editTextNum2);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double resultado = num1 - num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

    public void operacaoDividir(View view) {
        EditText editTextNum1 = findViewById(R.id.editTextNum1);
        EditText editTextNum2 = findViewById(R.id.editTextNum2);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double resultado = num1 / num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

    public void opercaoMultiplicar(View view){
        EditText editTextNum1 = findViewById(R.id.editTextNum1);
        EditText editTextNum2 = findViewById(R.id.editTextNum2);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double resultado = num1 * num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

        public void voltar (View view)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
