package com.project.stardictionary;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class content_writer extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper dataBaseHelper;
    EditText editText1,editText2;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_writer);

        dataBaseHelper=new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase=dataBaseHelper.getWritableDatabase();
        editText1=(EditText) findViewById(R.id.userText);
        editText2=(EditText) findViewById(R.id.passText);
        btn1=(Button) findViewById(R.id.btn1id);
        btn2=(Button) findViewById(R.id.btn2id);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String username= editText1.getText().toString();
        String password=editText2.getText().toString();
        if(v.getId()==R.id.btn1id)
        {
            Boolean result = dataBaseHelper.findPassword(username,password);
            if(result==true)
            {
                Intent intent=new Intent(content_writer.this,content_writer2.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"UserName and Password didn't match",Toast.LENGTH_LONG).show();
            }
        }
        else if(v.getId()==R.id.btn2id)
        {
            Intent in=new Intent(content_writer.this,signUpActivity.class);
            startActivity(in);
        }

    }
}
