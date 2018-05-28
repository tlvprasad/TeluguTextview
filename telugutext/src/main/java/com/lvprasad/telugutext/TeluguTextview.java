package com.lvprasad.telugutext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TeluguTextview extends android.support.v7.widget.AppCompatTextView {


    public TeluguTextview(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "dhurjati.ttf");
        this.setTypeface(face);
    }

    public TeluguTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "dhurjati.ttf");
        this.setTypeface(face);
    }

    public TeluguTextview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "dhurjati.ttf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }

}
