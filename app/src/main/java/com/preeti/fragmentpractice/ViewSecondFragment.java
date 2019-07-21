package com.preeti.fragmentpractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewSecondFragment extends Fragment {
TextView tv_username,tv_password;
ListView lv;
ArrayList<String> arrayList;
ArrayAdapter<String> arrayAdapter;

    public ViewSecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_view_second, container, false);
        tv_username=(TextView)v.findViewById(R.id.tv_username);
        tv_password=(TextView)v.findViewById(R.id.tv_password);
        lv=(ListView)v.findViewById(R.id.lv);
        arrayList=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);

        Bundle bundle=getArguments();
        String uname=bundle.getString("username");
        String pwd=bundle.getString("password");

        arrayList.add(uname+"\n"+pwd);

        arrayAdapter.notifyDataSetChanged();

        tv_username.setText(uname);
        tv_password.setText(pwd);

       /* tv_username.setText(bundle.getString("username"));
        tv_password.setText(bundle.getString("password"));*/


        return v;
    }

}
