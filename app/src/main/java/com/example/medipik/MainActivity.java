package com.example.medipik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button acessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acessar = findViewById(R.id.acessar);

        acessar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                acessarActivity();

            }

        });
    }
        private void acessarActivity() {
            startActivity(new Intent(MainActivity.this, MenuActivity.class));
        }
    }