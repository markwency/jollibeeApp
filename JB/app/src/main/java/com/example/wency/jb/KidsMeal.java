package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class KidsMeal {
    private String name;
    private String description;
    private int imageResourceId;

    public static final KidsMeal[] kidsMeals = {
            new KidsMeal("Jolly Spaghetti with Softdrink + Toy + free Vanilla Cone Twirl", "Jollibee’s sweet style spaghetti sauce-now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti – the Spaghettiest!",  R.drawable.spagmeal),
            new KidsMeal("Yum with Softdrink + Toy + free Vanile Cone Twirl", "Made with 100% pure beef patty served with our very own special burger dressing all in a soft bun",  R.drawable.yummeal),
            new KidsMeal("Chickenjoy with Softdrink + Toy + free Vanilla Cone Twirl", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee’s perfectly seasoned fried chicken that’s crispy on the outside; tender and juicy on the inside",  R.drawable.chickenmeal)
    };

    private KidsMeal(String name, String description, int imageResourceId){
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
