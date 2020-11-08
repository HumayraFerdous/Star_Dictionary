package com.project.stardictionary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class ListDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="ListView.db";
    private static final String TABLE_NAME="List_details";
    private static final String ID="Id";
    private static final String NAME="Name";
    private static final String PROFILE="Profile";
    private static final String SUBSCRIPT="Subscript";
    private static final int VERSION_NUMBER=1;
    private Context context;
    private static final String CREATE_TABLE=" CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY , "+NAME+" VARCHAR(30), "+PROFILE+" VARCHAR(30), "+SUBSCRIPT+" INTEGER ); ";
    private static final String DROP_TABLE=" DROP TABLE IF EXISTS "+TABLE_NAME;
    public ListDatabase(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try
        {
            db.execSQL(CREATE_TABLE);
            Toast.makeText(context,"Oncreate is created",Toast.LENGTH_LONG).show();
        }
        catch(Exception e)
        {
            Toast.makeText(context,"Exception: "+e,Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try
        {
            Toast.makeText(context,"OnUpgrade is created",Toast.LENGTH_LONG).show();
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }
        catch(Exception e)
        {
            Toast.makeText(context,"Exception: "+e,Toast.LENGTH_LONG).show();
        }

    }
    public long saveData(String id,String name,String profile,String subscript)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        contentValues.put(PROFILE,profile);
        contentValues.put(SUBSCRIPT,subscript);
        long rowId= sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return rowId;
    }
    public Cursor showData()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(" SELECT * FROM "+TABLE_NAME,null);
        return cursor;
    }
    public boolean updateData(String id,String name,String profile,String subscript)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        contentValues.put(PROFILE,profile);
        contentValues.put(SUBSCRIPT,subscript);
        sqLiteDatabase.update(TABLE_NAME,contentValues,ID+" = ?",new String[]{id});
        return true;
    }
    public int deleteData(String id)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        int value= sqLiteDatabase.delete(TABLE_NAME,ID+" = ?",new String[]{id});
        return value;
    }
}
