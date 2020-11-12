package com.example.jieun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Square square;
    public static float x = 0;
    public static float y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        square = (Square)findViewById(R.id.square);
        final ImageView square = (ImageView) findViewById(R.id.imageView);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]-30);
                square.setY(loc[1]-1200);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]);
                square.setY(loc[1]-1200);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]+30);
                square.setY(loc[1]-1200);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]-30);
                square.setY(loc[1]-1050);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]+30);
                square.setY(loc[1]-1050);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]-30);
                square.setY(loc[1]-900);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]);
                square.setY(loc[1]-900);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] loc = new int[2];
                v.getLocationOnScreen(loc);
                square.setX(loc[0]);
                square.setY(loc[1]-900);
            }
        });
    }
}
