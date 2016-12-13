package amitech.twok16.amitech16;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Sponsors extends AppCompatActivity {

    ImageView sponsors2016;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sponsors2016 = (ImageView) findViewById(R.id.sponsors2k16);

        Glide.with(this).load("http://amitech16.com/img/app/sponsors.png").crossFade(100).placeholder(R.drawable.sponsors).error(R.drawable.sponsors).into(sponsors2016);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(Sponsors.this).load("http://amitech16.com/img/app/sponsors.png").crossFade(100).placeholder(R.drawable.sponsors).error(R.drawable.sponsors).into(sponsors2016);
            }
        });
    }
}
