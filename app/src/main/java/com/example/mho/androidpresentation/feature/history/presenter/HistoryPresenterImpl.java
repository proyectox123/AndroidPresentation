package com.example.mho.androidpresentation.feature.history.presenter;

import com.example.mho.androidpresentation.feature.history.interactor.HistoryInteractor;
import com.example.mho.androidpresentation.feature.history.interactor.HistoryInteractorImpl;
import com.example.mho.androidpresentation.feature.history.view.HistoryView;
import com.example.mho.androidpresentation.model.HistoryItem;

import java.util.ArrayList;

public class HistoryPresenterImpl implements HistoryPresenter {

    private HistoryView historyView;
    private HistoryInteractor historyInteractor;

    public HistoryPresenterImpl(HistoryView historyView) {
        this.historyView = historyView;
        historyInteractor = new HistoryInteractorImpl(this);
    }


    @Override
    public void addItems(ArrayList<HistoryItem> historyItemArrayList) {
        historyView.addItems(historyItemArrayList);
    }

    @Override
    public void requestHistory() {
        historyInteractor.requestHistory();
    }
}