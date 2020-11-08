package com.project.stardictionary;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class content_writer2 extends AppCompatActivity implements View.OnClickListener{
    private ListDatabase listDatabase;
    private EditText idText,NameText,profileText,subscriptText;
    private Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_writer2);
        showData("Member","Signed in Successfully");
        listDatabase=new ListDatabase(this);
        SQLiteDatabase sqLiteDatabase= listDatabase.getWritableDatabase();

        idText=(EditText) findViewById(R.id.Idtext);
        NameText=(EditText) findViewById(R.id.Nametext);
        profileText=(EditText) findViewById(R.id.Profiletext);
        subscriptText=(EditText) findViewById(R.id.subcripttext);
        btn1=(Button) findViewById(R.id.saveId);
        btn2=(Button) findViewById(R.id.showId);
        btn3=(Button) findViewById(R.id.updateId);
        btn4=(Button) findViewById(R.id.deleteId);
        btn5=(Button) findViewById(R.id.backId);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String id=idText.getText().toString();
        String name=NameText.getText().toString();
        String profile=profileText.getText().toString();
        String subscript=subscriptText.getText().toString();
        if(v.getId()==R.id.saveId)
        {
            if(id.equals("") && name.equals("") && profile.equals("") && subscript.equals(""))
            {
                Toast.makeText(getApplicationContext(),"Please Enter all the data",Toast.LENGTH_LONG).show();
            }
            else
            {
                long rowId= listDatabase.saveData(id,name,profile,subscript);
                if(rowId>-1)
                {
                    Toast.makeText(getApplicationContext(),"Data is Inserted",Toast.LENGTH_LONG).show();
                    idText.setText("");
                    NameText.setText("");
                    profileText.setText("");
                    subscriptText.setText("");

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Data not Inserted",Toast.LENGTH_LONG).show();
                }
            }

        }
        else if(v.getId()==R.id.showId)
        {
            Intent in=new Intent(content_writer2.this,ListDataActivity.class);
            startActivity(in);
        }
        else if(v.getId()==R.id.updateId)
        {
            Boolean isUpdated=  listDatabase.updateData(id,name,profile,subscript);
            if(isUpdated==true)
            {
                Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Unsuccessful",Toast.LENGTH_LONG).show();
            }

        }
        else if(v.getId()==R.id.deleteId)
        {
            int value= listDatabase.deleteData(id);
            if(value>0)
            {
                Toast.makeText(getApplicationContext(),"Deleted",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Not Deleted",Toast.LENGTH_LONG).show();
            }

        }
        else if(v.getId()==R.id.backId)
        {
            Intent intent=new Intent(content_writer2.this,visitPage.class);
            startActivity(intent);
        }

    }
    public void showData(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();
    }
}
