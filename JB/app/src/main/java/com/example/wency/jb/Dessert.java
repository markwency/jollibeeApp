package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class Dessert {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Dessert[] desserts = {
            new Dessert("Creamy Shake Strawberry", "",  R.drawable.creamystrawberry),
            new Dessert("Creamy Shake Chocolate", "",  R.drawable.creamychoco),
            new Dessert("Kit Kat Mix-ins", "",  R.drawable.kitkatmix),
            new Dessert("Strawberry Sundae", "Vanilla softserve topped with strawberry syrup and strawberry bits. ",  R.drawable.strawberrysundae),
            new Dessert("Chocolate Sundae", "Creamy vanilla soft serve topped with luxurious chocolate fudge.",  R.drawable.chocosundae),
            new Dessert("Coke Float", "Creamy vanilla twirl on ice-cold Coke with choco syrup.",  R.drawable.cokefloat),
            new Dessert("Cone Twirl Krunchy Chocolate", "Creamy vanilla soft serve dipped in chocolate-flavored coating sprinkled with rice crispies.",  R.drawable.chocotwirl),
            new Dessert("Cone Twirl Vanilla", "Creamy vanilla softserve on a cone.",  R.drawable.vanillatwirl)
    };

    private Dessert(String name, String description, int imageResourceId){
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
