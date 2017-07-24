package com.example.mho.androidpresentation.feature.history.presenter;

import com.example.mho.androidpresentation.model.HistoryItem;

import java.util.ArrayList;

public interface HistoryPresenter {
    void addItems(ArrayList<HistoryItem> historyItemArrayList);
    void requestHistory();
}
