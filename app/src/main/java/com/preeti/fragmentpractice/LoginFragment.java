package com.preeti.fragmentpractice;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

EditText  et_username,et_password;
Button btn_submit;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_login, container, false);
        et_username=(EditText)v.findViewById(R.id.login_email);
        et_password=(EditText)v.findViewById(R.id.login_password);
        btn_submit=(Button)v.findViewById(R.id.login_btn);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),SecondActivity.class);
                intent.putExtra("username",et_username.getText().toString());
                intent.putExtra("password",et_password.getText().toString());
                startActivity(intent);

            }
        });

        return v;
    }

}
