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
        Button button8 = (Button) findViewById(R.id.button8);
        x = square.getX();
        y = square.getY();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x-=30;
                y-=30;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x+=30;
                y+=30;
            }
        });
    }
}
