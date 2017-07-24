package com.example.mho.androidpresentation.feature.dashboards;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mho.androidpresentation.BaseFragment;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.model.AndroidVersion;
import com.example.mho.androidpresentation.util.ImageUtils;

import java.util.ArrayList;

public class DashboardsFragment extends BaseFragment implements View.OnClickListener{

    public static final String TAG = "DashboardsFragment";

    private RecyclerView dashboardsRecyclerView;

    public DashboardsFragment() {
        // Required empty public constructor
    }

    public static DashboardsFragment newInstance() {
        DashboardsFragment fragment = new DashboardsFragment();
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
        return inflater.inflate(R.layout.fragment_dashboards, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView dashboardsImage = view.findViewById(R.id.dashboardsImage);
        String urlImage = "https://chart.googleapis.com/chart?chco=c4df9b%2C6fad0c&chd=t%3A0.7%2C0.7%2C8.1%2C17.1%2C30.1%2C31.8%2C11.5&chf=bg%2Cs%2C00000000&chl=Gingerbread%7CIce%20Cream%20Sandwich%7CJelly%20Bean%7CKitKat%7CLollipop%7CMarshmallow%7CNougat&chs=500x250&cht=p";
        ImageUtils.loadUrl(getContext(), dashboardsImage, urlImage);

        dashboardsRecyclerView = view.findViewById(R.id.dashboardsRecyclerView);
        dashboardsRecyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        dashboardsRecyclerView.setLayoutManager(llm);

        initList();
    }

    private void initList(){
        ArrayList<AndroidVersion> androidVersionArrayList = new ArrayList<>();
        androidVersionArrayList.add(new AndroidVersion(7, "https://vignette4.wikia.nocookie.net/logopedia/images/d/d8/Andorid-2.3-Gingerbread-logo.png/revision/latest?cb=20130520201209", "Gingerbread", "9–10", "0.7%"));
        androidVersionArrayList.add(new AndroidVersion(9, "https://lh6.ggpht.com/WUnKUgKwFlUeaI26UGkMR_y39Xs-6oA0RHcJ3_wxwWPwIKGrY4GA2NxjNXj_u_pw-Q=w300", "Ice Cream Sandwich", "14–15", "0.7%"));
        androidVersionArrayList.add(new AndroidVersion(10, "https://4.bp.blogspot.com/-P0b2RM0Yflo/T-sod7ZWSdI/AAAAAAAAA_s/Lh1QoJEWjkI/s1600/jbean_srgb.png", "Jelly Bean", "16–18", "8.1%"));
        androidVersionArrayList.add(new AndroidVersion(11, "https://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/topic_images/2016/android-kitkat-topic.png", "KitKat", "19–20", "17.1%"));
        androidVersionArrayList.add(new AndroidVersion(12, "http://img.talkandroid.com/uploads/2014/10/android_lollipop_waving.png", "Lollipop", "21–22", "30.1%"));
        androidVersionArrayList.add(new AndroidVersion(13, "https://upload.wikimedia.org/wikipedia/tr/3/3c/Android-Marshmallow-logo-.jpg", "Marshmallow", "23", "31.8%"));
        androidVersionArrayList.add(new AndroidVersion(14, "https://upload.wikimedia.org/wikipedia/commons/c/ca/Android_7.0_Nougat.jpg", "Nougat", "24-25", "11.5%"));

        DistributionAdapter adapter = new DistributionAdapter(getActivity(), androidVersionArrayList);
        dashboardsRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {

    }
}
