package com.example.mho.androidpresentation.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AndroidVersion implements Parcelable{

    private int id;
    private String urlImage;
    private String label;
    private String apiLevels;
    private String distribution;
    private String releaseDate;
    private String features = "NA";

    public AndroidVersion(int id, String urlImage, String label, String apiLevels,
                          String distribution) {
        this.id = id;
        this.urlImage = urlImage;
        this.label = label;
        this.apiLevels = apiLevels;
        this.distribution = distribution;
    }

    public AndroidVersion(int id, String label, String apiLevels, String distribution) {
        this.id = id;
        this.label = label;
        this.apiLevels = apiLevels;
        this.distribution = distribution;
    }

    private AndroidVersion(Parcel in) {
        id = in.readInt();
        urlImage = in.readString();
        label = in.readString();
        apiLevels = in.readString();
        distribution = in.readString();
        releaseDate = in.readString();
        features = in.readString();
    }

    public static final Creator<AndroidVersion> CREATOR = new Creator<AndroidVersion>() {
        @Override
        public AndroidVersion createFromParcel(Parcel in) {
            return new AndroidVersion(in);
        }

        @Override
        public AndroidVersion[] newArray(int size) {
            return new AndroidVersion[size];
        }
    };

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

    public String getFeatures() {
        return features;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(urlImage);
        parcel.writeString(label);
        parcel.writeString(apiLevels);
        parcel.writeString(distribution);
        parcel.writeString(releaseDate);
        parcel.writeString(features);
    }
}