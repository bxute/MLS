package com.example.ankit.mixlyrics;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ankit on 6/9/2016.
 */
public class ResultListAdapter extends ArrayAdapter<Search_resultsModel> {

    private Context context;
    ArrayList<Search_resultsModel> results;
    public ResultListAdapter(Context context) {
        super(context, 0 );
        this.context = context;
        this.results = new ArrayList<>();
    }

    public void AddResult(Search_resultsModel result){
        results.add(result);
        notifyDataSetChanged();
    }

    public void setResultList(ArrayList<Search_resultsModel> results){
        this.results = results;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int pos , View view ,  ViewGroup parent){
        View temp_view = view;
        if(temp_view==null){
            temp_view = LayoutInflater.from(context).inflate(R.layout.result_item_template,null);
        }
        TextView song_title = (TextView) temp_view.findViewById(R.id.song_title);
        TextView song_url = (TextView) temp_view.findViewById(R.id.song_link);
        TextView lyrics_snip = (TextView) temp_view.findViewById(R.id.popping_lyrics);
        TextView movie = (TextView) temp_view.findViewById(R.id.movie);
        TextView lyricist = (TextView) temp_view.findViewById(R.id.lyricist);
        TextView singers = (TextView) temp_view.findViewById(R.id.singers);

        song_title.setText(results.get(pos).song);
        song_url.setText(results.get(pos).start_url+results.get(pos).song_url);
        lyrics_snip.setText(results.get(pos).lyrics);
        movie.setText(results.get(pos).movie);
        lyricist.setText(results.get(pos).lyricist);
        singers.setText(results.get(pos).singers);


        return temp_view;
    }

    @Override
    public int getCount() {
        return results.size();
    }


}
