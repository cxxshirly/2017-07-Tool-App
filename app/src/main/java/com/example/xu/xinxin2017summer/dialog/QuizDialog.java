package com.example.xu.xinxin2017summer.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

import com.example.xu.xinxin2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xu on 6/21/17.
 */

public class QuizDialog extends Dialog {

    private final IquizDialogListener listener;
    private String msg ="";
    private boolean exit = false;
    private boolean click =false;

    public interface IquizDialogListener{
        public void onOKClicked(String msg);
        public void onNoClicked(String msg);
        public void onYesClicked(String msg);

        public void onExitClicked(String msg);
        //   public void onCancelClicked();

    }

    @OnClick(R.id.quiz_ok)
    public void ok(View view){
        if(exit){
            System.exit(0);
        }
        if(click) {
            listener.onOKClicked(msg);
            cancel();
        }
    }

    @OnClick(R.id.quiz_no)
    public void no(View view){
        msg = "You clicked No";
        click = true;
        exit = false;


    }

    @OnClick(R.id.quiz_yes)
    public void yes(View view){
        msg = "You clicked Yes";
        click = true;
        exit = false;


    }
    @OnClick(R.id.quiz_exit)
    public void exit(View view){
        exit = true;
    }

    @OnClick(R.id.quiz_cancel)
    public void cancel(View view){
        cancel();
    }

    public QuizDialog(@NonNull Context context, IquizDialogListener listener) {
        super(context,R.style.dialog);
        setContentView(R.layout.activity_quiz_dialog);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}
