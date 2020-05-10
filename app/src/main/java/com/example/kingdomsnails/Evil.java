package com.example.kingdomsnails;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Timer;

public class Evil extends View {

    private Sprite hhh;

    private int viewWidth;
    private int viewHeight;

    private int points = 0;

    private final int timerInterval = 20;

    public Evil(Context context) {
        super(context);

        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.hhh);
        int w = b.getWidth() / 5;
        int h = b.getHeight() / 3;
        Rect firstFrame = new Rect(0, 0, w, h);
        hhh = new Sprite(2000, 250, -300, 0, firstFrame, b);
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j >= 0; j--) {

                if (i == 0 && j == 4) {
                    continue;
                }

                if (i == 2 && j == 0) {
                    continue;
                }

                hhh.addFrame(new Rect(j * w, i * h, j * w + w, i * w + w));
            }
        }
        Timer t = new Timer();
        t.start();
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        viewWidth = w;
        viewHeight = h;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(250, 127, 199, 255);
        hhh.draw(canvas);

        Paint p = new Paint();
        p.setAntiAlias(true);
        p.setTextSize(55.0f);
        p.setColor(Color.WHITE);
        canvas.drawText(points + "", viewWidth - 200, 70, p);
    }

    protected void update() {
        hhh.update(timerInterval);

        if (hhh.getX() < - hhh.getFrameWidth()) {
            teleport();
            points +=10;
        }
    }
    private void teleport () {
        hhh.setX(viewWidth + Math.random() * 500);
        hhh.setY(Math.random() * (viewHeight - hhh.getFrameHeight()));
    }
    class Timer extends CountDownTimer {

        public Timer() {
            super(Integer.MAX_VALUE, timerInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            update ();
        }

        @Override
        public void onFinish() {

        }
    }
}