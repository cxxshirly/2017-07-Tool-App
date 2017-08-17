package com.example.xu.xinxin2017summer;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.xu.xinxin2017summer.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz5Activity  extends BaseActivity implements View.OnTouchListener{


    private GestureDetector gestureDetector;
    private int location;
    private int sumX;
    private int sumY;
    private int count = 0;

    private ValueAnimator repeatAnimator;

    public void startAnimator(){
        repeatAnimator = doAnimatorListener();
//        repeatAnimator.setStartDelay(1000);
        repeatAnimator.start();
    }

    public void trans(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv2,"translationX",-550,0);
        animator.setDuration(3000);
        animator.start();

    }

    public void transback(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv2,"translationX",0,-550);
        animator.setDuration(3000);
        animator.start();
    }

    @BindView(R.id.quiz5_tv1)
    TextView tv1;

    @BindView(R.id.quiz5_tv2)
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        ButterKnife.bind(this);

        gestureDetector = new GestureDetector(this,new simpleGestureListener());
        tv1.setOnTouchListener(this);
        tv1.setFocusable(true);
        tv1.setClickable(true);
        tv1.setLongClickable(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onSingleTapUp(e);
        }


        @Override
        public void onLongPress(MotionEvent e) {
            UtilLog.d("Gesture","onLongPress");
            super.onLongPress(e);
        }


        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            UtilLog.d("Gesture","onScroll");
            UtilLog.d("Gesture","distanceX"+distanceX);
            UtilLog.d("Gesture","distanceY"+distanceY);
            sumX += distanceX;
            sumY += distanceY;

            if(sumX < 0 && count == 0){
                if (Math.abs(sumX)>200) {
                    shortToast("You scroll from left to right");
                    tv2.setVisibility(View.VISIBLE);
                    trans();
                    count ++;
                }
                return super.onScroll(e1, e2, distanceX, distanceY);
            }

            if(sumX > 0 && count == 1){
                if (Math.abs(sumX)>200) {
                    shortToast("You scroll from right to left");
                    transback();
                    count = 0;
                }
                return super.onScroll(e1, e2, distanceX, distanceY);

            }
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            UtilLog.d("Gesture","onFling");


            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(MotionEvent e) {
            UtilLog.d("Gesture","onShowPress");
            super.onShowPress(e);
        }

        @Override
        public boolean onDown(MotionEvent e) {
            UtilLog.d("Gesture","onDown");
            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTap");
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTapEvent");
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapConfirmed");
            return super.onSingleTapConfirmed(e);
        }

    }
    private ValueAnimator doAnimatorListener() {
        ValueAnimator animator = ValueAnimator.ofInt(0,400);


        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
            @Override
            public void onAnimationUpdate(ValueAnimator animation){
                int curValue = (int)animation.getAnimatedValue();
                tv2.layout(tv2.getLeft(),curValue,tv2.getRight(),curValue+tv2.getHeight());

            }

        });
        animator.addListener(new Animator.AnimatorListener(){


            @Override
            public void onAnimationStart(Animator animation) {
                shortToast("Started");
                UtilLog.d("Chen","animation start");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                shortToast("Ended");
                UtilLog.d("Chen","animation end");
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                shortToast("Canceled");
                UtilLog.d("Chen","animation cancel");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                shortToast("Repeated");
                UtilLog.d("Chen","animation repeat");
            }
        });

//        animator.setRepeatMode(ValueAnimator.REVERSE);
//        animator.setRepeatCount(1);
//        animator.setInterpolator(new CycleInterpolator(10));
        animator.setDuration(2000);
        return animator;
    }
}
