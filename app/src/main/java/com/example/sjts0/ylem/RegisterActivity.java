package com.example.sjts0.ylem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText IdText = (EditText) findViewById(R.id.IdText);
        EditText PasswordText = (EditText) findViewById(R.id.PasswordText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText schoolText = (EditText) findViewById(R.id.schoolText);

        Button registerButton = (Button) findViewById(R.id.resisterButton);
    }

    Spinner spinner1 = (Spinner)findViewById(R.id.acaText);

    ArrayList<String> spinnerlist= new ArrayList<String>();

    spinnerlist.add("금P2이강");
    spinnerlist.add("토A9새움");
    spinnerlist.add("토P2예섬");
    spinnerlist.add("토P7세정");
    spinnerlist.add("일A9이강");
    spinnerlist.add("일P2세정");
    spinnerlist.add("일P7이강");

}
}
