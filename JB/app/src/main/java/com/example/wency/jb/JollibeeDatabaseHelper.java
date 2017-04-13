package com.example.wency.jb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wency on 4/10/2017.
 */

public class JollibeeDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "jollibee";
    private static final int DB_VERSION = 1;

    JollibeeDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE BURGER("
        + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
        + "NAME TEXT, "
        + "DESCRIPTION TEXT, "
        + "IMAGE_RESOURCE_ID INTEGER);");

        insertBurger(db, "Yum", "Regular Yum", R.drawable.yum);
        insertBurger(db, "Yum with Cheese", "Yum plus cheese", R.drawable.yum);
        insertBurger(db, "Yum with TLC", "Yum + TLC", R.drawable.yum);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public static void insertBurger(SQLiteDatabase db, String name, String description, int resourceId){
        ContentValues burgerValues = new ContentValues();
        burgerValues.put("NAME", name);
        burgerValues.put("DESCRIPTION", description);
        burgerValues.put("IMAGE_RESOURCE_ID", resourceId);

        db.insert("BURGER", null, burgerValues);
    }
}
