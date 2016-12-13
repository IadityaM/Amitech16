package amitech.twok16.amitech16;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;


public class ImageViewPagerAdapter extends FragmentPagerAdapter {
    public static int totalPage = 3;
    private Context _context;
    //OnBoard finish = new OnBoard();

    public ImageViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        switch (position) {
            case 0:
                f = new ImageOneFragment();
                break;
            case 1:
                f = new ImageTwoFragment();
                break;
            case 2:
                f = new ImageThreeFragment();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return totalPage;
    }

}