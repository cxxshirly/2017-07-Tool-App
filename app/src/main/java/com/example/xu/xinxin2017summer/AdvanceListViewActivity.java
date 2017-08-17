package com.example.xu.xinxin2017summer;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.xu.xinxin2017summer.adapter.AdvanceListViewAdapter;
import com.example.xu.xinxin2017summer.adapter.BaseViewPagerAdapter;
import com.example.xu.xinxin2017summer.fragment.BlueFragment;
import com.example.xu.xinxin2017summer.fragment.GreenFragment;
import com.example.xu.xinxin2017summer.fragment.RedFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends BaseActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> ls = new ArrayList<Fragment>();


    @BindView(R.id.activity_advance_List_View) ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);

        viewPager = (ViewPager)findViewById(R.id.activity_advance_List_viewpager);
        ls.add(new RedFragment());
        ls.add(new GreenFragment());
        ls.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter =
                new BaseViewPagerAdapter(getSupportFragmentManager(),ls);
        viewPager.setAdapter(pagerAdapter);

        ArrayList<String > list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");
        list.add("Good!");

        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this,list);
        lv.setAdapter(adapter);


        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);
//
//        TextView tv1 = new TextView(this);
//        tv1.setText("FooterView");
//        tv1.setTextSize(50);
//        lv.addFooterView(tv1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                showToast(String.valueOf(position));
            }
        });
    }
}
