package com.example.kingdomsnails;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;


public class Tower1  extends View {
    private int Power;

    public Tower1(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.tower1);
    }

    public Tower1(Context context, int power) {
        super(context);
        Power = power;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }
}
