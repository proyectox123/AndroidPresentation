package com.example.mho.androidpresentation.feature.history.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.mho.androidpresentation.BaseActivity;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.model.AndroidVersion;
import com.example.mho.androidpresentation.util.ImageUtils;

public class HistoryDetailActivity extends BaseActivity {

    public final static String EXTRA_ANDROID_VERSION = "EXTRA_ANDROID_VERSION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar();

        initView();
    }

    private void initView(){
        if(getIntent() == null || getIntent().getExtras() == null){
            return;
        }

        Bundle extras = getIntent().getExtras();
        AndroidVersion androidVersion = extras.getParcelable(EXTRA_ANDROID_VERSION);
        if(androidVersion == null){
            return;
        }

        ImageView historyDetailImage = (ImageView) findViewById(R.id.historyDetailImage);
        String urlImage = androidVersion.getUrlImage();
        ImageUtils.loadUrl(HistoryDetailActivity.this, historyDetailImage, urlImage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
