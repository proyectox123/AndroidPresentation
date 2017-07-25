package com.example.mho.androidpresentation.feature.developmentfuture;

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
import com.example.mho.androidpresentation.model.DevelopmentFuture;

import java.util.ArrayList;

public class DevelopmentFutureFragment extends BaseFragment {

    public static final String TAG = "DevelopmentFutureFragment";

    private RecyclerView developmentFutureRecyclerView;

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
        developmentFutureRecyclerView = view.findViewById(R.id.developmentFutureRecyclerView);
        developmentFutureRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        developmentFutureRecyclerView.setLayoutManager(layoutManager);

        initList();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void initList(){
        ArrayList<DevelopmentFuture> developmentFutureArrayList = new ArrayList<>();
        DevelopmentFuture developmentFuture = new DevelopmentFuture(1, "Android O... Android 8.0");
        developmentFuture.setImageUrl("https://2.bp.blogspot.com/-WSPrWvuvCvc/WM80F43fu4I/AAAAAAAAGtU/N73vMkriLX8rH-lt1t2cns9YSuJlBHr_wCLcB/s1600/android-o-logo.png");
        developmentFutureArrayList.add(developmentFuture);

        developmentFuture = new DevelopmentFuture(2, "Andromeda (funciones de Chrome OS en Android)");
        developmentFuture.setImageUrl("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/12/google-no-andromeda.jpg");
        developmentFutureArrayList.add(developmentFuture);

        developmentFuture = new DevelopmentFuture(3, "Google Assistant/Google Now/Now on Tap");
        developmentFuture.setImageUrl("https://newesc.com/wp-content/uploads/Google-Assistant-o-Asistente-de-Google.png");
        developmentFutureArrayList.add(developmentFuture);

        developmentFuture = new DevelopmentFuture(4, "VR [Daydream] y realidad aumentada [Tango]");
        developmentFuture.setImageUrl("http://cdn.gospelherald.com/data/images/full/17732/googles-daydream.jpg");
        developmentFutureArrayList.add(developmentFuture);

        developmentFuture = new DevelopmentFuture(5, "Android Wear 2.0 y actualizaciones de Android Auto y Android TV");
        developmentFuture.setImageUrl("http://d3ustg7s7bf7i9.cloudfront.net/mmediafiles/pl/a9/a9ba5afd-3421-43d7-8112-ab575e4c56d3_879_586.jpg");
        developmentFutureArrayList.add(developmentFuture);

        developmentFuture = new DevelopmentFuture(6, "Android Things");
        developmentFuture.setImageUrl("https://elandroidelibre.elespanol.com/wp-content/uploads/2016/12/android-things-750x429.jpg");
        developmentFutureArrayList.add(developmentFuture);

        DevelopmentFutureAdapter adapter =
                new DevelopmentFutureAdapter(getActivity(), developmentFutureArrayList);
        developmentFutureRecyclerView.setAdapter(adapter);
    }
}
