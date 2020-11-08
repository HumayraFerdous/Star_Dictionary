package com.project.stardictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class startActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button=(Button) findViewById(R.id.firsttButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent in=new Intent(startActivity.this,visitPage.class);
               startActivity(in);

            }
        });
    }
}
