package jp.co.mo.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TicketAdapter extends BaseAdapter {

    private Context mContext;
    private List<AdapterItem> mListNewDataAdapter;

    public TicketAdapter(Context context, List<AdapterItem> listNewDataAdapter) {
        this.mContext = context;
        this.mListNewDataAdapter = listNewDataAdapter;
    }

    @Override
    public int getCount() {
        return mListNewDataAdapter.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.layout_ticket, null);
        final AdapterItem adapterItems = mListNewDataAdapter.get(position);

        ImageView ticketImg = view.findViewById(R.id.ticektImg);
        ticketImg.setImageResource(adapterItems.getId());

        TextView jobTitle = (TextView) view.findViewById(R.id.jobTitle);
        jobTitle.setText(adapterItems.getJobTitle());

        TextView jobDescription = (TextView) view.findViewById(R.id.jobDescription);
        jobDescription.setText(adapterItems.getDescription());

        return view;

    }
}
