package com.example.mho.androidpresentation.feature.introduction.presenter;

import com.example.mho.androidpresentation.feature.introduction.interactor.IntroductionInteractor;
import com.example.mho.androidpresentation.feature.introduction.interactor.IntroductionInteractorImpl;
import com.example.mho.androidpresentation.feature.introduction.view.IntroductionView;
import com.example.mho.androidpresentation.model.HistoryItem;

import java.util.ArrayList;

public class IntroductionPresenterImpl implements IntroductionPresenter {

    private IntroductionView introductionView;
    private IntroductionInteractor introductionInteractor;

    public IntroductionPresenterImpl(IntroductionView introductionView) {
        this.introductionView = introductionView;
        introductionInteractor = new IntroductionInteractorImpl(this);
    }


    @Override
    public void addItems(ArrayList<HistoryItem> historyItemArrayList) {
        introductionView.addItems(historyItemArrayList);
    }

    @Override
    public void requestHistory() {
        introductionInteractor.requestHistory();
    }
}