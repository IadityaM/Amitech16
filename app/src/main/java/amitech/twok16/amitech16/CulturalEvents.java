package amitech.twok16.amitech16;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class CulturalEvents extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultevents);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(CulturalEvents.this);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterCult rcAdapter = new RecyclerViewAdapterCult(CulturalEvents.this, rowListItem);
        rView.setAdapter(rcAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Wanna Register for Events", Snackbar.LENGTH_LONG)
                        .setAction("Hell Yeah!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(CulturalEvents.this, Register.class));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Kalakaari", "Prizes worth Rs 10,000/-", "11:30 A.M.", "When words fail,expressions say it all! For those who believe in voicing their opinion, we provide the platform to express yourself through Street play", "Main Stage", "D1 |", "Krishan Rai", R.drawable.cult));
        allItems.add(new ItemObject("Fashion Fingers", "Prizes worth Rs 500/-", "12:00 P.M.", "Showcase your ideas of fashion and style by designing an attire that most elegantly represents the given theme", "L-5", "D1 |", "Debaarati Mitra", R.drawable.cult));
        allItems.add(new ItemObject("Alaap & Serenade", "Prizes worth Rs 4000/-", "2:00 P.M.", "Capture the bastion of melody and rhythm in Light Indian and Western Solo Singing. Karaokes not allowed. Max. 2 accompanists. time limit: 5 minutes. ", "Main Stage", "D1 |", "Abhinay joshi,", R.drawable.cult));
        allItems.add(new ItemObject("Mono Acting", "Prizes worth Rs 4,000/-", "2:30 P.M.", "A mono-act event to showcase the hidden actor inside you. Loose your veins and get the actor out", "L-4", "D1 |", "Deepanshu Nagpal", R.drawable.cult));
        allItems.add(new ItemObject("Eargasm", " ", "3:30 P.M.", "The Ultimate Rock Show.Up the ante, and head bang to guitar riffs, piano arpeggios and drum beats to some of the most popular rock songs in existence", "Main Stage", "D1 |", "Arpit Sarkar ", R.drawable.cult));
        allItems.add(new ItemObject("Natraj", "Prizes worth Rs 3,000/-", "10:00 A.M.", " A solo dancing competition to  Groove your body to the beat and let your dance speak the language of your soul.", "Main Stage", "D2 |", "Sandeep Arya", R.drawable.cult));
        allItems.add(new ItemObject("Foot Loose", "Prizes worth Rs 7,000/-", "11:30 A.M.", "If your group has what it takes to Dance with the devil in pale moonlight, then Amitech brings its group dance competition FOOT-LOOSE for you.", "Main Stage", "D2 |", "Chetan Bisht", R.drawable.cult));

        return allItems;
    }

}

