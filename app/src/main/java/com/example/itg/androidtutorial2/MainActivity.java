package com.example.itg.androidtutorial2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";
    private SectionPageAdapter sectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
//        mViewPager = (ViewPager) findViewById(R.id .viewpager);
//        setupViewPager(mViewPager);
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
//        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
//        adapter.addFragment(new OneFragment(), "Tab One");
//        adapter.addFragment(new TwoFragment(), "Tab Two");
//        viewPager.setAdapter(adapter);
    }


}
