package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void criarCheckBox (View view) {
        EditText editTextNome2 = findViewById(R.id.editTextNome2);
        LinearLayout linearLayoutCheckBox = findViewById(R.id.layoutCheckboxes);

        String nome = editTextNome2.getText().toString().trim();

            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(nome.chars()));
            linearLayoutCheckBox.addView(checkBox);

        }
        public void voltar (View view)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }