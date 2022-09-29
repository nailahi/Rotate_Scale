package com.example.rotate_scale;

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

    public void rotateClick(View v){
        Intent intentR = new Intent(this, RotateActivity.class);
        startActivity(intentR);
    }

    public void scaleClick(View v){
        Intent intentS = new Intent(this, Scales.class);
        startActivity(intentS);
    }
}