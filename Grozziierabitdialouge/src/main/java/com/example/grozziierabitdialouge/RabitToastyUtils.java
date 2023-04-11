package com.example.grozziierabitdialouge;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

public class RabitToastyUtils {
    public RabitToastyUtils() {
    }
    static Drawable tintIcon(@NonNull Drawable drawable, @ColorInt  int tintcolor)
    {
        drawable.setColorFilter(tintcolor, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
    static  Drawable tint9PatchDrawableFrame(@NonNull Context context,@ColorInt int tinitColor)
    {
        final NinePatchDrawable toastDrawable=(NinePatchDrawable)getDrawable(context,R.drawable.toast_frame);
        return  tintIcon(toastDrawable,tinitColor);
    }
    static  void setBackground(@NonNull  View view,Drawable drawable) {

if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN)
    view.setBackground(drawable);
else
    view.setBackgroundDrawable(drawable);
    }
    static Drawable getDrawable(Context context,int id)
    {
        return AppCompatResources.getDrawable(context,id);
    }
    static  int getColor(Context context,int color)
    {
        return ContextCompat.getColor(context,color);
    }
}
