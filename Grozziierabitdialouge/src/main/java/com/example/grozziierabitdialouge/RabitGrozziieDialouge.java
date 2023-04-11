package com.example.grozziierabitdialouge;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class RabitGrozziieDialouge extends Dialog {
    private static final String WHITE ="#FFFFFF" ;
    private static final String PURPLE ="#8A56AC" ;
    private static final String LIGHT_PURPLE ="#D47FA6" ;
    private static final String GREY_PURPLE ="#998FA2" ;
    private static final String DARK_PURPLE ="#241332" ;
    private Context context;

    private TextView title;

    private TextView subtitle;

    private TextView first_button;

    private TextView second_button;

    private TextView third_button;

    private EditText first_edit_text;

    private EditText second_edit_text;

    private EditText large_edit_text;

    private ImageView icon;

    private LinearLayout main_frame;

    public RabitGrozziieDialouge(@NonNull Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        title=findViewById(R.id.title);
        subtitle=findViewById(R.id.subtitle);
        first_button=findViewById(R.id.first_button);
        second_button=findViewById(R.id.second_button);
        third_button=findViewById(R.id.third_button);
        first_edit_text=findViewById(R.id.first_edit_text);
        second_edit_text=findViewById(R.id.second_edit_text);
        large_edit_text=findViewById(R.id.large_edit_text);
        icon=findViewById(R.id.icon);
        main_frame=findViewById(R.id.main_frame);
        this.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        initDefaultCase();
        this.setCancelable(false);



    }

    private void initDefaultCase() {
        setLargeTextFieldBorderColor(Color.parseColor(WHITE));
        setFirstTextFieldBorderColor(Color.parseColor(WHITE));
        setSecondTextFieldBorderColor(Color.parseColor(WHITE));
        setTitleColor(Color.parseColor(WHITE));
        setSubtitleColor(Color.parseColor(WHITE));
        setFirstButtonColor(Color.parseColor(PURPLE));
        setSecondButtonColor(Color.parseColor(LIGHT_PURPLE));
        setThirdButtonColor(Color.parseColor(GREY_PURPLE));
        setBackgroundColor(Color.parseColor(DARK_PURPLE));
        first_edit_text.setVisibility(View.GONE);
        second_edit_text.setVisibility(View.GONE);
        large_edit_text.setVisibility(View.GONE);
        third_button.setVisibility(View.GONE);
        first_button.setVisibility(View.GONE);
        second_button.setVisibility(View.GONE);
        title.setVisibility(View.GONE);
        subtitle.setVisibility(View.GONE);

    }

    public RabitGrozziieDialouge isCancelable(boolean cancelable){
        this.setCancelable(cancelable);
        return this;
    }

    public RabitGrozziieDialouge setIcon(int image){
        icon.setVisibility(View.VISIBLE);
        icon.setImageResource(image);
        return this;
    }

    public RabitGrozziieDialouge setTitle(String titleText) {
        title.setVisibility(View.VISIBLE);
        title.setText(titleText);
        return this;
    }
    public RabitGrozziieDialouge setTitleColor(int color) {
        title.setVisibility(View.VISIBLE);
        title.setTextColor(color);
        return this;
    }


    public RabitGrozziieDialouge setSubtitle(String subtitleText) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subtitleText);
        return this;
    }

    public RabitGrozziieDialouge setSubtitleColor(int color) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setTextColor(color);
        return this;
    }
    public String getFirstTextField() {
        return first_edit_text.getText().toString();
    }

    public RabitGrozziieDialouge withFirstTextField(boolean hasEditText){
        if (hasEditText) {
            first_edit_text.setVisibility(View.VISIBLE);
        } else {
            first_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getLargeTextField() {
        return large_edit_text.getText().toString();
    }

    public RabitGrozziieDialouge withLargeText(boolean hasEditText){
        if (hasEditText) {
            large_edit_text.setVisibility(View.VISIBLE);
        } else {
            large_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public String getSecondTextField() {
        return second_edit_text.getText().toString();
    }

    public RabitGrozziieDialouge withSecondTextField(boolean hasEditText){
        if (hasEditText) {
            second_edit_text.setVisibility(View.VISIBLE);
        } else {
            second_edit_text.setVisibility(View.GONE);
        }
        return this;
    }

    public RabitGrozziieDialouge setFirstTextField(String firstText) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setText(firstText);
        return this;
    }

    public RabitGrozziieDialouge setSecondTextField(String secondText) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setText(secondText);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextField(String secondText) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setText(secondText);
        return this;
    }

    public RabitGrozziieDialouge setFirstTextFieldHint(String firstText) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setHint(firstText);
        return this;
    }

    public RabitGrozziieDialouge setSecondTextFieldHint(String secondText) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setHint(secondText);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextFieldHint(String secondText) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setHint(secondText);
        return this;
    }


    public RabitGrozziieDialouge setFirstTextFieldTextColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setTextColor(color);
        return this;
    }

    public RabitGrozziieDialouge setSecondTextFieldTextColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setTextColor(color);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextFieldTextColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setTextColor(color);
        return this;
    }
    public RabitGrozziieDialouge setFirstTextFieldBorderColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)first_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public RabitGrozziieDialouge setSecondTextFieldBorderColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)second_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextFieldBorderColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        GradientDrawable drawable = (GradientDrawable)large_edit_text.getBackground();
        drawable.setStroke(5, color);
        return this;
    }

    public RabitGrozziieDialouge setFirstTextFieldHintColor(int color) {
        first_edit_text.setVisibility(View.VISIBLE);
        first_edit_text.setHintTextColor(color);
        return this;
    }

    public RabitGrozziieDialouge setSecondTextFieldHintColor(int color) {
        second_edit_text.setVisibility(View.VISIBLE);
        second_edit_text.setHintTextColor(color);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextFieldHintColor(int color) {
        large_edit_text.setVisibility(View.VISIBLE);
        large_edit_text.setHintTextColor(color);
        return this;
    }


    public RabitGrozziieDialouge setFirstTextFieldInputType(int type, boolean passwordToggle) {
        first_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            first_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            first_edit_text.setInputType(type);
        return this;
    }
    public RabitGrozziieDialouge setSecondTextFieldInputType(int type, boolean passwordToggle) {
        second_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            second_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            second_edit_text.setInputType(type);
        return this;
    }

    public RabitGrozziieDialouge setLargeTextFieldInputType(int type, boolean passwordToggle) {
        large_edit_text.setVisibility(View.VISIBLE);
        if (passwordToggle)
            large_edit_text.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else
            large_edit_text.setInputType(type);
        return this;
    }

    public RabitGrozziieDialouge setFirstButtonColor(int color) {
        first_button.setVisibility(View.VISIBLE);
        Drawable background = first_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }


    public RabitGrozziieDialouge setSecondButtonColor(int color) {
        second_button.setVisibility(View.VISIBLE);
        Drawable background = second_button.getBackground();
        changingBackgroundColor(background, color);
        return this;
    }
    public RabitGrozziieDialouge setThirdButtonColor(int color) {
        third_button.setVisibility(View.VISIBLE);
        Drawable background = third_button.getBackground();
        changingBackgroundColor(background,color);
        return this;
    }

    public RabitGrozziieDialouge setFirstButtonTextColor(int color) {
        first_button.setVisibility(View.VISIBLE);
        first_button.setTextColor(color);
        return this;
    }


    public RabitGrozziieDialouge setSecondButtonTextColor(int color) {
        second_button.setVisibility(View.VISIBLE);
        second_button.setTextColor(color);
        return this;
    }
    public RabitGrozziieDialouge setThirdButtonTextColor(int color) {
        third_button.setVisibility(View.VISIBLE);
        third_button.setTextColor(color);
        return this;
    }

    public RabitGrozziieDialouge setFirstButtonText(String text) {
        first_button.setVisibility(View.VISIBLE);
        first_button.setText(text);
        return this;
    }


    public RabitGrozziieDialouge setSecondButtonText(String text) {
        second_button.setVisibility(View.VISIBLE);
        second_button.setText(text);
        return this;
    }
    public RabitGrozziieDialouge setThirdButtonText(String text) {
        third_button.setVisibility(View.VISIBLE);
        third_button.setText(text);
        return this;
    }

    public RabitGrozziieDialouge setBackgroundColor(int color) {
        Drawable background = main_frame.getBackground();
        changingBackgroundColor(background,color);
        return this;
    }


    public RabitGrozziieDialouge withFirstButtonListner(View.OnClickListener confirmListner){
        first_button.setVisibility(View.VISIBLE);
        first_button.setOnClickListener(confirmListner);
        return this;
    }

    public RabitGrozziieDialouge withSecondButtonListner(View.OnClickListener cancelListner){
        second_button.setVisibility(View.VISIBLE);
        second_button.setOnClickListener(cancelListner);
        return this;
    }

    public RabitGrozziieDialouge withThirdButtonListner(View.OnClickListener cancelListner){
        third_button.setVisibility(View.VISIBLE);
        third_button.setOnClickListener(cancelListner);
        return this;
    }

    private void changingBackgroundColor(Drawable background, int color) {
        if (background instanceof ShapeDrawable) {
            // cast to 'ShapeDrawable'
            ShapeDrawable shapeDrawable = (ShapeDrawable) background;
            shapeDrawable.getPaint().setColor(color);
        } else if (background instanceof GradientDrawable) {
            // cast to 'GradientDrawable'
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(color);
        } else if (background instanceof ColorDrawable) {
            // alpha value may need to be set again after this call
            ColorDrawable colorDrawable = (ColorDrawable) background;
            colorDrawable.setColor(color);
        }
    }

}
