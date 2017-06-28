package com.example.xu.xinxin2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.xu.xinxin2017summer.ActivityA;
import com.example.xu.xinxin2017summer.AdvanceListViewActivity;
import com.example.xu.xinxin2017summer.AdvanceViewPagerActivity;
import com.example.xu.xinxin2017summer.AnimationActivity;
import com.example.xu.xinxin2017summer.CheckBoxActivity;
import com.example.xu.xinxin2017summer.DialogActivity;
import com.example.xu.xinxin2017summer.HandlerActivity;
import com.example.xu.xinxin2017summer.HandlerActivity2;
import com.example.xu.xinxin2017summer.NinePatchActivity;
import com.example.xu.xinxin2017summer.R;
import com.example.xu.xinxin2017summer.RadioGroupActivity;
import com.example.xu.xinxin2017summer.ResultActivity;
import com.example.xu.xinxin2017summer.RunableHandlerActivity;
import com.example.xu.xinxin2017summer.ScaleTypeActivity;
import com.example.xu.xinxin2017summer.ViewPagerActivity;
import com.example.xu.xinxin2017summer.adapter.ListNormalAdapter;
import com.example.xu.xinxin2017summer.NotificationActivity;
import com.example.xu.xinxin2017summer.audio.BaseBean;


import java.util.ArrayList;


public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;


    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Pacth");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPager");
        contentList.add("LaunchMode");
        contentList.add("ResultActivity");
        contentList.add("RadioGroup");
        contentList.add("CheckBox");
        contentList.add("Dialogs");
        contentList.add("Handler");
        contentList.add("RunnableHandler");
        contentList.add("Animation");
        contentList.add("w");
        contentList.add("w");



    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                            break;

                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                            break;

                    case 2:
                        Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(getActivity(),AdvanceViewPagerActivity.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        //LaunchMode
                        Intent intent6 = new Intent(getActivity(), ActivityA.class);
                        intent6.putExtra("StringInfo","fromDemoFragment");
                        intent6.putExtra("IntegerInfo",10);
                        Bundle bundle = new Bundle();
                        BaseBean bean = new BaseBean();
                        bean.setName("bean");
                        bundle.putString("StringBundle","FromBundleDemo");
                        bundle.putInt("IntegerBundle",101);
                        bundle.putSerializable("Object",bean);
                        intent6.putExtra("Bundle",bundle);
                        startActivity(intent6);
                        break;

                    case 7:
                        //ActivityResult
                        Intent intent7 = new Intent(getActivity(), ResultActivity.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        //RadioGroup
                        Intent intent8 = new Intent(getActivity(), RadioGroupActivity.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        //check box
                        Intent intent9 = new Intent(getActivity(), CheckBoxActivity.class);
                        startActivity(intent9);
                        break;

                    //Dialogs Activity
                    case 10:
                        Intent intent10 = new Intent(getActivity(), DialogActivity.class);
                        startActivity(intent10);
                        break;
                    //handler activity - not working
                    case 11:
                        Intent intent11 = new Intent(getActivity(), HandlerActivity.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        //runnable handler
                        Intent intent12 = new Intent(getActivity(), RunableHandlerActivity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        //animation
                        Intent intent13 = new Intent(getActivity(), AnimationActivity.class);
                        startActivity(intent13);
                        default:
                }
            }
        });
        return view;
    }

}
