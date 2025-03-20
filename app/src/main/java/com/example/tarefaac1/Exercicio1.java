package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
    public void verificarIdade(View view){
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextIdade = findViewById(R.id.editTextIdade);
        TextView textViewIdade = findViewById(R.id.textView);

        String nome = editTextNome.getText().toString();
        String idadeString = editTextIdade.getText().toString();

        int idade = Integer.parseInt(idadeString);

        if (idade >= 18) {
            textViewIdade.setText(nome + ", você é maior de 18 anos.");
        } else {
            textViewIdade.setText(nome + ", você é menor de 18 anos.");
        }
    }


    public void voltar(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}