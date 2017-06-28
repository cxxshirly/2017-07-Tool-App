package com.example.xu.xinxin2017summer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class ActivityB extends BaseActivity {

    @OnClick(R.id.buttonBa)
    public void clickA(View v){
        goToActivity(ActivityA.class);
    }
    @OnClick(R.id.buttonBb)
    public void clickB(View v){
        goToActivity(ActivityB.class);
    }
    @OnClick(R.id.buttonBc)
    public void clickC(View v){
        goToActivity(ActivityC.class);
    }
    @OnClick(R.id.buttonBd)
    public void clickD(View v){
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this,"onNewIntent",Toast.LENGTH_SHORT).show();
    }
}
