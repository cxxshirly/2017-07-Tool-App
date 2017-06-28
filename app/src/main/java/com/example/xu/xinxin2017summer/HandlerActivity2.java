package com.example.xu.xinxin2017summer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HandlerActivity2 extends BaseActivity {

    private int time;

    @BindView(R.id.activity_handler_et)
    EditText editText;

    @BindView(R.id.activity_handler_bt)
    Button button;

    Handler mHandler = new Handler();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            time--;
            if(time>=0){
                editText.setText(String.valueOf(time));
//                public final boolean postDelayed(Runnable r,long delayMillis)
                mHandler.postDelayed(runnable,1000);
//                mHandler.post(this);
            }
        }
    };

    final View.OnClickListener start = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setEnabled(false);
                time = Integer.valueOf(editText.getText().toString());
                button.setText("Stop");
                button.setOnClickListener(stop);
                mHandler.postDelayed(runnable,1000);

            }
    };

    final View.OnClickListener stop = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            button.setText("Reset");
            button.setOnClickListener(reset);
            mHandler.removeCallbacks(runnable);

        }
    };

    final View.OnClickListener reset = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            editText.setEnabled(true);
            button.setText("start");
            button.setOnClickListener(start);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        ButterKnife.bind(this);
        button.setOnClickListener(start);

    }

}

