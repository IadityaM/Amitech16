package amitech.twok16.amitech16;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by anjali on 21-03-2016.
 */
public class RecyclerViewAdapterLit extends RecyclerView.Adapter<RecyclerViewHolders> {

    //holder.eventback.setImageResource(itemList.get(position).getPhoto());
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerViewHolders vholder = (RecyclerViewHolders) view.getTag();
            int position = vholder.getPosition();
            Intent dialIntent = new Intent();
            dialIntent.setAction(Intent.ACTION_DIAL);
            if (position == 0) {
                //Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 97168 12719"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 1) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 8588971550"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 2) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 8377815808"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 3) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 8285860911"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 4) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 9971597759"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 5) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 8800911955"));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 6) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 9582608084 "));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 7) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 9990207897 "));
                view.getContext().startActivity(dialIntent);

            }

            if (position == 8) {
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel: +91 9990139461 "));
                view.getContext().startActivity(dialIntent);

            }


        }
    };
    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapterLit(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.eventname.setText(itemList.get(position).getEname());
        holder.event_org.setText(itemList.get(position).getEvent_org());
        holder.cardBack.setImageResource(itemList.get(position).getCardback());
        holder.day.setText(itemList.get(position).getEday());
        holder.eventtime.setText(itemList.get(position).getEtime());
        holder.eventdesc.setText(itemList.get(position).getEdesc());
        holder.eventvenue.setText(itemList.get(position).getEvenue());
        holder.eventday.setText(itemList.get(position).getEeday());

        holder.org_icon.setOnClickListener(clickListener);
        holder.org_icon.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}