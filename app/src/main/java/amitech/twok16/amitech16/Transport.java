package amitech.twok16.amitech16;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Transport extends FragmentActivity implements OnMapReadyCallback{
    //extends FragmentActivity implements OnMapReadyCallback {
    //private GoogleMap mMap;


    GoogleMapOptions options = new GoogleMapOptions();
    float zoomLevel = 16.0f; //This goes up to 21
    private GoogleMap mMap;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton callTransDir, callTransMan;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        callTransMan = (ImageButton)findViewById(R.id.callTransMan);
        callTransDir = (ImageButton)findViewById(R.id.callTranDir);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Prefer a Google Earth View?", Snackbar.LENGTH_LONG)
                        .setAction("Yes Please!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(Transport.this, MapsActivity.class));
                            }
                        }).show();
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);

        callTransDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 98189 64499"));
                startActivity(dialIntent);
            }
        });

        callTransMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 97185 35650"));
                startActivity(dialIntent);
            }
        });




        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);*/
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker at ASET and move the camera
        LatLng aset = new LatLng(28.53188292, 77.05905982);
        //LatLng aset = new LatLng(28.531942, 77.059392);
        mMap.addMarker(new MarkerOptions().position(aset).title("ASET"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aset));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(aset, zoomLevel));

        //if(ContextCompat.checkSelfPermission(this, ))

        /*if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            // Show rationale and request permission.
        }*/


        options.mapType(GoogleMap.MAP_TYPE_NORMAL)
                .compassEnabled(true)
                .zoomGesturesEnabled(true)
                .rotateGesturesEnabled(true)
                .tiltGesturesEnabled(false);
    }
}
