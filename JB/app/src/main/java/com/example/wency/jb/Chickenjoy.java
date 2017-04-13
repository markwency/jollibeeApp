package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class Chickenjoy {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Chickenjoy[] chickenjoys = {
            new Chickenjoy("1-pc Chickenjoy (Original or Spicy)", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",  R.drawable.one),
            new Chickenjoy("2-pc Chickenjoy (Original or Spicy)", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",  R.drawable.two),
            new Chickenjoy("Chicken Bucket", "Enjoy 6 or 8 pcs of your favorite crispylicious, juicylicious Chickenjoy! Upgrades are available so you can complete your with rice or spaghetti and regular soft drinks or Nestea!",  R.drawable.bucket)
    };

    private Chickenjoy(String name, String description, int imageResourceId){
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
