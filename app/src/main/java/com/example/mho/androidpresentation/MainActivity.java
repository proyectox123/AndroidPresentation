package com.example.mho.androidpresentation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mho.androidpresentation.feature.developerlife.DeveloperLifeFragment;
import com.example.mho.androidpresentation.feature.developmentfuture.DevelopmentFutureFragment;
import com.example.mho.androidpresentation.feature.introduction.IntroductionFragment;
import com.example.mho.androidpresentation.feature.references.ReferencesFragment;
import com.example.mho.androidpresentation.feature.thanks.ThanksFragment;
import com.example.mho.androidpresentation.util.ActivityUtils;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
        selectScreenView(R.id.nav_introduction);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        selectScreenView(item.getItemId());

        item.setChecked(true);
        setTitle(item.getTitle());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    private void selectScreenView(int id){
        uncheckedMenuItems();
        if (id == R.id.nav_introduction) {
            ActivityUtils.replaceFragment(getSupportFragmentManager(),
                    IntroductionFragment.newInstance(),
                    R.id.frameContent, IntroductionFragment.TAG);
            return;
        }

        if (id == R.id.nav_life) {
            ActivityUtils.replaceFragment(getSupportFragmentManager(),
                    DeveloperLifeFragment.newInstance(),
                    R.id.frameContent, DeveloperLifeFragment.TAG);
            return;
        }

        if (id == R.id.nav_future) {
            ActivityUtils.replaceFragment(getSupportFragmentManager(),
                    DevelopmentFutureFragment.newInstance(),
                    R.id.frameContent, DevelopmentFutureFragment.TAG);
            return;
        }

        if (id == R.id.nav_references) {
            ActivityUtils.replaceFragment(getSupportFragmentManager(),
                    ReferencesFragment.newInstance(),
                    R.id.frameContent, ReferencesFragment.TAG);
            return;
        }

        if (id == R.id.nav_thanks) {
            ActivityUtils.replaceFragment(getSupportFragmentManager(),
                    ThanksFragment.newInstance(),
                    R.id.frameContent, ThanksFragment.TAG);
        }
    }

    private void uncheckedMenuItems(){
        if(mNavigationView == null || mNavigationView.getMenu() == null){
            return;
        }

        Menu menu = mNavigationView.getMenu();
        if(menu == null || menu.size() == 0){
            return;
        }

        for (int i = 0; i < menu.size(); i++) {
            menu.getItem(i).setChecked(false);
        }
    }
}