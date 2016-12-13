package amitech.twok16.amitech16;



/**
 * Created by anjali on 21-03-2016.
 */

import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;



public class RecyclerViewHolders extends RecyclerView.ViewHolder {
    public int pos;
    // public TextView countryName;
    public ImageView cardBack;
    public TextView eventtime;
    public TextView day;
    public TextView eventday;
    public TextView eventname;
    public TextView eventdesc;
    public TextView eventvenue;
    public ImageButton org_icon;
    public TextView event_org;
    //public ImageButton imgbtn;


    public RecyclerViewHolders(View itemView) {
        super(itemView);
        //itemView.setOnClickListener(this);
        //countryName = (TextView)itemView.findViewById(R.id.country_name);
        cardBack = (ImageView)itemView.findViewById(R.id.Card_Back);
        eventname = (TextView)itemView.findViewById(R.id.Event_Name);
        day = (TextView)itemView.findViewById(R.id.Day);
        eventtime = (TextView)itemView.findViewById(R.id.Event_Time);
        eventdesc = (TextView)itemView.findViewById(R.id.Event_Desc);
        eventvenue = (TextView)itemView.findViewById(R.id.Event_Venue);
        eventday = (TextView)itemView.findViewById(R.id.Event_Day);
        org_icon = (ImageButton)itemView.findViewById(R.id.Organiser_icon);
        event_org = (TextView)itemView.findViewById(R.id.Event_Organiser);
        //imgbtn = (ImageButton)itemView.findViewById(R.id.Organiser_icon);

    }

    /*@Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT);
        pos = Toast.LENGTH_SHORT;


    }*/

}

