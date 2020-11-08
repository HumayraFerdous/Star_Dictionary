package com.project.stardictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Videos extends AppCompatActivity {

    private ListView listView;
     String[] videonames;
     private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
       textView=(TextView) findViewById(R.id.txt2);
        String temp;
        temp="Articles about Universe\n";
        textView.setText(temp);
        videonames=getResources().getStringArray(R.array.videosnames);
        listView=(ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Videos.this,R.layout.sample_view,R.id.textViewId,videonames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=videonames[position];
                Intent im=new Intent(Videos.this,articlesActivity.class);
                im.putExtra("name",value);
                startActivity(im);
            }
        });


    }
}
