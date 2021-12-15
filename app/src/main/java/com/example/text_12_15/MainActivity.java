package com.example.text_12_15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取按钮
        btn2 = findViewById(R.id.btn_2);
        //ctrl+alt+f键  抽取全区变量
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"第二个按钮",Toast.LENGTH_SHORT).show() ;
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(this);

    }
    public void button1(View view){
        Toast.makeText(getApplicationContext(),"您点击了按钮1",Toast.LENGTH_SHORT).show() ;
        //按住ctrl+鼠标点击，查看函数位置
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"123456",Toast.LENGTH_SHORT).show() ;
    }
}
