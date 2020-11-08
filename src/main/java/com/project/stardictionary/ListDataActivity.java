package com.project.stardictionary;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListDataActivity extends AppCompatActivity {
    private ListView listView;
    private ListDatabase listDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);
        listView=(ListView) findViewById(R.id.list_item);
        listDatabase=new ListDatabase(this);
        loadData();

    }
    public void loadData()
    {
        ArrayList<String> listData=new ArrayList<>();
        Cursor cursor=listDatabase.showData();
        if(cursor.getCount()==0)
        {
            Toast.makeText(getApplicationContext(),"No Data Found",Toast.LENGTH_LONG).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                listData.add(cursor.getString(0)+"  \t  "+cursor.getString(1)+"   \t  "+cursor.getString(2)+"  \t  "+cursor.getString(3));
            }
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listitem,R.id.textViewId,listData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedValue=adapterView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Selected Value: "+selectedValue,Toast.LENGTH_LONG).show();
            }
        });
    }
}
