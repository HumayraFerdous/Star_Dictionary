package com.project.stardictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edit1,edit2,edit3,edit4;
    userDetails userdt;
    Button btnId;
    DatabaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edit1=(EditText) findViewById(R.id.nameId);
        edit2=(EditText) findViewById(R.id.EmailId);
        edit3=(EditText) findViewById(R.id.UserId);
        edit4=(EditText) findViewById(R.id.passId);
        btnId=(Button) findViewById(R.id.btn3id);
        userdt=new userDetails();
        dataBaseHelper=new DatabaseHelper(this);
        btnId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name=edit1.getText().toString();
        String email=edit2.getText().toString();
        String user=edit3.getText().toString();
        String pass=edit4.getText().toString();
        userdt.setName(name);
        userdt.setEmail(email);
        userdt.setUsername(user);
        userdt.setPassword(pass);

        long rowId= dataBaseHelper.insertData(userdt);
        if(rowId==-1)
        {
            Toast.makeText(getApplicationContext(),"Unsuccessful",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Row "+rowId+" is successfully inserted",Toast.LENGTH_LONG).show();
            Intent in= new Intent(signUpActivity.this,content_writer2.class);
            startActivity(in);
        }

    }
}
