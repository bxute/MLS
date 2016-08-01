package com.example.ankit.mixlyrics;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SearchActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    private int RPP=10;
    ListView resultListView;
    EditText search_input_box;
    ResultListAdapter adapter;
    TextView mCurrentPage;
    ImageView fire_searchBtn;
    private int current_page_number=0, total_page_count=0;
    boolean CanMoveForth=false;
    boolean canMoveBack=false;
    private ArrayList<Search_resultsModel> searchResults;
    String search_t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Getting Results");
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();
        search_input_box = (EditText) findViewById(R.id.search_input);
        fire_searchBtn = (ImageView) findViewById(R.id.fire_search_btn);
        adapter = new ResultListAdapter(this);
        resultListView = (ListView) findViewById(R.id.search_result_list);
        resultListView.setAdapter(adapter);
        mCurrentPage = (TextView) findViewById(R.id.page_number);

        search_t = getIntent().getExtras().getString("searchTerm");
        search_input_box.setText(search_t);
        search_input_box.setOnEditorActionListener(
                new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if(i == EditorInfo.IME_ACTION_SEARCH) {
                            String search_term = search_input_box.getText().toString();
                            progressDialog.show();
                            LoadResult(search_term);
                            return true;
                        }
                        return false;
                    }
                }
        );
        LoadResult(search_t);

        //================================================================//
        //                          OnClickListeners                      //
        //================================================================//
        fire_searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String search_term = search_input_box.getText().toString();
                progressDialog.show();
                LoadResult(search_term);
            }
        });

        search_input_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Log.e("edit box focus",""+b);
            }
        });
    }

    private void resetResults(int page_number) {

            // page numbers starts from 0
            ArrayList<Search_resultsModel> subSearchResult =  new ArrayList<>();

            int startIndex = (page_number-1)*RPP+1;
            int endIndex = (page_number)*RPP-1;
            int curIndex=startIndex-1;
            while(curIndex<=endIndex && curIndex<searchResults.size()){
                subSearchResult.add(searchResults.get(curIndex++));
            }

            adapter.setResultList(subSearchResult, search_t);

    }

    public void LoadResult(final String search_term){
        searchResults = new ArrayList<>();

        FetchRemoteData(search_term, 0, 100);
        // here we load 1 page data and others in thread
 //TODO:uncomment it       FetchRemoteData(search_term , 1 ,10);

        // loading more list in background
// TODO:uncomment this part
//        new Handler().post(new Runnable() {
//            @Override
//            public void run() {
//                int count = 10;
//                while(count >2){
//                    FetchRemoteData(search_term,12-count,10);
//                    count--;
//                }
//            }
//        });

    }


    public void FetchRemoteData(final String search_term , final int page_number , final int result_count){

        //TODO: change url to your own server
        String url = Config.URl +
                "api?search_param=" + URLEncoder.encode(search_term) +
                "&page=" + URLEncoder.encode(String.valueOf(page_number)) +
                "&number=" + URLEncoder.encode(String.valueOf(result_count));
        StringRequest search_req = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Log.e("SA [RF] ", s);
                        ParseResults(s);
                        progressDialog.dismiss();
                                            }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Log.e("Volley Error",volleyError.toString());
                        Snackbar.make(resultListView, "Some error occurred.", Snackbar.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }
                }
        );
        search_req.setRetryPolicy(new DefaultRetryPolicy(1000, 5, 0));
        AppManager.getInstance().addToRequestQueue(search_req, "tag", SearchActivity.this);

    }

    public void ParseResults(String response){

        RootModel rootModel = null;
        RootModelParser parser = new RootModelParser();
        rootModel = parser.parseRootModel(response);
        searchResults = new ArrayList<>();
        //appending results list
        for(int i = 0 ;i<rootModel.search_results.size();i++){
            searchResults.add(rootModel.search_results.get(i));
        }
        adapter.setResultList(searchResults, search_t);
    }

}
