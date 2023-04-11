package com.example.grozziierabitdialouge;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codesgood.views.JustifiedTextView;

import es.dmoral.toasty.Toasty;

public class RabitExit {
  Context context;
  Animation imageanimation;
    int flag=1;
public  void RabitExitDialouge(Context context,String title,String exitmesage,String yesbuttiontext,String nobuttontext) {
    Dialog dialog=new Dialog(context);

    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    dialog.setContentView(R.layout.exitdialouge);
    imageanimation= AnimationUtils.loadAnimation(context,R.anim.splash_start_animation);
    ImageView deviceanimation__1=(ImageView)dialog.findViewById(R.id.deviceanimation__1);
    dialog.setCancelable(false);
    ///UI
    TextView textdet=(TextView)dialog.findViewById(R.id.textdet);
    textdet.setText(title);
    JustifiedTextView justift=(JustifiedTextView)dialog.findViewById(R.id.justift);
    justift.setText(exitmesage);
    deviceanimation__1.setAnimation(imageanimation);
    Button yesbutton=(Button)dialog.findViewById(R.id.yesbutton);
    yesbutton.setText(yesbuttiontext);
    Button nobutton=(Button)dialog.findViewById(R.id.nobutton);
    nobutton.setText(nobuttontext);
    nobutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();

        }
    });

    yesbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           flag=2;
            IsCheckedyesbuttion();
dialog.dismiss();
            Toasty.success(context.getApplicationContext(),"Apps is closed.", Toasty.LENGTH_SHORT,true).show();
            return;

        }
    });
    ImageView cancel_button=(ImageView)dialog.findViewById(R.id.cancel_button);
    cancel_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });
    dialog.show();

}
public  void  IsCheckedyesbuttion()
    {
        Toast.makeText(context, ""+flag, Toast.LENGTH_SHORT).show();
    }
    public RabitExit(Context context) {
        this.context = context;
    }
}
