package com.example.jieun;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.jieun.MainActivity;
import com.example.jieun.R;

    public class Square extends View {
        Paint paint;
        Bitmap bitmap;
        public Square(Context context, AttributeSet attrs) {
            super(context, attrs);
            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawBitmap(bitmap, MainActivity.x, 0, paint);
            invalidate();
        }
    }
