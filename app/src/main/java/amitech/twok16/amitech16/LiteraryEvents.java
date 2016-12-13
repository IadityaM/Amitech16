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

public class LiteraryEvents extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultevents);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(LiteraryEvents.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterLit rcAdapter = new RecyclerViewAdapterLit(LiteraryEvents.this, rowListItem);
        rView.setAdapter(rcAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Wanna Register for Events", Snackbar.LENGTH_LONG)
                        .setAction("Hell Yeah!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(LiteraryEvents.this, Register.class));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();

        allItems.add(new ItemObject("Ad Mad","Prizes worth Rs 1000/-","12:00 P.M.","Prepare an Ad on the spot with your team(size 2-3) and get your madness appreciated","L-6","D1 |","Himanshu Singh",R.drawable.lit));
        allItems.add(new ItemObject("You Me Mad", "Prizes worth Rs 500/-", "12:30 P.M.", " Team of 2, One will draw and the other will guess. Sounds simple enough!!  ", "L-2", "D1 |", "Kanika Gulati",R.drawable.lit));
        allItems.add(new ItemObject("Semantic Sherlock", "Prizes worth Rs 700/-", "1:30 P.M.", " Find words in grid of alphabets and become the Sherlock of semantics..", "L-1", "D1 |", "Ashutosh Verma",R.drawable.lit));
        allItems.add(new ItemObject("Auto Quiz", "Prizes worth Rs 1,750/-", "3:00 P.M.", "Show your prowess by partcipating in Auto Quiz-an automobile quiz and be the Karl Benz of ASET", "Seminar Hall", "D1 |", "Sunil Pal",R.drawable.lit));
        allItems.add(new ItemObject("Power to Her","Prizes worth Rs 2500/-","11:00 A.M.","ASET brings you a chance to express yourself on women-centric issues, topic given on the spot.","L-4", "D2 |","Kirti Sengar",R.drawable.lit));
        allItems.add(new ItemObject("Rumble Jumble", "Prizes worth Rs 750/-", "11:30 A.M.", "Come 2 or come 3 and test your wisdom as you rearrange the quotes.", "L-7", "D2 |", " Sugandha Gupta",R.drawable.lit));
        allItems.add(new ItemObject("Rhyme In", " Prizes worth Rs 500/- ", "12:00 P.M.", "Rhyme in to harness the power of art and find the poet within !!", "L-1", "D2 |", "Ashish Dhamija",R.drawable.lit));
        allItems.add(new ItemObject("Logo Quiz", "Prizes worth Rs 500/-", "12:30 P.M.", "A picture is worth a thousand words. Participate in pair and test your skill of identifying logos", "L-9", "D2 |", "Bhavika Verma",R.drawable.lit));
        allItems.add(new ItemObject("MetroNome", "Prizes worth Rs 500/-", "12:30 P.M.", "The Music Quiz. Official Amitech hunt for the Music Maestro", "L-3", "D2 |", "Anshu Mishra",R.drawable.lit));
        return allItems;
    }

}
