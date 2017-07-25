package com.example.mho.androidpresentation.model;

public class DevelopmentFuture {

    private int id;
    private String label;
    private String imageUrl;

    public DevelopmentFuture(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
