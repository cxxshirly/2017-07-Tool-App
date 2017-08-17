package com.example.xu.xinxin2017summer.fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.xu.xinxin2017summer.ActivityA;
import com.example.xu.xinxin2017summer.AdvanceListViewActivity;
import com.example.xu.xinxin2017summer.AdvanceViewPagerActivity;
import com.example.xu.xinxin2017summer.AnimationActivity;
import com.example.xu.xinxin2017summer.AnimatorActivity;
import com.example.xu.xinxin2017summer.CheckBoxActivity;
import com.example.xu.xinxin2017summer.DialogActivity;
import com.example.xu.xinxin2017summer.GestureActivity;
import com.example.xu.xinxin2017summer.HandlerActivity;
import com.example.xu.xinxin2017summer.MainActivity;
import com.example.xu.xinxin2017summer.NinePatchActivity;
import com.example.xu.xinxin2017summer.NotificationActivity;
import com.example.xu.xinxin2017summer.QuizActivity;
import com.example.xu.xinxin2017summer.R;
import com.example.xu.xinxin2017summer.RadioGroupActivity;
import com.example.xu.xinxin2017summer.ResultActivity;
import com.example.xu.xinxin2017summer.RunableHandlerActivity;
import com.example.xu.xinxin2017summer.ScaleTypeActivity;
import com.example.xu.xinxin2017summer.ServiceActivity;
import com.example.xu.xinxin2017summer.SharedPreferenceActivity;
import com.example.xu.xinxin2017summer.ViewPagerActivity;
import com.example.xu.xinxin2017summer.adapter.ListNormalAdapter;
import com.example.xu.xinxin2017summer.audio.BaseBean;
import com.example.xu.xinxin2017summer.dialog.CustomDialog;
import com.example.xu.xinxin2017summer.dialog.QuizDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class WorkFragment extends Fragment {



    public WorkFragment() {

        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_work,
                container, false);

        Button submit = (Button) view.findViewById(R.id.buttonsubmit);


        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getContext(),"You click submit",Toast.LENGTH_SHORT).show();
            }
        });

        Button Quiz3 = (Button) view.findViewById(R.id.buttonRight);
//        Quiz3.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),QuizDialog.class);
//                startActivity(intent);
//
//            }
//        });
        return view;
    }




}