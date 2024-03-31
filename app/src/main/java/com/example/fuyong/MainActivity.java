package com.example.fuyong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.refresh.GodRefreshLayout;

public class MainActivity extends AppCompatActivity {
    private GodRefreshLayout godRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        godRefreshLayout = findViewById(R.id.god_refresh);
        godRefreshLayout.setRefreshManager();
    }
}