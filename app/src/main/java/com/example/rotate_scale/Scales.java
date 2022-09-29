package com.example.rotate_scale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Switch;

public class Scales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scales);
    }

//switch doesn't work with scale for some reason omg nvm
    public void onClick(View view){
        Switch aSwitch = (Switch) findViewById(R.id.switch2);
        ImageView image = findViewById(R.id.imageView2);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        if(aSwitch.isChecked()){
        image.startAnimation(anim);
    }
    else{
    image.clearAnimation();}
    }

}