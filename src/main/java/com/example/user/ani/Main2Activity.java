package com.example.user.ani;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    AnimationDrawable wifi,text;
    Animation slideUpAnimation;
    TextView tv2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView=(ImageView) findViewById(R.id.image);



        tv2=(TextView)findViewById(R.id.withText);
        btn2=(Button) findViewById(R.id.button);

        imageView.setBackgroundResource(R.drawable.animation);


        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);


        wifi=(AnimationDrawable)imageView.getBackground();




    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        wifi.start();

        tv2.startAnimation(slideUpAnimation);



        // wifi.getDuration(2000);
        // Intent intent=new Intent(this,Main2Activity.class);
        //startActivity(intent);
    }

    public void dobtn2(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}

