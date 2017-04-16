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

        //chickenjoy
        insertFood(db,"1-pc Chickenjoy (Original or Spicy)", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",  R.drawable.one, "Chickenjoy");
        insertFood(db,"2-pc Chickenjoy (Original or Spicy)", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",  R.drawable.two, "Chickenjoy");
        insertFood(db,"Chicken Bucket", "Enjoy 6 or 8 pcs of your favorite crispylicious, juicylicious Chickenjoy! Upgrades are available so you can complete your with rice or spaghetti and regular soft drinks or Nestea!",  R.drawable.bucket, "Chickenjoy");

        //rice meals
        insertFood(db,"Garlic Pepper Beef", "Juicy Beef Strips topped with flavorful pepper sauce and garlic bits",  R.drawable.garlicpepper, "Rice Meal");
        insertFood(db,"Ultimate Burger Steak", "Made from the 100% pure beef goodness of a 1/3 pound CHAMP patty, served on top of tasty fries, and poured with savory mushroom gravy thatâ€™s sprinkled with toasted garlic bits. A sunny-side up egg on steamed rice completes this satisfying meal experience.",  R.drawable.ubs, "Rice Meal");
        insertFood(db,"Garlic Bangus", "Marinated bangus seasoned with special ingredients fried to a light crisp, topped with garlic sauce and toasted garlic bits, served with a slice of tomato and plain rice. ",  R.drawable.bangus, "Rice Meal");
        insertFood(db,"Burger Steak", "100% pure beef patties that come with a hearty serving of our flavorful mushroom gravy and steamed rice.",  R.drawable.bs, "Rice Meal");
        insertFood(db,"Shanghai Rolls", "5 pieces of your favorite crispy-sarap shanghai rolls",  R.drawable.shang, "Rice Meal");

        //sides
        insertFood(db,"Butterd Corn", "Golden yellow corn kernels with butter",  R.drawable.corn, "Sides");
        insertFood(db,"Peach Mango Pie", "Golden brown, flaky, slightly sweet crust with a pleasant blend of diced peaches and mango filling in thick sauce.", R.drawable.peach, "Sides");
        insertFood(db,"Jolly Hotdog", "Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with a slightly tangy, cheese-based topping and livened up with grated cheese and tomato catsup.",  R.drawable.jolly, "Sides");
        insertFood(db,"Jolly Crispy Fries", "Light to golden brown crispy potato strips, made from choice potatoes.",  R.drawable.fried, "Sides");
        insertFood(db,"Macaroni Soup", "A hearty cream of chicken soup with macaroni noodles, carrots, chicken chunks, bits of ham, and corn.",  R.drawable.soup, "Sides");

        //kids meal
        insertFood(db,"Jolly Spaghetti with Softdrink + Toy + free Vanilla Cone Twirl", "Jollibee’s sweet style spaghetti sauce-now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti – the Spaghettiest!",  R.drawable.spagmeal, "Kids Meal");
        insertFood(db,"Yum with Softdrink + Toy + free Vanile Cone Twirl", "Made with 100% pure beef patty served with our very own special burger dressing all in a soft bun",  R.drawable.yummeal, "Kids Meal");
        insertFood(db,"Chickenjoy with Softdrink + Toy + free Vanilla Cone Twirl", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee’s perfectly seasoned fried chicken that’s crispy on the outside; tender and juicy on the inside",  R.drawable.chickenmeal, "Kids Meal");

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
