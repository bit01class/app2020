package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity
        extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String msg=intent.getStringExtra("msg");
//        intent.getIntExtra();
//        intent.getDoubleExtra();
//        intent.getBooleanExtra(,false);
        TextView textView =findViewById(R.id.tv02);
        textView.setText(textView.getText().toString()+":"+msg);
        Button btn02=(Button) findViewById(R.id.btn02);
        btn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
