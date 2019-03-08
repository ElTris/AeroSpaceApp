package com.example.aerospaceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity{

    private ImageView profile,facebook,github,vk;
    private TextView socialMedia,devInfo;
    private LinearLayout animBtns;
    private Animation moveleft,moveRight,bounce,blinks;
    private int TimeDelay=500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        moveleft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        moveRight = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        blinks = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinking);


        animBtns=findViewById(R.id.layoutAnim);
        profile=findViewById(R.id.androidProfile);
        facebook=findViewById(R.id.facebookImg);
        github=findViewById(R.id.gitImg);
        vk=findViewById(R.id.vkImg);
        socialMedia=findViewById(R.id.TextSocialMedia);
        devInfo=findViewById(R.id.infoDev);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                profile.setVisibility(View.VISIBLE);
                profile.startAnimation(blinks);
                socialMedia.setVisibility(View.VISIBLE);
                socialMedia.startAnimation(moveleft);
                animBtns.setVisibility(View.VISIBLE);
                animBtns.startAnimation(bounce);
                devInfo.setVisibility(View.VISIBLE);
                devInfo.startAnimation(moveRight);

            }
        },TimeDelay);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.facebook.com/isma.tristanromero?ref=bookmarks");
                Intent intent1= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);

            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/ElTris");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        vk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("");
                Intent intent=  new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });



    }
}
