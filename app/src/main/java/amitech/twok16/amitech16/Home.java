package amitech.twok16.amitech16;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button home_button_amitechlogo, home_button_events, home_button_contactus, home_button_schedule,
            home_button_team, home_button_transport, home_button_sponsors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final SharedPreferences onBoardPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);

        //One time run code part 1, part 2 in OnBoard.class
        if(!onBoardPreferences.getBoolean("onboarding_complete",false)){

            //Intent onboarding = new Intent(this, OnBoard.class);
            //startActivity(onboarding);
            startActivity(new Intent(this, OnBoard.class));

            finish();
            return;
        }

        home_button_amitechlogo = (Button) findViewById(R.id.home_button_amitechlogo);
        home_button_events = (Button) findViewById(R.id.home_button_events);
        home_button_sponsors = (Button) findViewById(R.id.home_button_sponsors);
        home_button_schedule = (Button) findViewById(R.id.home_button_schedule);
        home_button_team = (Button) findViewById(R.id.home_button_team);
        home_button_transport = (Button) findViewById(R.id.home_button_favourites);
        home_button_contactus = (Button) findViewById(R.id.home_button_contactus);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Like our App? Rate us here!", Snackbar.LENGTH_LONG)
                        .setAction("Rate!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                btnRateAppOnClick(v);
                            }
                        }).show();
            }
        });



        home_button_amitechlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBoardPreferences.edit().putBoolean("onboarding_complete", false).apply();
            }
        });
        home_button_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent splashToOnboarding = new Intent(Splash.this, OnBoard.class);
                // startActivity(splashToOnboarding);
                startActivity(new Intent(Home.this, EventsHome.class));
            }
        });
        home_button_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Team.class));
            }
        });
        home_button_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Schedule.class));
            }
        });
        home_button_sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Sponsors.class));
            }
        });
        home_button_contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, ContactUS.class));
            }
        });
        home_button_transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Transport.class));
            }
        });

    }
    private boolean MyStartActivity(Intent aIntent) {
        try
        {
            startActivity(aIntent);
            return true;
        }
        catch (ActivityNotFoundException e)
        {
            return false;
        }
    }

    //On click event for rate this app button
    public void btnRateAppOnClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        //Try Google play
        intent.setData(Uri.parse("market://details?id=amitech.twok16.amitech16"));
        if (!MyStartActivity(intent)) {
            //Market (Google play) app seems not installed, let's try to open a webbrowser
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=amitech.twok16.amitech16"));
            if (!MyStartActivity(intent)) {
                //Well if this also fails, we have run out of options, inform the user.
                Toast.makeText(this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
