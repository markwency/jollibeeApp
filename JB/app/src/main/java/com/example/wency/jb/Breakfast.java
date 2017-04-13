package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class Breakfast {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Breakfast[] breakfasts = {
            new Breakfast("Corned Beef", "A delicious combination of garlic rice, fried egg, and juicy corned beef.",  R.drawable.cornedbeef),
            new Breakfast("Beef Tapa", "A delicious combination of garlic rice, fried egg, and tender beef tapa.",  R.drawable.beeftapa),
            new Breakfast("Breakfast Steak", "A delicious combination of garlic rice, fried egg and gravy-poured breakfast steak.",  R.drawable.steak),
            new Breakfast("Hotdog", "A delicious combination of garlic rice, fried egg, and meaty hotdog.",  R.drawable.hotdog),
            new Breakfast("Longganisa", "A delicious combination of garlic rice, fried egg, and mildly seasoned longganisa.",  R.drawable.longganisa),
            new Breakfast("Pancakes", "2-piece moist pancakes served with maple syrup.",  R.drawable.pancakes)
    };

    private Breakfast(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){ return name; }

    public String getDescription(){
        return description;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
