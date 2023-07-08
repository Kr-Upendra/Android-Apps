package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText phone = findViewById(R.id.phoneNumber);
        Button subscribeBtn = findViewById(R.id.subscribe);
        subscribeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPhone = phone.getText().toString();
                if (userName.equals("") || userEmail.equals("") || userPhone.equals(""))
                    Toast.makeText(MainActivity.this, "Please Fill the values!", Toast.LENGTH_SHORT).show();
                else if (userPhone.length() < 10)
                    Toast.makeText(MainActivity.this, "Please enter a valid Phone Number!", Toast.LENGTH_SHORT).show();
                else if (!userEmail.contains(".") || !userEmail.contains("@"))
                    Toast.makeText(MainActivity.this, "Please enter a valid email!", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(MainActivity.this, SayingThanks.class);
                    intent.putExtra("username", userName);
                    intent.putExtra("userEmail", userEmail);
                    intent.putExtra("userPhone", userPhone);
                    startActivity(intent);
                    name.setText("");
                    email.setText("");
                    phone.setText("");
                }
            }
        });
    }
}
