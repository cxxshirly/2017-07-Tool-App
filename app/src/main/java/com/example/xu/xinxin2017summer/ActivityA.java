package com.example.xu.xinxin2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xu.xinxin2017summer.audio.BaseBean;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.buttonAa)
    public void clickA(View v){
        goToActivity(ActivityA.class);
    }
    @OnClick(R.id.buttonAb)
    public void clickB(View v){
        goToActivity(ActivityB.class);
    }
    @OnClick(R.id.buttonAc)
    public void clickC(View v){
        goToActivity(ActivityC.class);
    }
    @OnClick(R.id.buttonAd)
    public void clickD(View v){
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
//        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        String bs = bundle.getString("StringBundle");
        int bi = bundle.getInt("IntegerBundle",0);
        BaseBean bean = (BaseBean) bundle.getSerializable("Object");
        shortToast(bean.getName());
//
//        shortToast(bs);
//        shortToast("Integer is" + bi);
//        String s = intent.getStringExtra("StringInfo");
//        int i = intent.getIntExtra("Integer",0);
//        shortToast(s);
//        shortToast(String.valueOf(i));
//        shortToast(i+"");
//        shortToast("Integer is: " + i);


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
