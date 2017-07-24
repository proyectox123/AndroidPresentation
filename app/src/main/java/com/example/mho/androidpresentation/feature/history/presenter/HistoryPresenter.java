package com.example.mho.androidpresentation.feature.history.presenter;

import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public interface HistoryPresenter {
    void addItems(ArrayList<AndroidVersion> androidVersionArrayList);
    void requestHistory();
}
