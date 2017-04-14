package com.example.wency.jb;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//
import org.w3c.dom.Text;
//
public class DetailActivity extends AppCompatActivity {
//
    public static final String EXTRA_BURGERNO = "burgerNo";
    public static final String EXTRA_NOODLENO = "noodleNo";
    public static final String EXTRA_BFNO = "bfNo";
    public static final String EXTRA_DESSERTNO = "dessertNo";
    public static final String EXTRA_CHICKENJOYNO = "chickenjoyNo";
    public static final String EXTRA_RICEMEALNO = "ricemealNo";
    public static final String EXTRA_SIDESNO = "sidesNo";
    public static final String EXTRA_KIDSMEALNO = "kidsmealNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String food = intent.getStringExtra("message");

        if(food.equals("burger")){
            int burgerNo = (Integer) getIntent().getExtras().get(EXTRA_BURGERNO) ;
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

                Cursor cursor = db.query("FOOD",
                        new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                        "_id = ? and FOOD_TYPE = ?",
                        new String[] {Integer.toString(burgerNo), "Burger"},
                        null, null, null);

                if(cursor.moveToFirst()){
                    String nameText = cursor.getString(0);
                    String descriptionText = cursor.getString(1);
                    int photoId = cursor.getInt(2);


                    TextView name = (TextView) findViewById(R.id.name);
                    name.setText(nameText);

                    TextView description = (TextView) findViewById(R.id.description);
                    description.setText(descriptionText);

                    ImageView photo = (ImageView) findViewById(R.id.photo);
                    photo.setImageResource(photoId);
                    photo.setContentDescription(nameText);
                }

                Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
                toast.show();

                cursor.close();
                db.close();
            }catch(SQLiteException e){}
        }

        if(food.equals("noodle")){
            int noodleNo = (Integer) getIntent().getExtras().get(EXTRA_NOODLENO) ;
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

                Cursor cursor = db.query("FOOD",
                        new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                        "_id = ? and FOOD_TYPE = ?",
                        new String[] {Integer.toString(noodleNo), "Noodle"},
                        null, null, null);

                if(cursor.moveToFirst()){
                    String nameText = cursor.getString(0);
                    String descriptionText = cursor.getString(1);
                    int photoId = cursor.getInt(2);


                    TextView name = (TextView) findViewById(R.id.name);
                    name.setText(nameText);

                    TextView description = (TextView) findViewById(R.id.description);
                    description.setText(descriptionText);

                    ImageView photo = (ImageView) findViewById(R.id.photo);
                    photo.setImageResource(photoId);
                    photo.setContentDescription(nameText);
                }

                Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
                toast.show();

                cursor.close();
                db.close();
            }catch(SQLiteException e){}
        }

        if(food.equals("breakfast")){
            int breakfastNo = (Integer) getIntent().getExtras().get(EXTRA_BFNO) ;
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

                Cursor cursor = db.query("FOOD",
                        new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                        "_id = ? and FOOD_TYPE = ?",
                        new String[] {Integer.toString(breakfastNo), "Breakfast"},
                        null, null, null);

                if(cursor.moveToFirst()){
                    String nameText = cursor.getString(0);
                    String descriptionText = cursor.getString(1);
                    int photoId = cursor.getInt(2);

                    TextView name = (TextView) findViewById(R.id.name);
                    name.setText(nameText);

                    TextView description = (TextView) findViewById(R.id.description);
                    description.setText(descriptionText);

                    ImageView photo = (ImageView) findViewById(R.id.photo);
                    photo.setImageResource(photoId);
                    photo.setContentDescription(nameText);
                }

                Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
                toast.show();

                cursor.close();
                db.close();
            }catch(SQLiteException e){}
        }

        if(food.equals("dessert")){
            int dessertNo = (Integer) getIntent().getExtras().get(EXTRA_DESSERTNO) ;
            try{
                SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
                SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

                Cursor cursor = db.query("FOOD",
                        new String[] {"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                        "_id = ? and FOOD_TYPE = ?",
                        new String[] {Integer.toString(dessertNo), "Dessert"},
                        null, null, null);

                if(cursor.moveToFirst()){
                    String nameText = cursor.getString(0);
                    String descriptionText = cursor.getString(1);
                    int photoId = cursor.getInt(2);

                    TextView name = (TextView) findViewById(R.id.name);
                    name.setText(nameText);

                    TextView description = (TextView) findViewById(R.id.description);
                    description.setText(descriptionText);

                    ImageView photo = (ImageView) findViewById(R.id.photo);
                    photo.setImageResource(photoId);
                    photo.setContentDescription(nameText);
                }

                Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
                toast.show();

                cursor.close();
                db.close();
            }catch(SQLiteException e){}
        }
    }

}
