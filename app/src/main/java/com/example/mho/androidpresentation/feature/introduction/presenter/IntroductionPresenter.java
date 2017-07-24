package com.example.mho.androidpresentation.feature.introduction.presenter;

import com.example.mho.androidpresentation.model.HistoryItem;

import java.util.ArrayList;

public interface IntroductionPresenter {
    void addItems(ArrayList<HistoryItem> historyItemArrayList);
    void requestHistory();
}
