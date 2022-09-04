package com.example.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void r1(View view){
        Intent r= new Intent(this, RegisterActivity.class);
        startActivity(r);
    }

    public void l1(View view){
        Intent l= new Intent(this, MenuActivity.class);
        startActivity(l);
    }
}