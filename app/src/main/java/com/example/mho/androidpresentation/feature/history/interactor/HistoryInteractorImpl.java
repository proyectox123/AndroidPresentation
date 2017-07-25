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
        androidVersion.setUrlImage("https://vignette2.wikia.nocookie.net/logopedia/images/6/60/Android_1.0_2.png/revision/latest?cb=20150607025102");
        androidVersion.setReleaseDate("Septiembre 23, 2008");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_1_alpha));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(2, "Petit Four", "2", "-");
        androidVersion.setUrlImage("https://vignette2.wikia.nocookie.net/logopedia/images/6/60/Android_1.0_2.png/revision/latest?cb=20150607025102");
        androidVersion.setReleaseDate("Febrero 9, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_2_petit_four));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(3, "Cupcake", "3", "-");
        androidVersion.setUrlImage("https://vignette2.wikia.nocookie.net/logopedia/images/3/35/Android_1.5_2.jpg/revision/latest?cb=20150607025206");
        androidVersion.setReleaseDate("Abril 27, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_3_cupcake));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(4, "Donut", "4", "-");
        androidVersion.setUrlImage("https://vignette4.wikia.nocookie.net/logopedia/images/a/ad/Android_1.6_%282%29.jpg/revision/latest?cb=20150606123344");
        androidVersion.setReleaseDate("Septiembre 15, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_4_donut));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(5, "Eclair", "5–7", "-");
        androidVersion.setUrlImage("https://vignette3.wikia.nocookie.net/logopedia/images/9/95/Android_2.0.jpg/revision/latest?cb=20150606123541");
        androidVersion.setReleaseDate("Octubre 26, 2009");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_5_eclair));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(6, "Froyo", "8", "-");
        androidVersion.setUrlImage("https://vignette4.wikia.nocookie.net/logopedia/images/9/97/Android_2.2.png/revision/latest?cb=20150606123858");
        androidVersion.setReleaseDate("Mayo 20, 2010");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_6_froyo));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(7, "Gingerbread", "9–10", "0.7%");
        androidVersion.setUrlImage("https://vignette3.wikia.nocookie.net/logopedia/images/d/da/Andorid_2.3.png/revision/latest?cb=20150606124623");
        androidVersion.setReleaseDate("Diciembre 6, 2010");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_7_gingerbread));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(8, "Honeycomb", "11–13", "-");
        androidVersion.setUrlImage("https://vignette3.wikia.nocookie.net/logopedia/images/2/24/Android_honeycomb.png/revision/latest?cb=20150606124903");
        androidVersion.setReleaseDate("Febrero 22, 2011");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_8_honeycomb));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(9, "Ice Cream Sandwich", "14–15", "0.7%");
        androidVersion.setUrlImage("https://vignette2.wikia.nocookie.net/logopedia/images/8/86/Android_4.0.jpg/revision/latest?cb=20150606125027");
        androidVersion.setReleaseDate("Octubre 18, 2011");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_9_ice_cream_sandwich));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(10, "Jelly Bean", "16–18", "8.1%");
        androidVersion.setUrlImage("https://vignette2.wikia.nocookie.net/logopedia/images/c/c3/Android-Jelly-Bean-Logo.jpg/revision/latest?cb=20150606125310");
        androidVersion.setReleaseDate("Julio 9, 2012");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_10_jelly_bean));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(11, "KitKat", "19–20", "17.1%");
        androidVersion.setUrlImage("https://vignette3.wikia.nocookie.net/logopedia/images/a/a1/Android-kitkat-logo.jpg/revision/latest?cb=20150606125646");
        androidVersion.setReleaseDate("Octubre 31, 2013");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_11_kitkat));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(12, "Lollipop", "21–22", "30.1%");
        androidVersion.setUrlImage("https://vignette1.wikia.nocookie.net/logopedia/images/e/ea/Android_5.0.png/revision/latest?cb=20150607025024");
        androidVersion.setReleaseDate("Noviembre 12, 2014");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_12_lollipop));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(13, "Marshmallow", "23", "31.8%");
        androidVersion.setUrlImage("https://vignette1.wikia.nocookie.net/logopedia/images/f/f5/Nexus2cee_pv9AcTqS-gotB5ply6js6SgqwcMrXcvbZlicenbfWh5Q-iW7cf6RrGM-TR7dSM0Z2BbVGAs2048.png/revision/latest?cb=20150818115710");
        androidVersion.setReleaseDate("Octubre 5, 2015");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_13_marshmallow));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(14, "Nougat", "24-25", "11.5%");
        androidVersion.setUrlImage("https://vignette4.wikia.nocookie.net/logopedia/images/d/da/Nougat.png/revision/latest?cb=20160802021803");
        androidVersion.setReleaseDate("Agosto 22, 2016");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_14_nougat));
        androidVersionArrayList.add(androidVersion);

        androidVersion = new AndroidVersion(15, "Android O", "26", "-");
        androidVersion.setUrlImage("http://www.androidpolice.com/wp-content/uploads/2017/03/nexus2cee_android-o_thumb-1-728x450.png");
        androidVersion.setReleaseDate("Marzo 21, 2017 (Alpha)");
        androidVersion.setFeatures(context.getString(R.string.history_detail_features_15_o));
        androidVersionArrayList.add(androidVersion);

        historyPresenter.addItems(androidVersionArrayList);
    }
}
