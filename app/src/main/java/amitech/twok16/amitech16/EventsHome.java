package amitech.twok16.amitech16;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import amitech.twok16.amitech16.swipecards.FlingCardListener;
import amitech.twok16.amitech16.swipecards.SwipeFlingAdapterView;

public class EventsHome extends AppCompatActivity implements FlingCardListener.ActionDownInterface {

    public static MyAppAdapter myAppAdapter;
    public static ViewHolder viewHolder;
    public String myPoster_Tutorial, myPoster_RepeatMessage;
    //public String myPoster_FunEvents, myPoster_TechnicalEvents, myPoster_CulturalEvents, myPoster_LiteraryEvents;

    private ArrayList<Data> arraylist;
    private SwipeFlingAdapterView flingContainer;
    private Data FunEvents, TechnicalEvents, CulturalEvents, LiteraryEvents;

    public static void removeBackground() {
        viewHolder.background.setVisibility(View.GONE);
        myAppAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);

        ///repeatwarning = "Following cards have been skipped by you. Swipe left to continue viewing them or press the back key to exit this section. ";
        /*myPoster_FunEvents = "";
        myPoster_TechnicalEvents = "";
        myPoster_CulturalEvents = "";
        myPoster_LiteraryEvents = "";*/

        myPoster_Tutorial = "http://amitech16.com/img/app/eventcfirst.png";
        myPoster_RepeatMessage = "http://amitech16.com/img/app/eventclast.png";

        FunEvents = new Data("http://amitech16.com/img/app/eventsfun.png", R.drawable.eventsfun);
        TechnicalEvents = new Data("http://amitech16.com/img/app/eventstechnical.png", R.drawable.eventstechnical);
        CulturalEvents = new Data("http://amitech16.com/img/app/eventscultural.png", R.drawable.eventscultural);
        LiteraryEvents = new Data("http://amitech16.com/img/app/eventsliterary.png", R.drawable.eventsliterary);

        arraylist = new ArrayList<>();
        arraylist.add(new Data(myPoster_Tutorial, R.drawable.eventcfirst));
        arraylist.add(FunEvents);
        arraylist.add(TechnicalEvents);
        arraylist.add(CulturalEvents);
        arraylist.add(LiteraryEvents);
        arraylist.add(new Data(myPoster_RepeatMessage, R.drawable.eventclast));


        myAppAdapter = new MyAppAdapter(arraylist, EventsHome.this);
        flingContainer.setAdapter(myAppAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {

            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //al.add(5, al.0);
                arraylist.add(arraylist.get(0));
                arraylist.remove(0);
                myAppAdapter.notifyDataSetChanged();
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject

            }

            @Override
            public void onRightCardExit(Object dataObject) {

                if (arraylist.get(0).equals(FunEvents)) {
                    startActivity(new Intent(EventsHome.this, FunEvents.class));
                } else if (arraylist.get(0).equals(TechnicalEvents)) {
                    startActivity(new Intent(EventsHome.this, TechnicalEvents.class));
                } else if (arraylist.get(0).equals(CulturalEvents)) {
                    startActivity(new Intent(EventsHome.this, CulturalEvents.class));
                } else if (arraylist.get(0).equals(LiteraryEvents)) {
                    startActivity(new Intent(EventsHome.this, LiteraryEvents.class));
                }

                arraylist.add(arraylist.get(0));
                arraylist.remove(0);

                myAppAdapter.notifyDataSetChanged();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {

            }

            @Override
            public void onScroll(float scrollProgressPercent) {

                View view = flingContainer.getSelectedView();
                view.findViewById(R.id.background).setAlpha(0);
                view.findViewById(R.id.item_swipe_right_indicator).setAlpha(scrollProgressPercent < 0 ? -scrollProgressPercent : 0);
                view.findViewById(R.id.item_swipe_left_indicator).setAlpha(scrollProgressPercent > 0 ? scrollProgressPercent : 0);
            }
        });


        // Optionally add an OnItemClickListener
        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int itemPosition, Object dataObject) {

                View view = flingContainer.getSelectedView();
                view.findViewById(R.id.background).setAlpha(0);

                myAppAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onActionDownPerform() {
        Log.e("action", "bingo");
    }

    public static class ViewHolder {
        public static FrameLayout background;
        //public TextView DataText;
        public ImageView cardImage;

    }

    public class MyAppAdapter extends BaseAdapter {


        public List<Data> parkingList;
        public Context context;

        private MyAppAdapter(List<Data> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;

            if (rowView == null) {

                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.item_swipecard, parent, false);
                // configure view holder
                viewHolder = new ViewHolder();
                //viewHolder.DataText = (TextView) rowView.findViewById(R.id.bookText);
                viewHolder.background = (FrameLayout) rowView.findViewById(R.id.background);
                viewHolder.cardImage = (ImageView) rowView.findViewById(R.id.cardImage);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            //viewHolder.DataText.setText(parkingList.get(position).getDescription() + "");

            //Fetching The images from net using Glide
            Glide.with(EventsHome.this).load(parkingList.get(position).getImagePath()).placeholder(parkingList.get(position).getCardback())
                    .error(parkingList.get(position).getCardback()).into(viewHolder.cardImage);

            return rowView;
        }
    }
}
