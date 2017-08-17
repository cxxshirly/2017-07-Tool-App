package com.example.xu.xinxin2017summer;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.xu.xinxin2017summer.dialog.CustomDialog;
import com.example.xu.xinxin2017summer.dialog.QuizDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_dialog);
        ButterKnife.bind(this);
        quizDialog();
    }


    private void quizDialog() {
        //                shortToast("You choice the last one");
        QuizDialog quizDialog = new QuizDialog(this, new QuizDialog.IquizDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }

            @Override
            public void onNoClicked(String msg) {

            }

            @Override
            public void onYesClicked(String msg) {

            }
            @Override
            public void onExitClicked(String msg) {
                System.exit(1);
            }
        });
        quizDialog.setCanceledOnTouchOutside(true);
        quizDialog.show();
    }


}
