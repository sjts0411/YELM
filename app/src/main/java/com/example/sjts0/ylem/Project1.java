package com.example.sjts0.ylem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Project1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);


        EditText IdText = (EditText) findViewById(R.id.IdText);
        EditText PasswordText = (EditText) findViewById(R.id.PasswordText);
        Button loginButton = (Button) findViewById(R.id.loginButton);

        TextView registerButton= (TextView) findViewById(R.id.resisterButton);

        registerButton.setOnClickListener(new View.OnClickListener() { //버튼누르면 이벤트처리
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(Project1.this, RegisterActivity.class);
                Project1.this.startActivity(registerIntent);
                //로그인(project1)에서 레지스트 액티비티로 넘어가게해줌

            }
        });)
    }
}
