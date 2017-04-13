package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class Sides {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Sides[] sides = {
            new Sides("Butterd Corn", "Golden yellow corn kernels with butter",  R.drawable.corn),
            new Sides("Peach Mango Pie", "Golden brown, flaky, slightly sweet crust with a pleasant blend of diced peaches and mango filling in thick sauce.",  R.drawable.peach),
            new Sides("Jolly Hotdog", "Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with a slightly tangy, cheese-based topping and livened up with grated cheese and tomato catsup.",  R.drawable.jolly),
            new Sides("Jolly Crispy Fries", "Light to golden brown crispy potato strips, made from choice potatoes.",  R.drawable.fried),
            new Sides("Macaroni Soup", "A hearty cream of chicken soup with macaroni noodles, carrots, chicken chunks, bits of ham, and corn.",  R.drawable.soup)
    };

    private Sides(String name, String description, int imageResourceId){
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
