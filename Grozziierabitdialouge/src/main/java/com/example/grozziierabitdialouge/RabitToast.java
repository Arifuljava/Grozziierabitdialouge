package com.example.grozziierabitdialouge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

@SuppressLint("InflateParams")
public class RabitToast {
    private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
    private static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
    private static int textSize = 16; // in SP
    private  static  boolean tintIcon=true;
    private  static  boolean allowqueue=true;
  private static   int toastGravity=-1;
   private static  int  xOffset=-1;
    private  static  int yOffset=-1;
  private static   boolean supportDarkTheme=true;
   private static boolean isRTL=false;
   private static Toast lastToast=null;
    private static  int LENGTH_SHORT=Toast.LENGTH_SHORT;
   private static int LEANGTH_LONG=Toast.LENGTH_LONG;

    public RabitToast() {
    }
    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message) {
        return normal(context, message, Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, Drawable icon) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, Drawable icon) {
        return normal(context, message, Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration) {
        return normal(context, context.getString(message), duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return normal(context, message, duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon) {
        return normal(context, context.getString(message), duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon) {
        return normal(context, message, duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon, boolean withIcon) {
        return normalWithDarkThemeSupport(context, context.getString(message), icon, duration, withIcon);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon, boolean withIcon) {
        return normalWithDarkThemeSupport(context, message, icon, duration, withIcon);
    }

    @CheckResult
    public  static  Toast warning(@NonNull Context context,@StringRes int message)
    {
        return warning(context,context.getString(message),Toast.LENGTH_SHORT,true);
    }
    @CheckResult
    public  static Toast warning(@NonNull Context context,@NonNull CharSequence mesage)
    {
        return warning(context,mesage,Toast.LENGTH_SHORT,true);
    }
    @CheckResult
    public  static Toast warning(@NonNull Context context,@StringRes int message,int duration)
    {
        return warning(context,context.getString(message),duration,true);
    }
    @CheckResult
    public  static Toast warning(@NonNull Context context,@NonNull CharSequence message,int duration)
    {
        return warning(context,message,duration,true);

    }
    @CheckResult
    public  static  Toast warning(@NonNull Context context,@StringRes int message, int duration, boolean withIcon)
    {
        return custom(context,context.getString(message),RabitToastyUtils.getDrawable(context,R.drawable.ic_error_outline_white_24dp),
                RabitToastyUtils.getColor(context,R.color.warningColor),RabitToastyUtils.getColor(context,
                        R.color.defaultTextColor),duration,withIcon,true);

    }
    @CheckResult
    public  static  Toast warning(@NonNull Context context,@NonNull CharSequence charSequence,int duration,boolean withIcon)
    {
        return custom(context,charSequence,RabitToastyUtils.getDrawable(context,R.drawable.ic_info_outline_white_24dp)
        , RabitToastyUtils.getColor(context,R.color.warningColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor),
                duration,withIcon,true);
    }
    @CheckResult
    public  static Toast info(@NonNull Context context,@StringRes int message)
    {
        return info(context,context.getString(message),Toast.LENGTH_SHORT,true);

    }
    @CheckResult
    public  static Toast info(@NonNull Context context,@NonNull CharSequence message)
    {
        return info(context,message,Toast.LENGTH_SHORT,true);
    }
    @CheckResult
    public  static  Toast info(@NonNull Context context, @StringRes int message,int duration)
    {
        return info(context,context.getString(message),duration,true);
    }
    @CheckResult
    public  static Toast info(@NonNull Context context, @NonNull CharSequence message,int duration)
    {
        return info(context,message,duration,true);
    }
    @CheckResult
    public  static  Toast info(@NonNull Context context,@StringRes int message,int duration,boolean withIcon)
    {
        return custom(context,context.getString(message),RabitToastyUtils.getDrawable(context,R.drawable.ic_info_outline_white_24dp)
        , RabitToastyUtils.getColor(context,R.color.infoColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor)
        ,duration,withIcon,true);
    }
    @CheckResult
    public static  Toast info(@NonNull Context context,@NonNull CharSequence message,int duration,boolean withIcon)
    {
        return  custom(context,message,RabitToastyUtils.getDrawable(context,R.drawable.ic_info_outline_white_24dp)
        ,RabitToastyUtils.getColor(context,R.color.infoColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor)
        ,duration,withIcon,true);
    }
    @CheckResult
    public  static Toast success(@NonNull Context context,@StringRes  int message)
    {
        return success(context,context.getString(message),Toast.LENGTH_SHORT,true);

    }
    public static Toast success(@NonNull Context context,@NonNull CharSequence message)
    {
        return success(context,message,Toast.LENGTH_SHORT,true);
    }
    public  static  Toast success(@NonNull Context context,@StringRes int message,int duration)
    {
        return success(context,context.getString(message),duration,true);
    }
    @CheckResult
    public static Toast success(@NonNull Context context,@NonNull CharSequence message,int duration)
    {
        return success(context,message,duration,true);
    }
    @CheckResult
    public  static  Toast success(@NonNull Context context,@StringRes int message,int duration,boolean withIcon)
    {
        return custom(context,context.getString(message),RabitToastyUtils.getDrawable(context,R.drawable.ic_check_white_24dp),
                RabitToastyUtils.getColor(context,R.color.successColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor),
                duration,withIcon,true);
    }
    @CheckResult
    public static Toast success(@NonNull Context context,@NonNull CharSequence message,int duration,boolean withIcon)
    {
        return custom(context,message,RabitToastyUtils.getDrawable(context,R.drawable.ic_check_white_24dp)
        ,RabitToastyUtils.getColor(context,R.color.successColor),
                RabitToastyUtils.getColor(context,R.color.defaultTextColor)
        ,duration,withIcon,true);
    }
    @CheckResult
    public  static Toast error(@NonNull Context context,@StringRes int message)
    {
        return  error(context,context.getString(message),Toast.LENGTH_SHORT,true);

    }
    @NonNull
    public  static Toast error(@NonNull Context context,@NonNull CharSequence message)
    {
        return error(context,message,Toast.LENGTH_SHORT,true);

    }

    @CheckResult
    public static Toast error(@Nullable Context context,@StringRes int message,int duration)
    {
        return error(context,context.getString(message),duration,true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context,@StringRes int  message,int duration,boolean withIcon)
    {
        return custom(context,context.getString(message),RabitToastyUtils.getDrawable(context,R.drawable.ic_clear_white_24dp)
        ,RabitToastyUtils.getColor(context,R.color.errorColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor)
                , duration,withIcon,true);

    }
    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message,int duration,
                              boolean withIcon)
    {
        return custom(context,message,RabitToastyUtils.getDrawable(context,R.drawable.ic_clear_white_24dp),
                RabitToastyUtils.getColor(context,R.color.errorColor),RabitToastyUtils.getColor(context,R.color.defaultTextColor)
        ,duration,withIcon,true);
    }
    @CheckResult
    public  static Toast custom(@NonNull Context context,@StringRes int message,Drawable icon,int duration,boolean withIcon)
    {
        return custom(context,context.getString(message),icon,-1,RabitToastyUtils.getColor(context,R.color.defaultTextColor),
                duration,withIcon,false);
    }
    @CheckResult
    public static Toast custom(@NonNull Context context,@NonNull CharSequence message,Drawable icon,int duration,boolean withIcon)
    {
        return custom(context,message,icon,-1,
                RabitToastyUtils.getColor(context,R.color.defaultTextColor),
                duration,withIcon,false);
    }
    @CheckResult
    public  static  Toast custom(@NonNull Context context, @StringRes int message,@DrawableRes int iconRes,@ColorRes int tintColorRes, int duration,boolean withicon,boolean shouldTint)
    {
        return custom(context,context.getString(message),RabitToastyUtils.getDrawable(context,iconRes),
                RabitToastyUtils.getColor(context,tintColorRes),RabitToastyUtils.getColor(context,
                        R.color.defaultTextColor),duration,withicon,shouldTint);

    }

    @CheckResult
    public   static Toast custom(@NonNull Context context,@NonNull CharSequence message,
                                 @DrawableRes int iconRes, @ColorRes int tintColorRes,int duration,
                                 boolean withIcon,boolean shouldTint)
    {
        return  custom(context,message,RabitToastyUtils.getDrawable(context,iconRes)
        ,RabitToastyUtils.getColor(context,tintColorRes),RabitToastyUtils.getColor(context,R.color.defaultTextColor),
                duration,withIcon,shouldTint);
    }
    @CheckResult
    public  static  Toast custom(@NonNull Context context, @StringRes int messgae,
                                 Drawable icon,@ColorRes int tintColorRes,int duration,
                                 boolean withIcon,boolean shouldTint)
    {
        return  custom(context,context.getString(messgae),icon,RabitToastyUtils.getColor(context,tintColorRes),
                RabitToastyUtils.getColor(context,R.color.defaultTextColor),duration,withIcon,shouldTint);
    }
    @CheckResult
    public  static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon, @ColorRes int tintColorRes,@ColorRes int textColorRes,
                                int duration,boolean withIcon,boolean shouldTint) {
        return custom(context,context.getString(message),
                icon,RabitToastyUtils.getColor(context,tintColorRes),
                RabitToastyUtils.getColor(context,textColorRes),duration,withIcon,shouldTint);

    }
    @SuppressLint("ShowToast")
    @CheckResult
    public static  Toast  custom(@NonNull Context context, @NonNull CharSequence messag, Drawable icon, @ColorInt int tintColor,
                                 @ColorInt int  textColor,int duration,boolean withIcon,boolean shouldTint)
    {
        final Toast currentToast=Toast.makeText(context,"",duration);
        final View toastLayout=((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toasty_layout,null);
        final LinearLayout toastRoot=toastLayout.findViewById(R.id.toast_root);
        final ImageView toastIcon=toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView=toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;
        if (shouldTint)
            drawableFrame=RabitToastyUtils.tint9PatchDrawableFrame(context,tintColor);
        else
            drawableFrame=RabitToastyUtils.getDrawable(context,R.drawable.toast_frame);
        RabitToastyUtils.setBackground(toastLayout,drawableFrame);

        if (withIcon) {
            if (icon==null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            if (isRTL && Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1)
                toastRoot.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            RabitToastyUtils.setBackground(toastIcon,
                    tintIcon ? RabitToastyUtils.tintIcon(icon,textColor) : icon);
        }
        else {
            toastIcon.setVisibility(View.GONE);
        }
        toastTextView.setText(messag);
        toastTextView.setTextColor(textColor);
        toastTextView.setTypeface(currentTypeface);
        toastTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,textSize);
        currentToast.setView(toastLayout);

        if (!allowqueue) {
            if (lastToast!=null)
                lastToast.cancel();
            lastToast=currentToast;
        }
        currentToast.setGravity(
                toastGravity== -1 ? currentToast.getGravity() : toastGravity,
                xOffset == -1 ? currentToast.getXOffset() : xOffset,
                yOffset== -1 ? currentToast.getYOffset() : yOffset
        );
        return currentToast;

    }
    private static Toast normalWithDarkThemeSupport(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                                                    int duration, boolean withIcon) {
        if (supportDarkTheme && Build.VERSION.SDK_INT >= 29) {
            int uiMode = context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
            if (uiMode == Configuration.UI_MODE_NIGHT_NO) {
                return withLightTheme(context, message, icon, duration, withIcon);
            }
            return withDarkTheme(context, message, icon, duration, withIcon);
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
                return withLightTheme(context, message, icon, duration, withIcon);
            } else {
                return withDarkTheme(context, message, icon, duration, withIcon);
            }
        }
    }
  private static Toast withLightTheme(@NonNull Context context, @NonNull CharSequence message, Drawable icon,int duration,boolean withIcon)
  {
      return  custom(context,message,icon,RabitToastyUtils.getColor(context,R.color.normalColor),RabitToastyUtils.getColor(context,
              R.color.normalColor),duration,withIcon,true);
  }
  private  static Toast withDarkTheme(@NonNull Context context,@NonNull CharSequence message, Drawable icon,
                                      int duration, boolean withIcon)
  {
      return  custom(context,message,icon,RabitToastyUtils.getColor(context,R.color.normalColor),RabitToastyUtils.getColor(context,
              R.color.defaultTextColor),duration,withIcon,true);
  }
  public  static class  Config{
       private static Typeface typeface=RabitToast.currentTypeface;
        private  static  int  textSize=RabitToast.textSize;
       private static boolean tintIcon=RabitToast.tintIcon;
       private boolean allowQueue=true;
       private int xOffset=RabitToast.xOffset;
       private int yOffset=RabitToast.yOffset;
       private  boolean supportDarkTheme=true;
       private boolean isRTL=false;
       private  static  int toastGravity=RabitToast.toastGravity;

      public Config() {
      }
      @CheckResult
      public  static Config getInstance()
      {
          return new Config();
      }
      public static void reset()
      {
          RabitToast.currentTypeface=LOADED_TOAST_TYPEFACE;
          RabitToast.textSize=16;
          RabitToast.tintIcon=true;
          RabitToast.allowqueue=true;
          RabitToast.toastGravity=-1;
          RabitToast.xOffset=-1;
          RabitToast.yOffset=-1;
          RabitToast.supportDarkTheme=true;
          RabitToast.isRTL=false;

      }
      @CheckResult
      public Config setToasttypeface(@NonNull Typeface typeface)
      {
          this.typeface=typeface;
          return this;
      }
      @CheckResult
      public Config setTextSize(int sizeInSp)
      {
          this.textSize=sizeInSp;
          return this;
      }
      @CheckResult
      public  Config tintIcon(boolean tintIcon)
      {
          this.tintIcon=tintIcon;
          return this;
      }
      @CheckResult
      public  Config allowQueue(boolean allowQueue)
      {
          this.allowQueue=allowQueue;
          return this;
      }
      @CheckResult
      public  Config setGravity(int gravity,int xOffset,int yOffset)
      {

this.toastGravity=gravity;
this.xOffset=xOffset;
this.yOffset=yOffset;
return this;
      }
      @CheckResult
      public  Config setGravity(int gravity)
      {
          this.toastGravity=gravity;
          return this;
      }
      @CheckResult
public  Config supportdarkTheme(boolean supportDarkTheme)
      {
          this.supportDarkTheme=supportDarkTheme;
          return this;
      }
      public  Config setRTL(boolean isRTL)
      {
          this.isRTL=isRTL;
          return this;
      }
      public  void appply()
      {
          RabitToast.currentTypeface=typeface;
          RabitToast.textSize=textSize;
          RabitToast.tintIcon=tintIcon;
          RabitToast.allowqueue=allowQueue;
          RabitToast.toastGravity=toastGravity;
          RabitToast.toastGravity=toastGravity;
          RabitToast.xOffset=xOffset;
          RabitToast.yOffset=yOffset;
          RabitToast.supportDarkTheme=supportDarkTheme;
          RabitToast.isRTL=isRTL;

      }

  }
}
