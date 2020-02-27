package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.entiy.EmpBean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bit","onStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bit","onStop...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("bit","onPause...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bit","onResume...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("bit","onRestart...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //System.out.println("메시지 출력...");
        Log.d("bit","출력메시지");
        Button btn01=this.findViewById(R.id.btn01);
        Button exit=findViewById(R.id.exit);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="전달값";
                Log.d("bit","새창을 열겠습니다");
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
//                Intent intent = new Intent();
//                intent.setClass(getApplicationContext(),Main2Activity.class);

                intent.putExtra("msg",msg);

                startActivity(intent);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btn03=findViewById(R.id.btn03);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(getApplicationContext(),Main3Activity.class);

                EmpBean bean=new EmpBean(1111,"tester");
                intent.putExtra("bean",bean);

                startActivity(intent);
            }
        });
        Button btn04=findViewById(R.id.btn04);
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main4Activity.class));
            }
        });
    }
}
