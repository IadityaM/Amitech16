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

public class TechnicalEvents extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultevents);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(TechnicalEvents.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterTech rcAdapter = new RecyclerViewAdapterTech(TechnicalEvents.this, rowListItem);
        rView.setAdapter(rcAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Wanna Register for Events?", Snackbar.LENGTH_LONG)
                        .setAction("Hell Yeah!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(TechnicalEvents.this, Register.class));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Swish 'N' Click", "Prizes worth Rs 20,000/-", "11:30 A.M.", "If you think you have the talent to capture the world with your lens then come, register for ASET's photography event", "L-8", "D1 |", "Aryan Juneja",R.drawable.tech));
        allItems.add(new ItemObject("Counter Strike", "Prizes worth Rs 2500/-", "11:30 P.M.", "Fancy yourself the Ultimate FPS mogul? Here's a chance to test your claim and earn the bragging rights!", "L-15", "D1 |", "Harsh Srivastava",R.drawable.tech));
        allItems.add(new ItemObject("FIFA", "Prizes worth Rs 1000/-", "11:30 P.M.", "On-Screen Football entertainment not enough for you? Come to Amitech and clash with the best in the business!", "L-15", "D1 |", "Pratik Rana",R.drawable.tech));
        allItems.add(new ItemObject("NFS", "Prizes worth Rs 1000/-", "11:30 P.M.", "The twists and turns of life can't get your blood pumping? Come try your hands at the exhilirating races and become the most wanted!", "L-15", "D1 |", "Navneet Singh",R.drawable.tech));
        allItems.add(new ItemObject("Mini Militia", "Prizes worth Rs 500/-", "11:30 P.M.", "Do you tire of the endless RPGs and FPSs? Come and try the latest in competitive gaming filled with jetpacks and explosive awesomeness.", "L-15", "D1 |", "Vikas Sangwan",R.drawable.tech));
        allItems.add(new ItemObject("Code Sense","Prizes worth Rs 2,500/-","11:30 A.M.","Climb the ranks of the best coders in town and claim the bragging rights, not to forget the small fortune you get to make.","Lab 1,2,3", "D1 |","Aman Budhraja",R.drawable.tech));
        allItems.add(new ItemObject("Millionaire", " Prizes worth Rs 500/- ", "11:30 A.M.", "A unique quiz to test your quizzing capabilities as well as bidding capabilities", "L-4", "D1 |", "Ashish Rajan",R.drawable.tech));
        allItems.add(new ItemObject("TeQuisitive", "Prizes worth Rs 1,500/-", "12:00 P.M.", "If you are drenched with trivia and at par with every minute detail of technical world, then here is an exciting chance to showcase your quizzing talent", "Seminar Hall", "D1 |", "Ashish Kumar Singh",R.drawable.tech));
        allItems.add(new ItemObject("Build the Bridge", "Prizes worth Rs 1500/-", "2:00 P.M.", "Employ your engineering skills and establish a structure with materials of scrap. The bridge that stands tall to the maximum weight prevails victorious.", "Mechanical Lab", "D1 |", "Karishma Khanna",R.drawable.tech));
        allItems.add(new ItemObject("EcoPreneur","Prizes worth Rs 1,000/-", "12:30 P.M.","Becoming an entrepreneur is a dream for all, but a Green B-Plan is what one needs now, for the world to take notice. Team Strength:2","L-6","D2 |","Astha Mishra",R.drawable.tech));

        return allItems;
    }

}
