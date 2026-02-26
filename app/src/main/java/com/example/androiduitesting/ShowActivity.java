package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");

        TextView cityNameView = findViewById(R.id.city_name);
        cityNameView.setText(cityName);

        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> finish());
    }
}
