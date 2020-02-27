package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.entiy.EmpBean;

public class Main3Activity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView sabun=findViewById(R.id.sabun);
        TextView ename=findViewById(R.id.ename);

        Intent intent=getIntent();
        EmpBean bean= (EmpBean) intent.getSerializableExtra("bean");

        sabun.setText(sabun.getText().toString()+bean.getSabun());
        ename.setText(ename.getText().toString()+bean.getName());
    }
}









