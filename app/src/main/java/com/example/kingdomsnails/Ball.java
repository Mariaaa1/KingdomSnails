package com.example.kingdomsnails;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class Ball extends View  {
    private Bitmap bmp;

    private int x;
    private int y;


    private int Speed;

    private int width;

    private int height;

    public Ball(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.ball);
    }

    public Ball(Context context, Bitmap bmp, int x, int y, int speed, int width, int height) {
        super(context);
        this.bmp = bmp;
        this.x = x;
        this.y = y;
        Speed = speed;
        this.width = width;
        this.height = height;
    }

    public void onDraw(Canvas canvas) {

        canvas.drawBitmap(bmp, x, y, null);
    }



}


