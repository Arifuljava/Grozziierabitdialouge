package com.example.grozziierabitdialouge;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.codesgood.views.JustifiedTextView;

public class RabitInfoDialouge extends Dialog {
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


    public RabitInfoDialouge(@NonNull Context context) {

        super(context);
        this.context=context;
        this.title=title;
        this.exitmesage=exitmesage;
        this.yesbuttiontext=yesbuttiontext;
        this.nobuttontext=nobuttontext;
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.infodialouge);
        imageanimation= AnimationUtils.loadAnimation(context,R.anim.splash_end_animation);
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
      //  initDefaultCase();

    }


}
