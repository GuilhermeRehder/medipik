package com.example.medipik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private RelativeLayout orderNowBtn, prescriptionBtn, ordersBtn, pharmacistsBtn, profileBtn, chatsBtn, pillReminderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        orderNowBtn = findViewById(R.id.orderNowBtn);

        orderNowBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                orderNowBtnActivity();

            }

        });

        prescriptionBtn = findViewById(R.id.prescriptionBtn);

        prescriptionBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                prescriptionBtnActivity();

            }

        });

        ordersBtn = findViewById(R.id.ordersBtn);

        ordersBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ordersBtnActivity();

            }

        });

        pharmacistsBtn = findViewById(R.id.pharmacistsBtn);

        pharmacistsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                pharmacistsBtnActivity();

            }

        });

        profileBtn = findViewById(R.id.profileBtn);

        profileBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                profileBtnActivity();

            }

        });

        chatsBtn = findViewById(R.id.chatsBtn);

        chatsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                chatsBtnActivity();

            }

        });

        pillReminderBtn = findViewById(R.id.pillReminderBtn);

        pillReminderBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                pillReminderBtnActivity();

            }

        });
    }

    private void orderNowBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Order Now",
                Toast.LENGTH_SHORT).show();
    }

    private void prescriptionBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Prescription",
                Toast.LENGTH_SHORT).show();
    }

    private void ordersBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Orders",
                Toast.LENGTH_SHORT).show();
    }

    private void pharmacistsBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Pharmacists",
                Toast.LENGTH_SHORT).show();
    }

    private void profileBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Profile",
                Toast.LENGTH_SHORT).show();
    }

    private void chatsBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Chats",
                Toast.LENGTH_SHORT).show();
    }

    private void pillReminderBtnActivity() {
        Toast.makeText(getApplicationContext(),
                "Pill Reminder",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
}