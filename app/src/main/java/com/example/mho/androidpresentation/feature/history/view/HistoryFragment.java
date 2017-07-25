package com.example.mho.androidpresentation.feature.history.view;

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
import com.example.mho.androidpresentation.feature.history.presenter.HistoryPresenter;
import com.example.mho.androidpresentation.feature.history.presenter.HistoryPresenterImpl;
import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public class HistoryFragment extends BaseFragment implements HistoryView {

    public static final String TAG = "HistoryFragment";
    private final static int NUMBER_OF_COLUMNS = 2;
    private final static int SPACING_ITEM = 1;

    private RecyclerView historyRecyclerView;

    private HistoryPresenter historyPresenter;

    public HistoryFragment() {
        // Required empty public constructor
    }

    public static HistoryFragment newInstance() {
        HistoryFragment fragment = new HistoryFragment();
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
        historyPresenter = new HistoryPresenterImpl(getContext(), this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_history, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        historyRecyclerView = view.findViewById(R.id.historyRecyclerView);
        historyRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        /*GridSpacingItemDecoration gridSpacingItemDecoration =
                new GridSpacingItemDecoration(NUMBER_OF_COLUMNS, SPACING_ITEM, false);
        historyRecyclerView.addItemDecoration(gridSpacingItemDecoration);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), NUMBER_OF_COLUMNS);*/
        historyRecyclerView.setLayoutManager(layoutManager);

        historyPresenter.requestHistory();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void addItems(ArrayList<AndroidVersion> androidVersionArrayList){
        HistoryAdapter adapter = new HistoryAdapter(getActivity(), androidVersionArrayList);
        historyRecyclerView.setAdapter(adapter);
    }
}
