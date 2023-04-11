package com.example.grozziierabitdialouge;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;

import java.util.Objects;

public class RabitProgressDialouge {
    public  static final  String withImage="image";
    public  static final String withgif="gif";
    public  static final  String withlottie="lottie";
    private  static String viewType;
    private Uri gifLocation;
    private  static  boolean lottieCompactPadding=false;
    LottieAnimationView lottieAnimationView;
    private Activity mContext;
    private Dialog alertDialouge;
    View dialougeView;
    CardView parent;
    private int  topPadding,bottomPadding,leftPadding,rightPadding,overallPadding;
    LinearLayout linearLayout;
    ImageView imageView;
    TextView textView;
    @SuppressLint("ResourceAsColor")
    public RabitProgressDialouge(Activity activity, String  type,String message)
    {
        this.mContext=activity;
        alertDialouge=new Dialog(activity,R.style.RoundedCornersDialog_Mid);
        alertDialouge.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialougeView= LayoutInflater.from(activity).inflate(R.layout.layout_progress_dialog,null);
        alertDialouge.setContentView(dialougeView);
        Objects.requireNonNull(alertDialouge.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialouge.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                if (lottieAnimationView.isAnimating()) {
                    lottieAnimationView.cancelAnimation();

                }
            }
        });
        alertDialouge.setCanceledOnTouchOutside(false);
        alertDialouge.setCancelable(false);
        setupmyPadding();

        ///after padding
        parent=dialougeView.findViewById(R.id.parent);
        parent.setElevation(3f);
        parent.setRadius(15f);

        linearLayout=dialougeView.findViewById(R.id.interior_layout);
        imageView=dialougeView.findViewById(R.id.imageView);
        textView=dialougeView.findViewById(R.id.message);
        lottieAnimationView=dialougeView.findViewById(R.id.lottie);


        lottieAnimationView.setRepeatCount(ValueAnimator.INFINITE);
        viewType=type;
        switch (viewType) {
            case withImage:
            case withgif:
                imageView.setVisibility(View.VISIBLE);
                lottieAnimationView.setVisibility(View.GONE);
                break;
            case withlottie:
                imageView.setVisibility(View.GONE);
                lottieAnimationView.setVisibility(View.VISIBLE);
                lottieAnimationView.setRepeatCount(ValueAnimator.INFINITE);
        }

        if (message!=null) {
            textView.setText(message);
            textView.setVisibility(View.VISIBLE);
            linearLayout.setPadding(leftPadding,topPadding,rightPadding,bottomPadding);

        }
        else {
            textView.setVisibility(View.GONE);
            linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
            if (!viewType.equalsIgnoreCase(withlottie)) {
                linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
            }
            else
            {
                if (lottieCompactPadding) {
                    linearLayout.setPadding(0,0,0,0);
                }
                else {
                    linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
                }

            }
        }
    }
    public  void setFont(String font)
    {
        try {
            Typeface typeface=Typeface.createFromAsset(mContext.getAssets(),font);
            textView.setTypeface(typeface);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public  void setViewType(String type)
    {
        viewType=type;
        switch (type) {
            case withImage:
                break;
            case withgif:
                imageView.setVisibility(View.VISIBLE);
                lottieAnimationView.setVisibility(View.GONE);
                break;
            case withlottie:
                imageView.setVisibility(View.GONE);
                lottieAnimationView.setVisibility(View.VISIBLE);
                break;
        }
    }
    public  void setProgressBarColor(int  color)
    {

    }
    @SuppressLint("ResourceAsColor")
    public  void setLayoutColor(int color)
    {
        parent.setBackgroundColor(color);
    }
    public  void setLayoutRadious(float radious)
    {
        parent.setRadius(radious);
    }
    public  void setlayoutElevation(float elevation)
    {
        parent.setElevation(elevation);
    }
    public  void setLoadingMessage(String message)
    {
        textView.setVisibility(View.VISIBLE);
        textView.setText(message);
    }
public  boolean isShowing()
{
    return alertDialouge.isShowing();
}
public  void setMessageColor(int color)
{
    textView.setTextColor(color);
}
    public void setupmyPadding() {
        topPadding=dptopx(15);
        bottomPadding=dptopx(15);
        leftPadding=dptopx(30);
        rightPadding=dptopx(30);
        overallPadding=dptopx(20);


    }
    public static int dptopx(int dp)
    {
        return (int)(dp * Resources.getSystem().getDisplayMetrics().density);


    }
    public  void showMessage(boolean permission)
    {
        if (permission) {
            textView.setVisibility(View.VISIBLE);
            linearLayout.setPadding(leftPadding,topPadding,rightPadding,bottomPadding);

        }
        else {
            textView.setVisibility(View.VISIBLE);
            if (!viewType.equalsIgnoreCase(withlottie)) {
                linearLayout.setPadding(leftPadding,topPadding,rightPadding,bottomPadding);

            }
            else {
                if (lottieCompactPadding) {
                    linearLayout.setPadding(0,0,0,0);
                }
                else {
                    linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
                }
            }
        }
    }
    public   void setMessage(String message)
    {
        textView.setVisibility(View.VISIBLE);
        textView.setText(message);
        linearLayout.setPadding(leftPadding,topPadding,rightPadding,bottomPadding);
    }
    public  void removeMessage()
    { textView.setVisibility(View.GONE);
    if (!viewType.equalsIgnoreCase(withlottie)) {
        linearLayout.setPadding(0,0,0,0);
    }
    else {
        linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
    }

    }
    public  void setImageLocation(Drawable drawable)
    {
        imageView.setImageDrawable(drawable);
    }
    public  void setImageLocation(Bitmap bitmap)
    {
        imageView.setImageBitmap(bitmap);
    }
    public  void setImageLocation(Uri uri)
    {
        imageView.setImageURI(uri);
    }
    public  void setGifLocation(Uri gifLocation)
    {
        this.gifLocation=gifLocation;
    }
    public  void setLottieLocation(String url)
    {
        lottieAnimationView.setAnimation(url);
    }
    public  void setLottieLoop(boolean vales)
    {
        lottieAnimationView.setRepeatCount(vales? ValueAnimator.INFINITE : 0);

    }
    public  void setLottieCompactPadding(boolean vales)
    {
        lottieCompactPadding=vales;
        if (lottieCompactPadding) {
        linearLayout.setPadding(0,0,0,0);
        }
        else {
            linearLayout.setPadding(overallPadding,overallPadding,overallPadding,overallPadding);
        }
    }
    public  void setCancelableonTouchOutside(boolean status)
    {
        alertDialouge.setCanceledOnTouchOutside(status);
    }
    public  void setcancelable(boolean status)
    {
        alertDialouge.setCancelable(false);

    }
    public void show()
    {
        if (viewType==null) {
            Log.e("View Type","Null");
            return;
        }
        if (viewType.equalsIgnoreCase(withlottie)&&lottieAnimationView!=null) {
            lottieAnimationView.playAnimation();
        }
        if (viewType.equalsIgnoreCase(withgif)&& gifLocation!=null) {
            Glide.with(mContext)
                    .load(gifLocation)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true)
                    .into(imageView);
        }
        alertDialouge.show();



    }
    public  void dismis()
    {
        if (viewType.equalsIgnoreCase(withlottie) && lottieAnimationView!=null) {
            lottieAnimationView.cancelAnimation();
        }
        if (viewType.equalsIgnoreCase(withgif)) {
            try {
                ((GifDrawable)imageView.getDrawable()).stop();

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        alertDialouge.dismiss();

    }

}
