package com.example.mho.androidpresentation.model;

public class AndroidVersion {

    private int id;
    private String urlImage;
    private String label;
    private String apiLevels;
    private String distribution;

    public AndroidVersion(int id, String urlImage, String label, String apiLevels,
                          String distribution) {
        this.id = id;
        this.urlImage = urlImage;
        this.label = label;
        this.apiLevels = apiLevels;
        this.distribution = distribution;
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

    public String getDistribution() {
        return distribution;
    }
}
