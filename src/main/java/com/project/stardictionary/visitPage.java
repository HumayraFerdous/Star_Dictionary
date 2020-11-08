package com.project.stardictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class visitPage extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button showButton;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_page);
        Toast.makeText(visitPage.this,"WELCOME to the Journey of KNOWLEDGE",Toast.LENGTH_LONG).show();

        radioGroup=(RadioGroup) findViewById(R.id.radio);
        showButton=(Button) findViewById(R.id.button2);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();
                radioButton=(RadioButton) findViewById(selectedId);
                String s=radioButton.getText().toString();
                if(s.equals("Videos"))
                {
                    Intent no = new Intent(visitPage.this, buttonActivity.class);
                    startActivity(no);
                }
                else if(s.equals("Articles"))
                {
                    Intent in=new Intent(visitPage.this,Videos.class);
                    startActivity(in);
                }
                else if(s.equals("Content Writer"))
                {
                    Intent intent=new Intent(visitPage.this,content_writer.class);
                    startActivity(intent);
                }

            }
        });
    }
}
