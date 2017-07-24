package com.example.mho.androidpresentation.feature.history.interactor;

import com.example.mho.androidpresentation.feature.history.presenter.HistoryPresenter;
import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public class HistoryInteractorImpl implements HistoryInteractor{

    private HistoryPresenter historyPresenter;

    public HistoryInteractorImpl(HistoryPresenter historyPresenter){
        this.historyPresenter = historyPresenter;
    }

    @Override
    public void requestHistory() {
        ArrayList<AndroidVersion> androidVersionArrayList = new ArrayList<>();
        androidVersionArrayList.add(new AndroidVersion(1, "http://www.pedrorainho.eu/wp-content/uploads/2014/01/android-logo.png", "Android 1.0", "1", "-"));
        androidVersionArrayList.add(new AndroidVersion(2, "http://www.monografias.com/trabajos101/sistema-operativo-android/image004.jpg", "Petit Four", "2", "-"));
        androidVersionArrayList.add(new AndroidVersion(3, "http://www.gsmdome.com/wp-content/uploads/2009/04/android-cupcake-ofc-logo.jpg", "Cupcake", "3", "-"));
        androidVersionArrayList.add(new AndroidVersion(4, "http://vignette2.wikia.nocookie.net/logopedia/images/c/c5/Android-1_6-donut.jpg/revision/latest?cb=20130520200422", "Donut", "4", "-"));
        androidVersionArrayList.add(new AndroidVersion(5, "https://android5x1.com/app/uploads/2017/06/Eclair_2009.png", "Eclair", "5–7", "-"));
        androidVersionArrayList.add(new AndroidVersion(6, "http://1.bp.blogspot.com/_kNUIczJH1OM/S_SfteV5BgI/AAAAAAAAABM/fi0j5ssUrjE/s320/froyo.png", "Froyo", "8", "-"));
        androidVersionArrayList.add(new AndroidVersion(7, "https://vignette4.wikia.nocookie.net/logopedia/images/d/d8/Andorid-2.3-Gingerbread-logo.png/revision/latest?cb=20130520201209", "Gingerbread", "9–10", "0.7%"));
        androidVersionArrayList.add(new AndroidVersion(8, "https://cnet2.cbsistatic.com/img/6te3nxhfvimuqnopPUXZCYja_ug=/1170x0/2011/01/28/236e020d-cbf2-11e2-9a4a-0291187b029a/honeycomb-logo.jpg", "Honeycomb", "11–13", "-"));
        androidVersionArrayList.add(new AndroidVersion(9, "https://lh6.ggpht.com/WUnKUgKwFlUeaI26UGkMR_y39Xs-6oA0RHcJ3_wxwWPwIKGrY4GA2NxjNXj_u_pw-Q=w300", "Ice Cream Sandwich", "14–15", "0.7%"));
        androidVersionArrayList.add(new AndroidVersion(10, "https://4.bp.blogspot.com/-P0b2RM0Yflo/T-sod7ZWSdI/AAAAAAAAA_s/Lh1QoJEWjkI/s1600/jbean_srgb.png", "Jelly Bean", "16–18", "8.1%"));
        androidVersionArrayList.add(new AndroidVersion(11, "https://www.androidcentral.com/sites/androidcentral.com/files/styles/large/public/topic_images/2016/android-kitkat-topic.png", "KitKat", "19–20", "17.1%"));
        androidVersionArrayList.add(new AndroidVersion(12, "http://img.talkandroid.com/uploads/2014/10/android_lollipop_waving.png", "Lollipop", "21–22", "30.1%"));
        androidVersionArrayList.add(new AndroidVersion(13, "https://upload.wikimedia.org/wikipedia/tr/3/3c/Android-Marshmallow-logo-.jpg", "Marshmallow", "23", "31.8%"));
        androidVersionArrayList.add(new AndroidVersion(14, "https://upload.wikimedia.org/wikipedia/commons/c/ca/Android_7.0_Nougat.jpg", "Nougat", "24-25", "11.5%"));
        androidVersionArrayList.add(new AndroidVersion(15, "https://upload.wikimedia.org/wikipedia/en/a/a6/Android_O_logo.jpg", "Android O", "26", "-"));

        historyPresenter.addItems(androidVersionArrayList);
    }
}
