package com.example.xu.xinxin2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xu.xinxin2017summer.controller.TestAudioController;

import junit.framework.Test;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestAudioActivity extends AppCompatActivity {

    @BindView(R.id.activity_test_audio_play)
    Button playBt;
//    private TestAudioController controller;
//
//    //http://other.web.rh01.sycdn.kuwo.cn/resource/n3/77/1/1061700123.mp3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_audio);
        ButterKnife.bind(this);
//        controller = new TestAudioController(this);
        playBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(TestAudioController.STAUTS == 0){
//
//
//                }
            }
        });
    }
}
