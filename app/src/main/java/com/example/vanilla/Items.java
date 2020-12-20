package com.example.vanilla;

public class Items {
    private int id;
    private String name;
    private String type;
    private String flavor;
    private double price;
    private boolean isAvailable;
    private int imageId;

    public static final Items[] items = {
            new Items(1,"Caramel Hot Drink", "Hot Drink", "Caramel", 8.99, true, R.drawable.hot_caramel),
            new Items(2,"Apple Pie", "Pie", "Apple", 24.99, true, R.drawable.apple_pie),
            new Items(3,"Bounty Cheese Cake", "Cake", "Bounty", 29.99, true, R.drawable.bounty_cheesecake),
            new Items(4,"Chai Latte", "Hot Drink", "Latte", 8.99, true, R.drawable.chai_latte),
            new Items(5,"German Cake", "Cake", "Chocolate", 39.99, true, R.drawable.german_cake),
            new Items(6,"Iced Mocha", "Cold Drinks", "Mocha", 8.99, true, R.drawable.iced_mocha),
            new Items(7,"Italian Chocolate", "Hot Drinks", "Mixed", 8.99, true, R.drawable.italian_choclate),
            new Items(8,"Japanese Cheese Cake", "Cake", "Butter", 49.99, true, R.drawable.japanese_cheesecake),
            new Items(9,"Lotus Cake", "Cake", "Lotus", 39.99, true, R.drawable.lotus_cake),
            new Items(10,"Rainbow Cake", "Cake", "Lotus", 49.99, true, R.drawable.rainbow_cake)

    };

    public Items(int id,String name, String type, String flavor, double price, boolean isAvailable, int imageId) {
        this.id=id;
        this.name = name;
        this.type = type;
        this.flavor = flavor;
        this.price = price;
        this.isAvailable = isAvailable;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
