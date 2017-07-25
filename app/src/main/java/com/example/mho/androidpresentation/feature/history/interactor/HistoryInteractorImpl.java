package com.example.mho.androidpresentation.feature.history.interactor;

import android.content.Context;

import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.feature.history.presenter.HistoryPresenter;
import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public class HistoryInteractorImpl implements HistoryInteractor{

    private Context context;
    private HistoryPresenter historyPresenter;

    public HistoryInteractorImpl(Context context, HistoryPresenter historyPresenter){
        this.context = context;
        this.historyPresenter = historyPresenter;
    }

    @Override
    public void requestHistory() {
        ArrayList<AndroidVersion> androidVersionArrayList = new ArrayList<>();
        AndroidVersion androidVersion = new AndroidVersion(1, "Android 1.0", "1", "-");
        androidVersion.setUrlImage("http://www.pedrorainho.eu/wp-content/uploads/2014/01/android-logo.png");
        androidVersion.setReleaseDate("Septiembre 23, 2008");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_1_alpha));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(2, "Petit Four", "2", "-");
        androidVersion.setUrlImage("http://www.monografias.com/trabajos101/sistema-operativo-android/image004.jpg");
        androidVersion.setReleaseDate("Febrero 9, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_2_petit_four));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(3, "Cupcake", "3", "-");
        androidVersion.setUrlImage("http://www.gsmdome.com/wp-content/uploads/2009/04/android-cupcake-ofc-logo.jpg");
        androidVersion.setReleaseDate("Abril 27, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_3_cupcake));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(4, "Donut", "4", "-");
        androidVersion.setUrlImage("http://vignette2.wikia.nocookie.net/logopedia/images/c/c5/Android-1_6-donut.jpg/revision/latest?cb=20130520200422");
        androidVersion.setReleaseDate("Septiembre 15, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_4_donut));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(5, "Eclair", "5–7", "-");
        androidVersion.setUrlImage("https://android5x1.com/app/uploads/2017/06/Eclair_2009.png");
        androidVersion.setReleaseDate("Octubre 26, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_5_eclair));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(6, "Froyo", "8", "-");
        androidVersion.setUrlImage("http://1.bp.blogspot.com/_kNUIczJH1OM/S_SfteV5BgI/AAAAAAAAABM/fi0j5ssUrjE/s320/froyo.png");
        androidVersion.setReleaseDate("Mayo 20, 2010");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_6_froyo));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(7, "Gingerbread", "9–10", "0.7%");
        androidVersion.setUrlImage("https://vignette4.wikia.nocookie.net/logopedia/images/d/d8/Andorid-2.3-Gingerbread-logo.png/revision/latest?cb=20130520201209");
        androidVersion.setReleaseDate("Diciembre 6, 2010");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_7_gingerbread));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(8, "Honeycomb", "11–13", "-");
        androidVersion.setUrlImage("https://cnet2.cbsistatic.com/img/6te3nxhfvimuqnopPUXZCYja_ug=/1170x0/2011/01/28/236e020d-cbf2-11e2-9a4a-0291187b029a/honeycomb-logo.jpg");
        androidVersion.setReleaseDate("Febrero 22, 2011");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_8_honeycomb));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(9, "Ice Cream Sandwich", "14–15", "0.7%");
        androidVersion.setUrlImage("https://lh6.ggpht.com/WUnKUgKwFlUeaI26UGkMR_y39Xs-6oA0RHcJ3_wxwWPwIKGrY4GA2NxjNXj_u_pw-Q=w300");
        androidVersion.setReleaseDate("Octubre 18, 2011");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_9_ice_cream_sandwich));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(10, "Jelly Bean", "16–18", "8.1%");
        androidVersion.setUrlImage("https://4.bp.blogspot.com/-P0b2RM0Yflo/T-sod7ZWSdI/AAAAAAAAA_s/Lh1QoJEWjkI/s1600/jbean_srgb.png");
        androidVersion.setReleaseDate("Julio 9, 2012");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_10_jelly_bean));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(11, "KitKat", "19–20", "17.1%");
        androidVersion.setUrlImage("https://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/topic_images/2016/android-kitkat-topic.png");
        androidVersion.setReleaseDate("Octubre 31, 2013");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_11_kitkat));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(12, "Lollipop", "21–22", "30.1%");
        androidVersion.setUrlImage("http://img.talkandroid.com/uploads/2014/10/android_lollipop_waving.png");
        androidVersion.setReleaseDate("Noviembre 12, 2014");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_12_lollipop));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(13, "Marshmallow", "23", "31.8%");
        androidVersion.setUrlImage("https://upload.wikimedia.org/wikipedia/tr/3/3c/Android-Marshmallow-logo-.jpg");
        androidVersion.setReleaseDate("Octubre 5, 2015");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_13_marshmallow));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(14, "Nougat", "24-25", "11.5%");
        androidVersion.setUrlImage("https://upload.wikimedia.org/wikipedia/commons/c/ca/Android_7.0_Nougat.jpg");
        androidVersion.setReleaseDate("Agosto 22, 2016");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_14_nougat));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(15, "Android O", "26", "-");
        androidVersion.setUrlImage("https://upload.wikimedia.org/wikipedia/en/a/a6/Android_O_logo.jpg");
        androidVersion.setReleaseDate("Marzo 21, 2017 (Alpha)");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_15_o));
        androidVersionArrayList.add(androidVersion);

        historyPresenter.addItems(androidVersionArrayList);
    }
}
