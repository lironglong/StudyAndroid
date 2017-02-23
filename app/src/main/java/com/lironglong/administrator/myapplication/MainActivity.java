package com.lironglong.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"这是我的一个上传GitHub的测试案例",Toast.LENGTH_LONG).show();
    }
}
