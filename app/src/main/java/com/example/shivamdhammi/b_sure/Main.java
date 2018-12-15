package com.example.shivamdhammi.b_sure;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        adapter = new TabAdapter(getSupportFragmentManager());




        adapter.addFragment(new Self_Examination(),"Self Examination");
        adapter.addFragment(new Warrior_Section(),"Warrior Section");
        adapter.addFragment(new Awareness(),"Awareness");
        viewPager.setAdapter(adapter);



        tabLayout.setupWithViewPager(viewPager);

        //tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
        //tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));


    }

}
