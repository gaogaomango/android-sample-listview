package jp.co.mo.listviewsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private List<AdapterItem> mListViewList;
    private TicketAdapter mListViewTicketAdapter;

    private List<AdapterItem> mGridViewList;
    private TicketAdapter mGridViewTicketAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        // ListView
        ListView listView = findViewById(R.id.listView);
        mListViewList = new ArrayList<>();
        for(int i = 1; i < 5; i++) {
            mListViewList.add(new AdapterItem(R.drawable.ic_launcher_foreground, "developer: " + String.valueOf(i), "develop app: " + String.valueOf(i)));
        }
        mListViewTicketAdapter = new TicketAdapter(this, mListViewList);
        listView.setAdapter(mListViewTicketAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                final AdapterItem item = list.get(position);
                Toast.makeText(mContext, "job title: " + ((TextView)view.findViewById(R.id.jobTitle)).getText(), Toast.LENGTH_LONG).show();
            }
        });

        // GridView
        GridView gridView = findViewById(R.id.gridView);
        mGridViewList = new ArrayList<>();
        for(int i = 1; i < 5; i++) {
            mGridViewList.add(new AdapterItem(R.drawable.ic_launcher_foreground, "developer: " + String.valueOf(i), "develop app: " + String.valueOf(i)));
        }
        mGridViewTicketAdapter = new TicketAdapter(this, mGridViewList);
        gridView.setAdapter(mGridViewTicketAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                final AdapterItem item = list.get(position);
                Toast.makeText(mContext, "job title: " + ((TextView)view.findViewById(R.id.jobTitle)).getText(), Toast.LENGTH_LONG).show();
            }
        });


    }

    public void addNewList(View view) {
        mListViewList.add(new AdapterItem(R.drawable.ic_launcher_foreground, "new developer", "new develop app"));
        mListViewTicketAdapter.notifyDataSetChanged();
    }

    public void addNewGrid(View view) {
        mGridViewList.add(new AdapterItem(R.drawable.ic_launcher_foreground, "new developer", "new develop app"));
        mGridViewTicketAdapter.notifyDataSetChanged();
    }

}
