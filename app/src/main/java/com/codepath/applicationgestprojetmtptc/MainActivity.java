package com.codepath.applicationgestprojetmtptc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private EditText Info;
    private Button Login;
    private int counter =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Info1 = (TextView)findViewById(R.id.tvInfo1);
        Login = (Button)findViewById(R.id.btnLogin);

        Info.setText("No of attemps remaining:5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
    }
    private validate (String userUsername, String userPassword){
        if ((userUsername ==admin) && (userPassword == "1234")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            StartActivity(Intent);
        }else {
            counter --;
            Info.setText("No of attemps remaining:" + String.valueOf(counter));

            if (counter ==0);
            Login.setEnabled(false);

        }
    }
}
