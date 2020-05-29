package com.example.kingdomsnails;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class Tower3 extends View {
    private int Power;
    private int Speed;
    private int HP;

    public Tower3(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.tower3);
    }

    public Tower3(Context context, int power, int speed, int hp) {
        super(context);
        Power = power;
        Speed = speed;
        this.HP = hp;
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

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
