package com.codepath.applicationgestprojetmtptc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDBGestionProjet extends SQLiteOpenHelper {

    private SQLiteDatabase mtptcprojets;
    private static final String DATABASE_NAME = "base_mtptcprojets";
    private static final String DATABASE_TABLE = "projet";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_CREATE= "create table"
       + DATABASE_TABLE + "(_id integer primary key autoincrement,"
            + "title text not null, description text not null);";


        public MyDBGestionProjet(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w("Content provider database",
                    "Upgrading database from version " + oldVersion + " to "
                            + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS titles");
            onCreate(db);

        }

        @Override
        public boolean onCreate() {
        Context context = getContext()
        MyDBGestionProjet dbHelper = new MyDBGestionProjet(context);
        mtptcprojets = dbHelper.getWritableDatabase();
        return (mtptcprojets == null) ? false : true;
    }

    }










