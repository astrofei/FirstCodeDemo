package com.yzf.firstcodedemo;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yzf.firstcodedemo.RecyclerViewDemo.RecyclerViewDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recyclerViewDemoClick(View view) {
        Intent intent = new Intent(MainActivity.this, RecyclerViewDemoActivity.class);
        startActivity(intent);
    }

}
