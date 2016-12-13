package amitech.twok16.amitech16;

import android.content.Intent;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactUS extends AppCompatActivity {

    Button gotoWebsite, gotoTransport;
    ImageButton callPres, callVPres, callCGM, callDF, callSec, callJsec, callDC, callDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Wanna leave a message?", Snackbar.LENGTH_SHORT).setAction("YES!", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Email = new Intent(Intent.ACTION_SEND);
                        Email.setType("text/email");
                        Email.putExtra(Intent.EXTRA_EMAIL,
                                new String[]{"amitech2k16@gmail.com"});  //developer 's email
                        Email.putExtra(Intent.EXTRA_SUBJECT,
                                "Query Regarding Amitech 2016 "); // Email 's Subject
                        Email.putExtra(Intent.EXTRA_TEXT, " Write your message " + "");  //Email 's Greeting text
                        startActivity(Intent.createChooser(Email, "Send Query or Feedback:"));
                    }
                }).show();
            }


        });

        gotoTransport = (Button) findViewById(R.id.gotoTransport);
        gotoWebsite = (Button) findViewById(R.id.gotoWebsite);
        callPres = (ImageButton) findViewById(R.id.PresCall);
        callVPres = (ImageButton) findViewById(R.id.VpresCall);
        callCGM = (ImageButton)findViewById(R.id.CGMCall);
        callDF = (ImageButton)findViewById(R.id.DFCall);
        callSec = (ImageButton)findViewById(R.id.SecCall);
        callJsec = (ImageButton)findViewById(R.id.JSecCall);
        callDC = (ImageButton)findViewById(R.id.DCCall);
        callDT = (ImageButton)findViewById(R.id.DTCall);


        gotoWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactUS.this, Website.class));
            }
        });

        gotoTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactUS.this, Transport.class));
            }
        });

        callPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 95606 83618"));
                startActivity(dialIntent);
            }
        });

        callVPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 99688 72607"));
                startActivity(dialIntent);
            }
        });

        callCGM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 98683 67210"));
                startActivity(dialIntent);
            }
        });

        callDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 82856 76670"));
                startActivity(dialIntent);
            }
        });

        callSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 99101 37571"));
                startActivity(dialIntent);
            }
        });

        callJsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 85879 11745"));
                startActivity(dialIntent);
            }
        });

        callDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 85270 65603"));
                startActivity(dialIntent);
            }
        });

        callDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 98994 30890"));
                startActivity(dialIntent);
            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
