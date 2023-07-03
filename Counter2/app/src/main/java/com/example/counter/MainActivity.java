package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView count;
    int counter = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button increase = findViewById(R.id.increase);
        Button decrease = findViewById(R.id.decrease);
         count = findViewById(R.id.count);

         increase.setOnClickListener(v -> {
             counter++;
             count.setText(Integer.toString(counter));
         });

         decrease.setOnClickListener(v -> {
             counter--;
             count.setText(Integer.toString(counter));
         });

    }
}
