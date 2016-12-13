package amitech.twok16.amitech16;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by Aditya on 22-Mar-16.
 */
public class MyTabFactorySchedule implements TabHost.TabContentFactory {

    private final Context mContext;

    public MyTabFactorySchedule(Context context) {
        mContext = context;
    }

    public View createTabContent(String tag) {
        View v = new View(mContext);
        v.setMinimumWidth(0);
        v.setMinimumHeight(0);
        return v;
    }
}