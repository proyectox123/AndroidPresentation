package com.example.mho.androidpresentation.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AndroidVersion implements Parcelable{

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

    private AndroidVersion(Parcel in) {
        id = in.readInt();
        urlImage = in.readString();
        label = in.readString();
        apiLevels = in.readString();
        distribution = in.readString();
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
    }
}