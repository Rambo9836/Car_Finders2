package com.example.carfinder;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {
TextView firstl;
Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        firstl=findViewById(R.id.firstl);
        button =findViewById(R.id.button);

        Animation translate= AnimationUtils.loadAnimation(this,R.anim.translate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstl.startAnimation(translate);
            }
        });

    }
}