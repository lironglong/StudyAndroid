package com.lironglong.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.bt);
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt.setOnClickListener(this);
        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                Toast.makeText(this,"测试Github用的案例",Toast.LENGTH_SHORT).show();
                 break;
            case R.id.bt1:
                Toast.makeText(this,"测试Github用的分支功能",Toast.LENGTH_SHORT).show();
                break;
            default:
                 break;
        }
    }
}
