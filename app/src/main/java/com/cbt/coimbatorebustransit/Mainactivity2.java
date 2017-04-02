package com.cbt.coimbatorebustransit;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cbt.coimbatorebustransit.data.BusContract;
import com.cbt.coimbatorebustransit.data.BusDbHelper;

public class Mainactivity2 extends AppCompatActivity {

    private BusDbHelper mDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
        init1();
    }
    private void insertbus()
    {
        SQLiteDatabase sqLiteDatabase= mDbHelper.getWritableDatabase();
        EditText editText=(EditText)findViewById(R.id.editText);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        String bus=editText.getText().toString();
        String bus=editText2.getText().toString();

        ContentValues values=new ContentValues();
        values.put(BusContract.busentry.)



    }
}
