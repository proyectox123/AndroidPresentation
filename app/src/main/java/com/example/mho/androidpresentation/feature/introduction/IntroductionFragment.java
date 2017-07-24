package com.example.mho.androidpresentation.feature.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.feature.ContainerActivity;
import com.example.mho.androidpresentation.feature.dashboards.DashboardsFragment;
import com.example.mho.androidpresentation.feature.history.view.HistoryFragment;

public class IntroductionFragment extends BaseFragment implements View.OnClickListener{

    public static final String TAG = "IntroductionFragment";
    public static final String EXTRA_FRAGMENT_TAG = "EXTRA_FRAGMENT_TAG";

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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_introduction, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button introductionItemHistory = view.findViewById(R.id.introductionItemHistory);
        Button introductionItemDashboards = view.findViewById(R.id.introductionItemDashboards);
        Button introductionItemScreenSizes = view.findViewById(R.id.introductionItemScreenSizes);
        Button introductionItemPlatformArchitecture =
                view.findViewById(R.id.introductionItemPlatformArchitecture);

        introductionItemHistory.setOnClickListener(this);
        introductionItemDashboards.setOnClickListener(this);
        introductionItemScreenSizes.setOnClickListener(this);
        introductionItemPlatformArchitecture.setOnClickListener(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.introductionItemHistory:
                Intent intent = new Intent(getActivity(), ContainerActivity.class);
                intent.putExtra(EXTRA_FRAGMENT_TAG, HistoryFragment.TAG);
                getActivity().startActivity(intent);
                break;
            case R.id.introductionItemDashboards:
                intent = new Intent(getActivity(), ContainerActivity.class);
                intent.putExtra(EXTRA_FRAGMENT_TAG, DashboardsFragment.TAG);
                getActivity().startActivity(intent);
                break;
            case R.id.introductionItemScreenSizes:

                break;
            case R.id.introductionItemPlatformArchitecture:

                break;
        }
    }
}
