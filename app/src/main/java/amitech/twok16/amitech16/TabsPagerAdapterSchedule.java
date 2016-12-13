package amitech.twok16.amitech16;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aditya on 22-Mar-16.
 */
public class TabsPagerAdapterSchedule extends FragmentPagerAdapter {

    public TabsPagerAdapterSchedule(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
		/*case 0:
			// Top Rated fragment activity
			return new ButtonFragment();*/
            case 0:
                // Games fragment activity
                return new Day1Fragment();
            case 1:
                // Movies fragment activity
                return new Day2Fragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}