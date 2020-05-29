package com.example.kingdomsnails;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class Tower2 extends View {

    private int Power;
    private int Speed;

    public Tower2(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.tower2);
    }

    public Tower2(Context context, int power, int speed) {
        super(context);
        Power = power;
        Speed = speed;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

}
