package com.example.aerospaceapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int time =1200;
    private ImageView imagen;
    private TextView TitleSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final MediaPlayer soundStart = MediaPlayer.create(this,R.raw.shipspace);
        imagen=findViewById(R.id.ImgPicture);
        TitleSplash=findViewById(R.id.TitleSplash);
        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.blink);






        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                imagen.startAnimation(animation);
                TitleSplash.startAnimation(animation);
                soundStart.start();
                Intent intent= new Intent(MainActivity.this,ShowTaskCalendar.class);
                startActivity(intent);
                finish();
            }
        },time);

    }
}
