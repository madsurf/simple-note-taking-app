package com.notes.bonto.simple_note_taking_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {
    public static final String TAG = "DBHelper";
    public static final String DB_NAME = "app_notes.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_NOTES = "notes";
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_BODY = "Body";
    public static final String COL_CREATED_AT = "created_at";
    public static final String COL_UPDATE_AT = "update_at";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createNoteTable = " CREATE TABLE " + TABLE_NOTES +"(" +
                COL_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "+
                COL_TITLE+ " TEXT," +
                COL_BODY + " TEXT," +
                COL_CREATED_AT + " TEXT,"+
                COL_UPDATE_AT + " TEXT " +
            ")";
       sqLiteDatabase.execSQL(createNoteTable);
       Log.d(TAG,createNoteTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
