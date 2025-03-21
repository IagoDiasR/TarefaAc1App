package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void cadastrar(View view){
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextIdade = findViewById(R.id.editTextIdade);
        EditText editTextTelefone = findViewById(R.id.editTextTelefone);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        Spinner spinnerUF = findViewById(R.id.spinnerUF);
        Spinner spinnerCidade = findViewById(R.id.spinnerCidade);
        CheckBox checkBoxAzul = findViewById(R.id.checkBoxAzul);
        CheckBox checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        CheckBox checkBoxVerde = findViewById(R.id.checkBoxVerde);
        RadioButton radioG = findViewById(R.id.radioG);
        RadioButton radioM = findViewById(R.id.radioM);
        RadioButton radioP = findViewById(R.id.radioP);

        String nome = editTextNome.getText().toString();
        String idade = editTextIdade.getText().toString();
        String telefone = editTextTelefone.getText().toString();
        String email = editTextEmail.getText().toString();
        String uf = spinnerUF.getSelectedItem().toString();
        String cidade = spinnerCidade.getSelectedItem().toString();

        String tamanho = "";
        if (radioG.isChecked()) {
            tamanho = "G";
        } else if (radioM.isChecked()) {
            tamanho = "M";
        } else if (radioP.isChecked()) {
            tamanho = "P";
        }

        StringBuilder cores = new StringBuilder();
        if (checkBoxAzul.isChecked()) cores.append("Azul ");
        if (checkBoxVermelho.isChecked()) cores.append("Vermelho ");
        if (checkBoxVerde.isChecked()) cores.append("Verde ");

        String mensagem = "Cadastro realizado com sucesso!\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n" +
                "UF: " + uf + "\n" +
                "Cidade: " + cidade + "\n" +
                "Tamanho: " + tamanho + "\n" +
                "Cores: " + cores.toString();


        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_LONG).show();
    }

    public void voltar (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}