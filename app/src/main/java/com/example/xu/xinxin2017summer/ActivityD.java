package com.example.xu.xinxin2017summer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class ActivityD extends BaseActivity {

    @OnClick(R.id.buttonDa)
    public void clickA(View v){
        goToActivity(ActivityA.class);
    }
    @OnClick(R.id.buttonDb)
    public void clickB(View v){
        goToActivity(ActivityB.class);
    }
    @OnClick(R.id.buttonDc)
    public void clickC(View v){
        goToActivity(ActivityC.class);
    }
    @OnClick(R.id.buttonDd)
    public void clickD(View v){
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }
}