package com.example.mho.androidpresentation.feature;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mho.androidpresentation.BaseActivity;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.feature.dashboards.DashboardsFragment;
import com.example.mho.androidpresentation.feature.history.view.HistoryFragment;
import com.example.mho.androidpresentation.feature.introduction.IntroductionFragment;
import com.example.mho.androidpresentation.util.ActivityUtils;

public class ContainerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initFragment();
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

    private void initFragment(){
        if(getIntent() != null && getIntent().getExtras() != null){
            String tag = getIntent().getExtras().getString(IntroductionFragment.EXTRA_FRAGMENT_TAG);
            if(tag != null && !tag.isEmpty()) {
                if (tag.equals(HistoryFragment.TAG)){
                    initToolbar(getString(R.string.introduction_item_history));
                    ActivityUtils.replaceFragment(getSupportFragmentManager(),
                            HistoryFragment.newInstance(),
                            R.id.frameContent, HistoryFragment.TAG);
                    return;
                }

                if (tag.equals(DashboardsFragment.TAG)){
                    initToolbar(getString(R.string.introduction_item_dashboards));
                    ActivityUtils.replaceFragment(getSupportFragmentManager(),
                            DashboardsFragment.newInstance(),
                            R.id.frameContent, DashboardsFragment.TAG);
                    return;
                }
            }
        }

        finish();
    }
}
