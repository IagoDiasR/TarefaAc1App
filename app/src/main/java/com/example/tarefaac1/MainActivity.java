package com.example.tarefaac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void trocaEx1(View view)
    {
        Intent intent = new Intent(this, Exercicio1.class);
        startActivity(intent);
    }

    public void trocaEx2(View view)
    {
        Intent intent = new Intent(this, Exercicio2.class);
        startActivity(intent);
    }

    public void trocaEx3(View view)
    {
        Intent intent = new Intent(this, Exercicio3.class);
        startActivity(intent);
    }

    public void trocaEx4(View view)
    {
        Intent intent = new Intent(this, Exercicio4.class);
        startActivity(intent);
    }

    public void trocaEx5(View view)
    {
        Intent intent = new Intent(this, Exercicio5.class);
        startActivity(intent);
    }
}