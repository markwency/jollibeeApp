package com.example.wency.jb;

import android.app.IntentService;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.List;

public class BurgerCategoryActivity extends ListActivity {

    private SQLiteDatabase db;
    private Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String food = intent.getStringExtra("message");
        ListView lister = getListView();

        super.onCreate(savedInstanceState);

        if(food.equals("burger")){
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                db = jollibeeDatabaseHelper.getReadableDatabase();

                cursor = db.query("FOOD",
                        new String[] {"_id", "NAME", "FOOD_TYPE"},
                        "FOOD_TYPE = ?",
                        new String[] {"Burger"},
                        null, null, null);

                CursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
                        cursor,
                        new String[] {"NAME"},
                        new int[] {android.R.id.text1},
                        0);
                lister.setAdapter(listAdapter);
            }catch (SQLiteException e){}
        }

        if(food.equals("noodle")){
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                db = jollibeeDatabaseHelper.getReadableDatabase();

                cursor = db.query("FOOD",
                        new String[] {"_id", "NAME", "FOOD_TYPE"},
                        "FOOD_TYPE = ?",
                        new String[] {"Noodle"},
                        null, null, null);

                CursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
                        cursor,
                        new String[] {"NAME"},
                        new int[] {android.R.id.text1},
                        0);
                lister.setAdapter(listAdapter);
            }catch (SQLiteException e){}
        }

        if(food.equals("breakfast")){
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                db = jollibeeDatabaseHelper.getReadableDatabase();

                cursor = db.query("FOOD",
                        new String[] {"_id", "NAME", "FOOD_TYPE"},
                        "FOOD_TYPE = ?",
                        new String[] {"Breakfast"},
                        null, null, null);

                CursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
                        cursor,
                        new String[] {"NAME"},
                        new int[] {android.R.id.text1},
                        0);
                lister.setAdapter(listAdapter);
            }catch (SQLiteException e){}
        }

        if(food.equals("dessert")){
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                db = jollibeeDatabaseHelper.getReadableDatabase();

                cursor = db.query("FOOD",
                        new String[] {"_id", "NAME", "FOOD_TYPE"},
                        "FOOD_TYPE = ?",
                        new String[] {"Dessert"},
                        null, null, null);

                CursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
                        cursor,
                        new String[] {"NAME"},
                        new int[] {android.R.id.text1},
                        0);
                lister.setAdapter(listAdapter);
            }catch (SQLiteException e){}
        }
    }

    @Override
    public  void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }
//
//
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent checker = getIntent();
        String food = checker.getStringExtra("message");

        if(food.equals("burger")){
            Intent intent = new Intent(BurgerCategoryActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_BURGERNO, (int) id);
            intent.putExtra("message", "burger");
            startActivity(intent);
        }

        if(food.equals("noodle")){
            Intent intent = new Intent(BurgerCategoryActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_NOODLENO, (int) id);
            intent.putExtra("message", "noodle");
            startActivity(intent);
        }

        if(food.equals("breakfast")){
            Intent intent = new Intent(BurgerCategoryActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_BFNO, (int) id);
            intent.putExtra("message", "breakfast");
            startActivity(intent);
        }

        if(food.equals("dessert")){
            Intent intent = new Intent(BurgerCategoryActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_DESSERTNO, (int) id);
            intent.putExtra("message", "dessert");
            startActivity(intent);
        }
    }

}
