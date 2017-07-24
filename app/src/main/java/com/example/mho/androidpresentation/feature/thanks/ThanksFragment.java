package com.example.mho.androidpresentation.feature.thanks;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;

public class ThanksFragment extends BaseFragment {

    public static final String TAG = "ThanksFragment";

    public ThanksFragment() {
        // Required empty public constructor
    }

    public static ThanksFragment newInstance() {
        ThanksFragment fragment = new ThanksFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thanks, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
