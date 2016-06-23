package com.example.jiashuaowei.medicaled;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.rey.material.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chen on 2016/6/23.
 */

public class RegisterActivity extends Activity{

    @BindView(R.id.next_step_button)Button nextButton;
    @OnClick(R.id.next_step_button) void setNextButton(){
        Intent intent=new Intent(this,DetialedRegisterActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }
}
