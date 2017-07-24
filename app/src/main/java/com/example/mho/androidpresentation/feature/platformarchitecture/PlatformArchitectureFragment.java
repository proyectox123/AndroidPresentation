package com.example.mho.androidpresentation.feature.platformarchitecture;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.util.ImageUtils;

public class PlatformArchitectureFragment extends BaseFragment implements View.OnClickListener{

    public static final String TAG = "PlatformArchitectureFragment";

    public PlatformArchitectureFragment() {
        // Required empty public constructor
    }

    public static PlatformArchitectureFragment newInstance() {
        PlatformArchitectureFragment fragment = new PlatformArchitectureFragment();
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
        return inflater.inflate(R.layout.fragment_platform_architecture, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView platformArchitectureImage = view.findViewById(R.id.platformArchitectureImage);
        String urlImage = "https://developer.android.com/guide/platform/images/android-stack_2x.png?hl=es-419";
        ImageUtils.loadUrl(getContext(), platformArchitectureImage, urlImage);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {

    }
}
