package com.example.quizapp.Fragments;

import static com.example.quizapp.Utils.Constant.setUserLoginStatus;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizapp.MainActivity;
import com.example.quizapp.Model.User;
import com.example.quizapp.R;
import com.example.quizapp.Screens.AccountActivity;
import com.example.quizapp.SqlDataBase.MyDatabase;


public class LoginFragment extends Fragment {
    private EditText etLoginEmail, et_login_password;
    Button btn_login;
    TextView tv_new_register;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        etLoginEmail=view.findViewById(R.id.etLoginEmail);
        et_login_password=view.findViewById(R.id.et_login_password);
        btn_login=view.findViewById(R.id.btn_login);
        tv_new_register=view.findViewById(R.id.tv_new_register);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etLoginEmail.getText().toString();
                String password = et_login_password.getText().toString();
                // call the validate function and then request
                if (validate(email, password)) requestLogin(email, password);
            }
        });
        tv_new_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AccountActivity)getActivity()).showSignUpScreen();
            }
        });
        return view;
    }
    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    private boolean validate(String email, String password) {
        if (email.isEmpty()) etLoginEmail.setError("Enter email!");
        else if (!email.contains("@")||!email.contains(".")) etLoginEmail.setError("Enter valid email!");
        else if (password.isEmpty()) et_login_password.setError("Enter password!");
        else if (password.length()<6) et_login_password.setError("Password must be at least 6 characters!");
        else return true;
        return false;
    }
    private void requestLogin(String email, String password) {

        User user =new MyDatabase(getContext()).getUserData(email,password);
        if(user!=null) {
            setUserLoginStatus(getContext(), true);
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().finish();
        }else {
            Toast.makeText(getContext(), "wrong mail or password", Toast.LENGTH_LONG).show();

        }
    }
}