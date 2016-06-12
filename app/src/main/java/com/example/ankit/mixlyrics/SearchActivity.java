package com.example.ankit.mixlyrics;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    private int RPP=5;
    ListView resultListView;
    EditText search_input_box;
    ImageView prev_page , next_page;
    ResultListAdapter adapter;
    TextView mCurrentPage , fire_searchBtn;
    private int current_page_number=0, total_page_count=0;
    boolean CanMoveForth=false;
    boolean canMoveBack=false;
    private ArrayList<SearchResult> searchResults;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
//        progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Searching Results ");
//        progressDialog.show();
        search_input_box = (EditText) findViewById(R.id.search_input);
        prev_page = (ImageView) findViewById(R.id.prev_btn);
        next_page = (ImageView) findViewById(R.id.next_btn);
        fire_searchBtn = (TextView) findViewById(R.id.fire_search_btn);
        adapter = new ResultListAdapter(this);
        resultListView = (ListView) findViewById(R.id.search_result_list);
        resultListView.setAdapter(adapter);
        mCurrentPage = (TextView) findViewById(R.id.page_number);

        String search_t = getIntent().getExtras().getString("searchTerm");
        search_input_box.setText(search_t);
        LoadResult(search_t);

        //================================================================//
        //                          OnClickListeners                      //
        //================================================================//

        prev_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(canMoveBack){
                    current_page_number-=1;
                    if(current_page_number>=1){
                        canMoveBack=true;
                        CanMoveForth=true;
                        next_page.setEnabled(true);


                        resetResults(current_page_number);
                        mCurrentPage.setText(current_page_number + "");
                    }else{
                        canMoveBack=false;
                        prev_page.setEnabled(false);
                        current_page_number+=1;
                    }
                }else{
                    prev_page.setEnabled(false);
                }
            }
        });

        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(CanMoveForth){
                    current_page_number+=1;
                    if(current_page_number<=total_page_count){
                        CanMoveForth=true;
                        canMoveBack = true;
                        prev_page.setEnabled(true);
                        resetResults(current_page_number);
                        mCurrentPage.setText(current_page_number+"");
                    }else{
                        CanMoveForth=false;
                        next_page.setEnabled(false);
                        current_page_number-=1;
                    }
                }else{
                    next_page.setEnabled(false);
                }
            }
        });
        
        fire_searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String search_term = search_input_box.getText().toString();
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
            //TODO: set adapter with subset of result
            // page numbers starts from 0
            ArrayList<SearchResult> subSearchResult =  new ArrayList<>();

            int startIndex = (page_number-1)*RPP+1;
            int endIndex = (page_number)*RPP-1;
            int curIndex=startIndex-1;
            while(curIndex<=endIndex && curIndex<searchResults.size()){
                subSearchResult.add(searchResults.get(curIndex++));
            }

            adapter.setResultList(subSearchResult);

    }

    public void LoadResult(String search_term){
        searchResults = new ArrayList<>();
        //TODO:get Results From API
        // parse it and store it in arraylist  searchResults
        // lets have some dummy data of 21

        searchResults.add(new SearchResult(search_term+"1","tesing line 1 \n testing line 2 \n  testing line 3 \n testing line 4\n testing line 5"));
        searchResults.add(new SearchResult(search_term+"2","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"3","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"4","sanam re , \n\ntu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"5","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"6","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"7","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"8","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"9","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"10","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"11","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"12","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"13","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"14","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"15","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"16","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"17","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"18","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"19","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"20","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"21","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"22","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"23","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"24","sanam re , tu mera sanam hua re"));
        searchResults.add(new SearchResult(search_term+"25","sanam re , tu mera sanam hua re"));

        total_page_count= searchResults.size()/RPP;
        int extraa = (searchResults.size()%RPP==0)?0:1;
        total_page_count+=extraa;
        current_page_number=1;
        resetResults(current_page_number);
        mCurrentPage.setText(current_page_number+"");
        CanMoveForth=(total_page_count>=2)?true:false;

    }

}
