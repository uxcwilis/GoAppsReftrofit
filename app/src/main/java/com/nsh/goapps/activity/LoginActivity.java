package com.nsh.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nsh.goapps.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    TextView register_user;
    EditText username,password;


    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpassword);
        register_user = (TextView) findViewById(R.id.tvregister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("TEST1"))
                {
                    login_sukses();
                } else
                {
                    Toast.makeText(getApplicationContext(),"Salah Password",Toast.LENGTH_SHORT).show();
                }

            }
        });

        register_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_user();
            }
        });

    }

    private void register_user() {
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan usernamenya ke tampilan utama
        i.putExtra("USERNAME",user_login);
        startActivity(i);

    }
}
