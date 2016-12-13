package amitech.twok16.amitech16;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    // Set Duration of the Splash Screen(in milisecs)
    //long Delay = 4000;
    //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    //SharedPreferences prefs = getApplicationContext().getSharedPreferences("MyPref", 0);
    //SharedPreferences.Editor editor = prefs.edit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        // Create a Timer
        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {

                // Start MainActivity.class
                // Intent splashToOnboarding = new Intent(Splash.this, OnBoard.class);
                // startActivity(splashToOnboarding);
                 startActivity(new Intent(Splash.this, Home.class));
                // Close SplashScreenActivity.class
                finish();

                /*SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
                if(!prefs.getBoolean("firstTime", false)) {
                    // run your one time code
                    Intent splashToOnboarding = new Intent(Splash.this, OnBoard.class);
                    StartActivity(splashToOnboarding);
                    startActivity(new Intent(Splash.this, OnBoard.class));

                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putBoolean("firstTime", true);
                    editor.commit();
                }
                else{
                    Intent splashToHome = new Intent(Splash.this, Home.class);
                    startActivity(splashToHome);
                    startActivity(new Intent(Splash.this, Home.class));
                }*/

                /*if (prefs.getBoolean("isInitialAppLaunch", false))
                {
                    //Intent splashToHome = new Intent(Splash.this, Home.class);
                    //startActivity(splashToHome);
                    startActivity(new Intent(Splash.this, Home.class));
                }
                else
                {
                    //First Time App launched, you are putting isInitialAppLaunch to false and calling create password activity.
                    editor.putBoolean("isInitialAppLaunch", false);

                    //Intent splashToOnboarding = new Intent(Splash.this, OnBoard.class);
                    //startActivity(splashToOnboarding);
                    startActivity(new Intent(Splash.this, OnBoard.class));
                }*/

            }
        };

        // Start the timer
        // Set Duration of the Splash Screen(in milisecs)
        RunSplash.schedule(ShowSplash, 2000);
    }
}
