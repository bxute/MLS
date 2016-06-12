package com.example.ankit.mixlyrics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ankit on 6/9/2016.
 */
public class ResultListAdapter extends ArrayAdapter<SearchResult> {

    private Context context;
    ArrayList<SearchResult> results;
    public ResultListAdapter(Context context) {
        super(context, 0 );
        this.context = context;
        this.results = new ArrayList<>();
    }

    public void AddResult(SearchResult result){
        results.add(result);
        notifyDataSetChanged();
    }

    public void setResultList(ArrayList<SearchResult> results){
        this.results = results;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int pos , View view ,  ViewGroup parent){
        View temp_view = view;
        if(temp_view==null){
            temp_view = LayoutInflater.from(context).inflate(R.layout.search_item_template,null);
        }
        TextView title = (TextView) temp_view.findViewById(R.id.search_result_title);
        TextView subtext = (TextView) temp_view.findViewById(R.id.search_result_subtext);

        title.setText(results.get(pos).Title);
        subtext.setText(results.get(pos).SubText);


        return temp_view;
    }

    @Override
    public int getCount() {

        return results.size();
    }


}
