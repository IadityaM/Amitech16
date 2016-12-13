package amitech.twok16.amitech16;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class Schedule extends FragmentActivity implements OnTabChangeListener, OnPageChangeListener {

    private TabsPagerAdapterSchedule mAdapter;
    private ViewPager mViewPager;
    private TabHost mTabHost;

    private static void AddTab(Schedule activity, TabHost tabHost, TabHost.TabSpec tabSpec) {
        tabSpec.setContent(new MyTabFactorySchedule(activity));
        tabHost.addTab(tabSpec);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }*/
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        // Tab Initialization
        initialiseTabHost();
        mAdapter = new TabsPagerAdapterSchedule(getSupportFragmentManager());
        // Fragments and ViewPager Initialization


        mViewPager.setAdapter(mAdapter);
        mViewPager.setOnPageChangeListener(Schedule.this);

    }

    // Manages the Tab changes, synchronizing it with Pages
    public void onTabChanged(String tag) {
        int pos = this.mTabHost.getCurrentTab();
        this.mViewPager.setCurrentItem(pos);
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    // Manages the Page changes, synchronizing it with Tabs
    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        int pos = this.mViewPager.getCurrentItem();
        this.mTabHost.setCurrentTab(pos);
    }

    @Override
    public void onPageSelected(int arg0) {
    }


    // Tabs Creation
    private void initialiseTabHost() {
        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        // TODO Put here your Tabs
        // MainActivity.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("ButtonTab").setIndicator("ButtonTab"));
        Schedule.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("DAY 1").setIndicator("DAY 1"));
        Schedule.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("DAY 2").setIndicator("DAY 2"));

        mTabHost.setOnTabChangedListener(this);
    }
}
