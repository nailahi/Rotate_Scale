package com.example.rotate_scale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Switch;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
    }

    public void onClick(View view){
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        if(switch1.isChecked()){
            ImageView image = findViewById(R.id.imageView);
            Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
            image.startAnimation(rotate);

        }else{
            ImageView image = findViewById(R.id.imageView);
            image.clearAnimation();

    }}

    }