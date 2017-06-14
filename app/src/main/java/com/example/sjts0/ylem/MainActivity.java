package com.example.sjts0.ylem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText IdText = (EditText) findViewById(R.id.IdText);
        EditText PasswordText = (EditText) findViewById(R.id.PasswordText);
        TextView Welcomemessage =(TextView) findViewById(R.id.Welcomemessage);
        //메인액티비티에서 웰컴메세지, 아이디텍스트, 비번텍스트가 변수로 할당될수있도록 함


    }
}
