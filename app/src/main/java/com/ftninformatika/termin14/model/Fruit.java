package com.ftninformatika.termin14.model;

public class Fruit {

    private int id;
    private String name;
    private String description;
    private String imageFileName;


     public static Fruit[] FRUITS = new Fruit[] {

            new Fruit(0,"apple","Red apple","apples.jpg"),

            new Fruit(1,"bannana","Yelow bannas","bananas.jpg"),

            new Fruit (2,"oranges","Orange oranges","oranges.jpg")

    };





    public Fruit(int id, String name, String description, String imageFileName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFileName = imageFileName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
