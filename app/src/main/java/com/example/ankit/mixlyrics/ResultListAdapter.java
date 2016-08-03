package com.example.ankit.mixlyrics;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by Ankit on 6/9/2016.
 */
public class ResultListAdapter extends ArrayAdapter<Search_resultsModel> {

    private Context context;
    private String search_term;
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

    public void setResultList(ArrayList<Search_resultsModel> results, String term){
        this.results = results;
        this.search_term = term;
        notifyDataSetChanged();
    }

    @Override
    public View getView(final int pos , View view ,  ViewGroup parent){
        View temp_view = view;
        if(temp_view==null){
            temp_view = LayoutInflater.from(context).inflate(R.layout.result_item_template,null);
        }
        temp_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String ids = "";
                        for(Search_resultsModel model : results) {
                            ids = ids + model.id + ",";
                        }

                        String url = Config.getIP() +
                                "redir?param=" + URLEncoder.encode(search_term) +
                                "&ids_presented=" + ids +
                                "&page=0&number=100" +
                                "&id=" + results.get(pos).id +
                                "&redirect_url=\"\""
                                ;

                        final ProgressDialog dial = new ProgressDialog(context);
                        dial.setIndeterminate(true);
                        dial.setCancelable(false);
                        dial.setMessage("Please wait...");
                        dial.show();

                        StringRequest resp_report = new StringRequest(
                                Request.Method.GET,
                                url,
                                new Response.Listener<String>() {
                                    @Override
                                    public void onResponse(String s) {
                                        dial.dismiss();
                                        Bundle pass = new Bundle();
                                        pass.putString("url", results.get(pos).start_url + results.get(pos).song_url);
                                        Intent i = new Intent(context, WebBrowserHelper.class);
                                        i.putExtras(pass);
                                        context.startActivity(i);
                                    }
                                },
                                new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError volleyError) {
                                        dial.dismiss();
                                    }
                                }
                        );

                        AppManager.getInstance().addToRequestQueue(resp_report, "response", context);
                    }
                }
        );
        TextView song_title = (TextView) temp_view.findViewById(R.id.song_title);
        TextView song_url = (TextView) temp_view.findViewById(R.id.song_link);
        TextView lyrics_snip = (TextView) temp_view.findViewById(R.id.popping_lyrics);
        TextView movie = (TextView) temp_view.findViewById(R.id.movie);
        TextView lyricist = (TextView) temp_view.findViewById(R.id.lyricist);
        TextView singers = (TextView) temp_view.findViewById(R.id.singers);

        song_title.setText(results.get(pos).song);
        song_url.setText(results.get(pos).start_url+results.get(pos).song_url);
        lyrics_snip.setText(results.get(pos).lyrics.trim());
        movie.setText(results.get(pos).movie);
        lyricist.setText(
                results.get(pos).lyricist
                        .replace("[", "")
                        .replace("]", "")
                        .replace("'", "")
        );
        singers.setText(results.get(pos).singers
                        .replace("[", "")
                        .replace("]", "")
                        .replace("'", "")
        );
        return temp_view;
    }

    @Override
    public int getCount() {
        return results.size();
    }
}
