package com.example.mho.androidpresentation.feature.introduction;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.feature.introduction.presenter.IntroductionPresenter;
import com.example.mho.androidpresentation.feature.introduction.presenter.IntroductionPresenterImpl;
import com.example.mho.androidpresentation.feature.introduction.view.IntroductionView;
import com.example.mho.androidpresentation.model.HistoryItem;

import java.util.ArrayList;

public class IntroductionFragment extends BaseFragment implements IntroductionView{

    public static final String TAG = "IntroductionFragment";

    private RecyclerView historyRecyclerView;

    private IntroductionPresenter introductionPresenter;

    public IntroductionFragment() {
        // Required empty public constructor
    }

    public static IntroductionFragment newInstance() {
        IntroductionFragment fragment = new IntroductionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        introductionPresenter = new IntroductionPresenterImpl(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_introduction, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        historyRecyclerView = view.findViewById(R.id.historyRecyclerView);
        historyRecyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        historyRecyclerView.setLayoutManager(llm);

        introductionPresenter.requestHistory();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void addItems(ArrayList<HistoryItem> historyItemArrayList){
        HistoryAdapter adapter = new HistoryAdapter(getActivity(), historyItemArrayList);
        historyRecyclerView.setAdapter(adapter);
    }
}
