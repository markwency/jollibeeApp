package com.example.wency.jb;

/**
 * Created by FUD on 4/7/2017.
 */

public class RiceMeal {
    private String name;
    private String description;
    private int imageResourceId;

    public static final RiceMeal[] riceMeals = {
            new RiceMeal("Garlic Pepper Beef", "Juicy Beef Strips topped with flavorful pepper sauce and garlic bits",  R.drawable.garlicpepper),
            new RiceMeal("Ultimate Burger Steak", "Made from the 100% pure beef goodness of a 1/3 pound CHAMP patty, served on top of tasty fries, and poured with savory mushroom gravy thatâ€™s sprinkled with toasted garlic bits. A sunny-side up egg on steamed rice completes this satisfying meal experience.",  R.drawable.ubs),
            new RiceMeal("Garlic Bangus", "Marinated bangus seasoned with special ingredients fried to a light crisp, topped with garlic sauce and toasted garlic bits, served with a slice of tomato and plain rice. ",  R.drawable.bangus),
            new RiceMeal("Burger Steak", "100% pure beef patties that come with a hearty serving of our flavorful mushroom gravy and steamed rice.",  R.drawable.bs),
            new RiceMeal("Shanghai Rolls", "5 pieces of your favorite crispy-sarap shanghai rolls",  R.drawable.shang)

    };

    private RiceMeal(String name, String description, int imageResourceId){
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
