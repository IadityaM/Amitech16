package amitech.twok16.amitech16;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by Aditya on 24-Feb-16.
 */
public class ParseConnector extends Application {
    public void onCreate() {
        Parse.initialize(this);
        //Parse.enableLocalDatastore(this);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
