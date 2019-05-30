package com.example.user.ani;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation slideUpAnimation;
    ImageView imageView;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        btn=(Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.text);

        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);

       // text = AnimationUtils.loadAnimation(getApplicationContext(),
              //  R.anim.slide_up);
        tv.startAnimation(slideUpAnimation);
        imageView.startAnimation(slideUpAnimation);
        btn.startAnimation(slideUpAnimation);





    }
public void dobtn(View view){
    Intent intent = new Intent(this, Main2Activity.class);
    startActivity(intent);
}







}
