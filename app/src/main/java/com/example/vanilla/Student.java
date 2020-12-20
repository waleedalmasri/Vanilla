package com.example.vanilla;

public class Student {
    private String name;
    private int imageId;

    public static final Student[] members = {
            new Student("Laila Daher 1170056", R.drawable.laila),
            new Student("Muath Amer 1170497", R.drawable.muath),
            new Student("Waleed Awad 117861", R.drawable.waleed)

    };

    public Student(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImageId() {
        return imageId;
    }


}
