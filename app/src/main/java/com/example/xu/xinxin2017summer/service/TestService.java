package com.example.xu.xinxin2017summer.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.xu.xinxin2017summer.util.UtilLog;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 7/3/17.
 */

public class TestService extends Service {
//
//    public static final int LOADING = 111;
//    public static final int PLAYING = 222;
//    public static final int PAUSED = 333;
//
//    private MediaPlayer mediaPlayer;

    private Timer timer = new Timer();
    private int update = 0;
    public static final String UPDATE = "update";
    public static final String ACTION = "TestAction";
//    public static final String AUDIO = "TestAction";



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        try {
//            Thread.sleep(30000);//incorrect
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//        if(intent.getAction().equals("AUDIO")){
//            String url = intent.getStringExtra("URL");
//            try {
//                mediaPlayer.reset();
//                mediaPlayer.setDataSource(url);
//                mediaPlayer.prepareAsync();
//
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//        }else {

            String value = intent.getStringExtra("Service");
            if (value.equals("Start")) {
                timer.schedule(new updateTask(), 0, 2000);
            } else if (value.equals("Stop")) {
                timer.cancel();
        }

//            }
//            timer.schedule(new updateTask(), 0, 2000);
            return super.onStartCommand(intent, flags, startId);
        }
//
//        private void sendLoading(){
//            Intent intent = new Intent();
//            intent.setAction(AUDIO);
//
//        }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private class updateTask extends TimerTask{

        @Override
        public void run() {
            Intent intent = new Intent();
            intent.setAction(ACTION);
            intent.putExtra(UPDATE,++update);
            sendBroadcast(intent);
            UtilLog.d("Service",update+"");

        }
    }
}
