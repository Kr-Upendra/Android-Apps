package com.example.localhostcoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        CardView frontDesignActivity = (CardView) findViewById(R.id.java);
        CardView nodejsActivity = (CardView) findViewById(R.id.nodejs);
        CardView reactActivity = (CardView) findViewById(R.id.react);
        CardView jsActivity = (CardView) findViewById(R.id.js);
        CardView extension = (CardView) findViewById(R.id.extension);
        CardView portfolio = (CardView) findViewById(R.id.portfolio);

        frontDesignActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frontDesignIntent = new Intent(getApplicationContext(), JavaProjectsActivity.class);
                startActivity(frontDesignIntent);
            }
        });

        nodejsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nodePage = new Intent(getApplicationContext(), NodeActivity.class);
                startActivity(nodePage);
            }
        });

        reactActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reactPage = new Intent(getApplicationContext(), ReactActivity.class);
                startActivity(reactPage);
            }
        });

        jsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jsPage = new Intent(getApplicationContext(), JsActivity.class);
                startActivity(jsPage);
            }
        });

        extension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/Kr-Upendra/Extentions"));
                startActivity(intent);
            }
        });

        portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://kupendra.netlify.app"));
                startActivity(intent);
            }
        });
    }
}
