package com.example.mho.androidpresentation.model;

public class HistoryItem {

    private int id;
    private String urlImage;
    private String label;
    private String apiLevels;

    public HistoryItem(int id, String urlImage, String label, String apiLevels) {
        this.id = id;
        this.urlImage = urlImage;
        this.label = label;
        this.apiLevels = apiLevels;
    }

    public int getId() {
        return id;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getLabel() {
        return label;
    }

    public String getApiLevels() {
        return apiLevels;
    }
}
