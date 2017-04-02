package com.cbt.coimbatorebustransit.data;
import com.cbt.coimbatorebustransit.data.BusContract.*;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lenovo on 4/2/2017.
 */

public class BusDbHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME="Bus.db";
    public static final int DATABASE_VERSION=1;

    public BusDbHelper(Context context)
    {
    super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            final String SQL_CREATE_BUS_TABLE = "CREATE TABLE " + busentry.TABLE_NAME + "(" + busentry._id + "INTEGER PRIMARY KEY AUTOINCREMENT," + busentry.COLUMN_SOURCE + "TEXT NOT NULL," + busentry.COLUMN_DESTINATION + "TEXT NOT NULL," + busentry.COLUMN_BUSNO + "INTEGER NOT NULL" + ");";
            sqLiteDatabase.execSQL(SQL_CREATE_BUS_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase,int i,int i1)
        {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + busentry.TABLE_NAME);
            onCreate(sqLiteDatabase);
    }
}
