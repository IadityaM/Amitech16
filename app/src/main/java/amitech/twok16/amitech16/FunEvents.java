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

public class FunEvents extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultevents);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(FunEvents.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapterFun rcAdapter = new RecyclerViewAdapterFun(FunEvents.this, rowListItem);
        rView.setAdapter(rcAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Wanna Register for Events", Snackbar.LENGTH_LONG)
                        .setAction("Hell Yeah!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(FunEvents.this, Register.class));
                            }
                        }).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Stupid Cupid", "A token of love","11:30 A.M.","One rose is worth a thousand words. Aset brings you an opportunity to express your feelings and emotions through roses and bouquets. ","Canteen","D1 |","Dey Anand",R.drawable.fun));
        allItems.add(new ItemObject("Tambola", "Prizes worth Rs 500/-","11:30 A.M."," Try your luck at Tambola and get a chance to become the ultimate Tambola champion","L-7","D1 |","Barkha Lomor",R.drawable.fun));
        allItems.add(new ItemObject("Beg Borrow Steal", "Prizes worth Rs 500/-","11:30 A.M.","Think you are the biggest Go Getter. Particiapte in pairs and prove yourself by getting the items mentioned in the list by hook or by crook.","L-3","D1 |","Ramanuj",R.drawable.fun));
        allItems.add(new ItemObject("Arm Wrestling & Push Ups", "Prizes worth Rs 500/-","11:30 A.M.","Gymming, Workouts, Diets and all, Who's the strongest of'em all?","Canteen","D1 |","Deepanshu Kakkar",R.drawable.fun));
        allItems.add(new ItemObject("Ring To Grab", "Win Exciting goodies","12:00 P.M.","Perfect chance to show your throwing skills and take home some exciting goodies.","Canteen","D1 |","Mansi Dhingra",R.drawable.fun));
        allItems.add(new ItemObject("Lock Knock", "Prizes worth Rs 500/-","12:30 P.M.","Partcipate in pairs and try your luck in Lock Knock. Simply match the keys with their locks and win exciting prizes. ","L-10","D1 |","Sheetal Phalswal",R.drawable.fun));
        allItems.add(new ItemObject("Table Tennis", "Prizes worth Rs 500/-","12:30 P.M.","An opportunity to become Aset's Table Tennis star","Basement","D1 |","Surjeet",R.drawable.fun));
        allItems.add(new ItemObject("Paper Dance", "Prizes worth Rs 500/-", "2:00 P.M.", "Dance to the beats and prove your mettle, that you and your partner are the best in maintaining balance ", "T-1", "D1 |", "Archana Sharma",R.drawable.fun));
        allItems.add(new ItemObject("Touch Me Not", "Prizes worth Rs 500/-", "11:00 A.M.", "Chance to show your finesse by passing a metal ring through a looped wire, without touching it", "Canteen", "D2 |", "Ayushi Thakur",R.drawable.fun));
        allItems.add(new ItemObject("Stupid Cupid", "A token of love", "11:00 A.M.", "One rose is worth a thousand words. Aset brings you an opportunity to express your feelings and emotions through roses and bouquets. ", "Canteen", "D2 |", "Dey Anand",R.drawable.fun));
        allItems.add(new ItemObject("Auto Charades","Prizes worth Rs 1750/-","11:00 A.M.","Much like the conventional Dumb Charades,this game, Auto Charades involves enactment of the various automotive parts","L-10","D2 |"," Uday Singhal",R.drawable.fun ));
        allItems.add(new ItemObject("Mind Games", " Prizes worth Rs 1750/- ", "11:30 A.M.", "A one on one Chess game. Use your minds to the fullest as every move you make counts.", "L-2", "D2 |", "Manjit singh",R.drawable.fun));
        allItems.add(new ItemObject("Best Out Of Waste", "Prizes worth Rs 1,000/-", "12:30 P.M.", "This event brings you the opportunity to re-invent green by utilizing your creativity and bringing out sheer brilliance with recyclable articles provided", "Mechanical Lab", "D2 |", "Manish Pandey",R.drawable.fun));
        allItems.add(new ItemObject("Carrom", "Prizes worth Rs 500/-", "12:30 P.M.", "A general carrom event to bring out the hidden child inside you. Loose your veins and play your heart out", "L-5", "D2 |", "Karan Choudhary",R.drawable.fun));
        allItems.add(new ItemObject("MR & MS AMITECH", "Win exciting goodies", "1:00 P.M.", "It brings you the opportunity to reach out to the vast community of youth, with the goal of becoming the ultimate style icon. ", "Main Stage", "D2 |", "Saarthak Kharbanda",R.drawable.fun));


        return allItems;
    }

}
