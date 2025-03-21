package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void preferencias(View view) {
        CheckBox checkBox1 = findViewById(R.id.checkBoxNotificacoes);
        CheckBox checkBox2 = findViewById(R.id.checkBoxModoEscuro);
        CheckBox checkbox3 = findViewById(R.id.checkBoxLembrarLogin);

        StringBuilder preferencias = new StringBuilder();
        if (checkBox1.isChecked()) {
            preferencias.append("Receber notificações");
        }
        if (checkBox2.isChecked()) {
            preferencias.append("Modo Escuro");
        }
        if (checkbox3.isChecked()) {
            preferencias.append("Lembrar Login");
        }

        if (preferencias.length() == 0) {
            Toast.makeText(getApplicationContext(), "Nenhuma preferência foi escolhida.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Suas preferências foram salvas.\n" + preferencias.toString(), Toast.LENGTH_LONG).show();

        }
    }


        public void voltar (View view)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
