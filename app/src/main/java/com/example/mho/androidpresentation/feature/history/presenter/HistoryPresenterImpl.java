package com.example.mho.androidpresentation.feature.history.presenter;

import android.content.Context;

import com.example.mho.androidpresentation.feature.history.interactor.HistoryInteractor;
import com.example.mho.androidpresentation.feature.history.interactor.HistoryInteractorImpl;
import com.example.mho.androidpresentation.feature.history.view.HistoryView;
import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public class HistoryPresenterImpl implements HistoryPresenter {

    private HistoryView historyView;
    private HistoryInteractor historyInteractor;

    public HistoryPresenterImpl(Context context, HistoryView historyView) {
        this.historyView = historyView;
        historyInteractor = new HistoryInteractorImpl(context, this);
    }


    @Override
    public void addItems(ArrayList<AndroidVersion> androidVersionArrayList) {
        historyView.addItems(androidVersionArrayList);
    }

    @Override
    public void requestHistory() {
        historyInteractor.requestHistory();
    }
}