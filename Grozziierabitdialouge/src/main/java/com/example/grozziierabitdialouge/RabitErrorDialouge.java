package com.example.grozziierabitdialouge;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.codesgood.views.JustifiedTextView;

public class RabitErrorDialouge extends Dialog {
    Context context;
    Animation imageanimation;
    int flag=1;
    String title;
    String exitmesage;
    String yesbuttiontext;
    String nobuttontext;
    ////
    TextView textdet;
    JustifiedTextView justift;
    ImageView clclc;
    Button yesbutton;
    Button nobutton;
    ImageView deviceanimation__1;


    public RabitErrorDialouge(@NonNull Context context) {

        super(context);
        this.context=context;
        this.title=title;
        this.exitmesage=exitmesage;
        this.yesbuttiontext=yesbuttiontext;
        this.nobuttontext=nobuttontext;
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.defaultdialougedesign);
        imageanimation= AnimationUtils.loadAnimation(context,R.anim.splash_top_animation);
        deviceanimation__1=(ImageView)findViewById(R.id.deviceanimation__1);
        deviceanimation__1.setAnimation(imageanimation);
        imageanimation.start();
       // this.isCancelable(false);



        ////
        textdet=findViewById(R.id.textdet);
        justift=findViewById(R.id.justift);
        clclc=findViewById(R.id.cancel_button);
        yesbutton=findViewById(R.id.yesbutton);
        nobutton=findViewById(R.id.nobutton);
        ///////
       initDefaultCase();

    }
    private void initDefaultCase() {
        textdet.setVisibility(View.VISIBLE);
        justift.setVisibility(View.VISIBLE);
        clclc.setVisibility(View.GONE);
        yesbutton.setVisibility(View.VISIBLE);
        nobutton.setVisibility(View.VISIBLE);
        deviceanimation__1.setVisibility(View.VISIBLE);
        nobutton.setText("Cancel");
        yesbutton.setText("Exit");
    }
    public RabitErrorDialouge setTitle(String titleText) {
        textdet.setVisibility(View.VISIBLE);
        textdet.setText(titleText);
        return this;
    }
    public RabitErrorDialouge setTitleColor(int color) {
        textdet.setVisibility(View.VISIBLE);
        textdet.setTextColor(color);
        return this;
    }


    public RabitErrorDialouge isCancelable(boolean cancelable){
        this.setCancelable(cancelable);
        return this;
    }
    public RabitErrorDialouge setIcon(int  image)
    {
        deviceanimation__1.setVisibility(View.VISIBLE);
        deviceanimation__1.setImageResource(image);
        return  this;
    }
    public RabitErrorDialouge setMessage(String message) {
        justift.setVisibility(View.VISIBLE);
        justift.setText(message);
        return  this;
    }

    public RabitErrorDialouge setSubtitleColor(int color)
    {
        justift.setVisibility(View.VISIBLE);
        justift.setTextColor(color);
        return this;
    }
    public RabitErrorDialouge yesbuttonText(String text)
    {
        yesbutton.setVisibility(View.VISIBLE);
        yesbutton.setText(text);
        return this;
    }
    public RabitErrorDialouge nobuttonText(String text)
    {
        nobutton.setVisibility(View.VISIBLE);
        nobutton.setText(text);
        return this;
    }
    public RabitErrorDialouge yesbuttonTextColor(int color)
    {
        yesbutton.setVisibility(View.VISIBLE);
        Drawable backgroud=yesbutton.getBackground();
        changingBackgroundColor(backgroud,color);
        return this;
    }
    public RabitErrorDialouge nobuttonTextColor(int color)
    {
        nobutton.setVisibility(View.VISIBLE);
        Drawable drawable=nobutton.getBackground();
        changingBackgroundColor(drawable,color);
        return this;
    }
    private void changingBackgroundColor(Drawable background,int color)
    {
        if (background instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable=(ShapeDrawable)background;
            shapeDrawable.getPaint().setColor(color);
        }
        else if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable=(GradientDrawable)background;
            gradientDrawable.setColor(color);
        }
        else if (background instanceof  ColorDrawable) {
            ColorDrawable colorDrawable=(ColorDrawable)background;
            colorDrawable.setColor(color);
        }
    }
    public RabitErrorDialouge setyesbuttonClicklistener(String message, View.OnClickListener configlistener)
    {
        yesbutton.setVisibility(View.VISIBLE);
        yesbutton.setText(message);
        yesbutton.setOnClickListener(configlistener);
        return this;
    }
    public RabitErrorDialouge setnobuttonClicklisener(String message, View.OnClickListener configlistener)
    {
        nobutton.setVisibility(View.VISIBLE);
        nobutton.setText(message);
        nobutton.setOnClickListener(configlistener);
        return this;
    }
    public RabitErrorDialouge closeOnclicklistener(View.OnClickListener configlistener)
    {
        clclc.setVisibility(View.VISIBLE);
        clclc.setOnClickListener(configlistener);
        return this;
    }
}
