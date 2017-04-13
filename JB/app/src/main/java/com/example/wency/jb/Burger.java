package com.example.wency.jb;

/**
 * Created by wency on 4/3/2017.
 */

public class Burger {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Burger[] burgers = {
            new Burger("Yum with TLC", "Made with 100% pure beef patty served with mayo, a slice of fresh tomato, crisp lettuce and creamy cheese all in a soft sesame seed bun", R.drawable.yumtlc),
            new Burger("Cheesy Bacon Mushroom Yum", "Your favorite Yumburger patty topped with bacon, cheese sauce and mushrooms, in a new sesame seed bun", R.drawable.baconyum),
            new Burger("Cheesy Bacon Mushroom Champ", "Made with 1/3 pound, 100% pure beef Champ patty, smothered with delicious cheese sauce, bacon strips and mushrooms. Extraordinary langhap-sarap!", R.drawable.baconchamp),
            new Burger("Champ", "Made with 100% pure beef, fresh lettuce and tomatoes, creamy cheese, catsup and mayo served in soft sesame seed bun.", R.drawable.champ),
            new Burger("Yum", "Made with 100% beef patty served with our own special burger dressing all in a soft bun", R.drawable.yum),
            new Burger("Yum with Cheese", "Made with 100% beef patty with cheese served with our own special burger dressing all in a soft bun", R.drawable.yumtlc),
            new Burger("Amazing Aloha Champ", "", R.drawable.yumtlc)
    };

    private Burger(String name, String description, int imageResourceId){
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
