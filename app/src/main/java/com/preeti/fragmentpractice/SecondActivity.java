package com.preeti.fragmentpractice;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String username=bundle.getString("username");
        String password=bundle.getString("password");
        Toast.makeText(SecondActivity.this, username+"\n"+password, Toast.LENGTH_SHORT).show();

        ViewSecondFragment viewSecondFragment=new ViewSecondFragment();
        viewSecondFragment.setArguments(bundle);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container2,viewSecondFragment);
        fragmentTransaction.commit();
    }
}
