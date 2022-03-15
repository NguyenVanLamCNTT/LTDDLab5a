package com.example.ltddlab5a;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deail_food);
        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            String detail = intent.getStringExtra("detail");
        }
    }
}
