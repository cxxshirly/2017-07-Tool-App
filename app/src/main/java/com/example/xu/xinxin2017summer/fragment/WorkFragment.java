package com.example.xu.xinxin2017summer.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.xu.xinxin2017summer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class WorkFragment extends Fragment {

    private Button button;

    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

    }

    @Override
    public void startActivity(Intent intent) {
        Intent button = new Intent(getActivity(), WorkFragment.class);

        super.startActivity(intent);
        Toast.makeText(getActivity(),"submit!",Toast.LENGTH_SHORT).show();

    }

//
//
//       public void initialView(){
//            button = (Button)findViewById(R.id.buttonsubmit);
//        }
//
//    private void setListener(){
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                Toast.makeText(WorkFragment.this,"You click submit",Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_work, container, false);
    }


}
