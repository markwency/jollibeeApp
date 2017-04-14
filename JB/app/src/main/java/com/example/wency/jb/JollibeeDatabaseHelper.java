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
        db.execSQL("CREATE TABLE FOOD("
        + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
        + "NAME TEXT, "
        + "DESCRIPTION TEXT, "
        + "IMAGE_RESOURCE_ID INTEGER, "
        + "FOOD_TYPE TEXT);");

        //burgers
        insertFood(db, "Yum with TLC", "Made with 100% pure beef patty served with mayo, a slice of fresh tomato, crisp lettuce and creamy cheese all in a soft sesame seed bun", R.drawable.yumtlc, "Burger");
        insertFood(db,"Cheesy Bacon Mushroom Yum", "Your favorite Yumburger patty topped with bacon, cheese sauce and mushrooms, in a new sesame seed bun", R.drawable.baconyum, "Burger");
        insertFood(db,"Cheesy Bacon Mushroom Champ", "Made with 1/3 pound, 100% pure beef Champ patty, smothered with delicious cheese sauce, bacon strips and mushrooms. Extraordinary langhap-sarap!", R.drawable.baconchamp, "Burger");
        insertFood(db,"Champ", "Made with 100% pure beef, fresh lettuce and tomatoes, creamy cheese, catsup and mayo served in soft sesame seed bun.", R.drawable.champ, "Burger");
        insertFood(db,"Yum", "Made with 100% beef patty served with our own special burger dressing all in a soft bun", R.drawable.yum, "Burger");
        insertFood(db,"Yum with Cheese", "Made with 100% beef patty with cheese served with our own special burger dressing all in a soft bun", R.drawable.yumtlc, "Burger");
        insertFood(db,"Amazing Aloha Champ", "", R.drawable.yumtlc, "Burger");

        //noodles
        insertFood(db,"Jolly Spaghetti", "Jollibee’s sweet style spaghetti sauce-now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti – the Spaghettiest",  R.drawable.spag, "Noodle");
        insertFood(db,"Palabok Fiesta", "Premium bihon noodles served with mouth-watering palabok sauce and toppings of pork chicharon bits, tinapa flakes, sauteed pork, shrimps, and slices of egg", R.drawable.palabok, "Noodle");

        //breakfasts
        insertFood(db,"Corned Beef", "A delicious combination of garlic rice, fried egg, and juicy corned beef.",  R.drawable.cornedbeef, "Breakfast");
        insertFood(db,"Beef Tapa", "A delicious combination of garlic rice, fried egg, and tender beef tapa.",  R.drawable.beeftapa, "Breakfast");
        insertFood(db,"Breakfast Steak", "A delicious combination of garlic rice, fried egg and gravy-poured breakfast steak.",  R.drawable.steak, "Breakfast");
        insertFood(db,"Hotdog", "A delicious combination of garlic rice, fried egg, and meaty hotdog.",  R.drawable.hotdog, "Breakfast");
        insertFood(db,"Longganisa", "A delicious combination of garlic rice, fried egg, and mildly seasoned longganisa.",  R.drawable.longganisa, "Breakfast");
        insertFood(db,"Pancakes", "2-piece moist pancakes served with maple syrup.",  R.drawable.pancakes, "Breakfast");

        //desserts
        insertFood(db,"Creamy Shake Strawberry", "",  R.drawable.creamystrawberry, "Dessert");
        insertFood(db,"Creamy Shake Chocolate", "",  R.drawable.creamychoco, "Dessert");
        insertFood(db,"Kit Kat Mix-ins", "",  R.drawable.kitkatmix, "Dessert");
        insertFood(db,"Strawberry Sundae", "Vanilla softserve topped with strawberry syrup and strawberry bits. ",  R.drawable.strawberrysundae, "Dessert");
        insertFood(db,"Chocolate Sundae", "Creamy vanilla soft serve topped with luxurious chocolate fudge.",  R.drawable.chocosundae, "Dessert");
        insertFood(db,"Coke Float", "Creamy vanilla twirl on ice-cold Coke with choco syrup.",  R.drawable.cokefloat, "Dessert");
        insertFood(db,"Cone Twirl Krunchy Chocolate", "Creamy vanilla soft serve dipped in chocolate-flavored coating sprinkled with rice crispies.",  R.drawable.chocotwirl, "Dessert");
        insertFood(db,"Cone Twirl Vanilla", "Creamy vanilla softserve on a cone.",  R.drawable.vanillatwirl, "Dessert");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public static void insertFood(SQLiteDatabase db, String name, String description, int resourceId, String foodType){
        ContentValues foodValues = new ContentValues();
        foodValues.put("NAME", name);
        foodValues.put("DESCRIPTION", description);
        foodValues.put("IMAGE_RESOURCE_ID", resourceId);
        foodValues.put("FOOD_TYPE", foodType);

        db.insert("FOOD", null, foodValues);
    }
}
