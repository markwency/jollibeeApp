package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class Noodle {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Noodle[] noodles = {
            new Noodle("Jolly Spaghetti", "Jollibee’s sweet style spaghetti sauce-now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti – the Spaghettiest",  R.drawable.spag),
            new Noodle("Palabok Fiesta", "Premium bihon noodles served with mouth-watering palabok sauce and toppings of pork chicharon bits, tinapa flakes, sauteed pork, shrimps, and slices of egg", R.drawable.palabok)
    };

    private Noodle(String name, String description, int imageResourceId){
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
