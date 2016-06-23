package com.example.jiashuaowei.medicaled;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.rey.material.widget.Button;
import com.rey.material.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.refactor.library.SmoothCheckBox;
import de.hdodenhof.circleimageview.CircleImageView;


/**
 * Created by chen on 2016/6/21.
 */

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.bt_login)Button loginButton;
    @BindView(R.id.text_password)MaterialEditText passwordEditText;
    @BindView(R.id.text_username)MaterialEditText userEditText;

    @BindView(R.id.checkbox_doctor)SmoothCheckBox doctorCheckBox;
    @BindView(R.id.checkbox_patient)SmoothCheckBox patientCheckBox;

    @BindView(R.id.image_user)CircleImageView userImage;

    @BindView(R.id.tv_forget_password)TextView forgetPasswordText;
    @BindView(R.id.tv_register)TextView registerText;

    @OnClick(R.id.tv_register) void register(){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);


    }


    }

