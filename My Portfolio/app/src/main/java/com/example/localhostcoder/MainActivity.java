package com.example.localhostcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.seeMore);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), TechActivity.class);
            startActivity(intent);
        });
    }
}

