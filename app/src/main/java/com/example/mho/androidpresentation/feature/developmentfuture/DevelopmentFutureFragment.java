package com.example.mho.androidpresentation.feature.developmentfuture;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;

public class DevelopmentFutureFragment extends BaseFragment {

    public static final String TAG = "DevelopmentFutureFragment";

    public DevelopmentFutureFragment() {
        // Required empty public constructor
    }

    public static DevelopmentFutureFragment newInstance() {
        DevelopmentFutureFragment fragment = new DevelopmentFutureFragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_development_future, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
