package com.example.animatsiya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.time.Year;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
ImageView imageView1;
ImageView imageView2;
ImageView imageView3;
ImageView imageView4;
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview1);
        imageView1=findViewById(R.id.imageview2);
        imageView2=findViewById(R.id.imageview3);
        imageView3=findViewById(R.id.imageview4);
        imageView4=findViewById(R.id.imageview5);
        textView=findViewById(R.id.textview1);
       button=findViewById(R.id.button1);

       imageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               YoYo.with(Techniques.BounceInRight).duration(500).repeat(0).playOn(imageView);
           }
       });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOutRight).duration(500).repeat(0).playOn(textView);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInUp).duration(500).repeat(0).playOn(button);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeInUp).duration(500).repeat(0).playOn(imageView1);
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutRight).duration(500).repeat(0).playOn(imageView2);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOut).duration(500).repeat(0).playOn(imageView3);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutLeft).duration(500).repeat(0).playOn(imageView4);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInRight).duration(500).repeat(0).playOn(imageView);
            }
        });
    }
}
