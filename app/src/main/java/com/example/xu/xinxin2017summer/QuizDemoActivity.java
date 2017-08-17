package com.example.xu.xinxin2017summer;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.xu.xinxin2017summer.dialog.CustomDialog;
import com.example.xu.xinxin2017summer.dialog.QuizDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizDemoActivity extends BaseActivity {




    @OnClick(R.id.quizdemo_bt)
    public void ok (View v){
        quizDialog();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_demo);
        ButterKnife.bind(this);

    }

    private void quizDialog(){
        String message = "";
        final QuizDialog quizDialog = new QuizDialog(this, new QuizDialog.IquizDialogListener(){
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

            }
        });
        quizDialog.setCanceledOnTouchOutside(true);
        quizDialog.show();

    }

}
