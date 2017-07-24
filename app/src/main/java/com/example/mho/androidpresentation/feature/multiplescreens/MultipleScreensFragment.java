package com.example.mho.androidpresentation.feature.multiplescreens;


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

public class MultipleScreensFragment extends BaseFragment implements View.OnClickListener{

    public static final String TAG = "MultipleScreensFragment";

    public MultipleScreensFragment() {
        // Required empty public constructor
    }

    public static MultipleScreensFragment newInstance() {
        MultipleScreensFragment fragment = new MultipleScreensFragment();
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
        return inflater.inflate(R.layout.fragment_multiple_screens, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView multipleScreensSizeImage = view.findViewById(R.id.multipleScreensSizeImage);
        ImageView multipleScreensDensityImage = view.findViewById(R.id.multipleScreensDensityImage);

        String urlImage = "https://chart.googleapis.com/chart?chco=c4df9b%2C6fad0c&chd=t%3A3.3%2C6.4%2C89.5%2C0.8&chf=bg%2Cs%2C00000000&chl=Xlarge%7CLarge%7CNormal%7CSmall&chs=400x250&cht=p";
        ImageUtils.loadUrl(getContext(), multipleScreensSizeImage, urlImage);
        urlImage = "https://chart.googleapis.com/chart?chco=c4df9b%2C6fad0c&chd=t%3A0.9%2C7.4%2C1.9%2C33.4%2C36.5%2C19.9&chf=bg%2Cs%2C00000000&chl=ldpi%7Cmdpi%7Ctvdpi%7Chdpi%7Cxhdpi%7Cxxhdpi&chs=400x250&cht=p";
        ImageUtils.loadUrl(getContext(), multipleScreensDensityImage, urlImage);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {

    }
}
