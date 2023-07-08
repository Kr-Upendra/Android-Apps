package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayingThanks extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saying_thanks);
        TextView sayThanks = findViewById(R.id.thanks);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String userEmail = intent.getStringExtra("userEmail");
        String userPhone = intent.getStringExtra("userPhone");
        String value = "Hello " + username + ", Thanks for subscribing our technical news hub.";
        sayThanks.setText(value);
    }
}
