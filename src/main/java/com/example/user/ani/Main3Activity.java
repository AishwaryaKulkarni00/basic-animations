package com.example.user.ani;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Animation blinkAnimation,slidedown;
    AnimationDrawable mood;
    TextView first;
    TextView two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imageView=(ImageView) findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.animation3);
        mood=(AnimationDrawable)imageView.getBackground();

        first= (TextView) findViewById(R.id.always);
        two=(TextView)findViewById(R.id.withText);
        blinkAnimation= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);

        slidedown= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);

        two.startAnimation(blinkAnimation);
        mood.start();


    }
}
