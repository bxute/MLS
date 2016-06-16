package com.example.ankit.mixlyrics;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SearchActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    private int RPP=10;
    ListView resultListView;
    EditText search_input_box;
    ImageView prev_page , next_page;
    ResultListAdapter adapter;
    TextView mCurrentPage , fire_searchBtn;
    private int current_page_number=0, total_page_count=0;
    boolean CanMoveForth=false;
    boolean canMoveBack=false;
    private ArrayList<Search_resultsModel> searchResults;
    
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

            // page numbers starts from 0
            ArrayList<Search_resultsModel> subSearchResult =  new ArrayList<>();

            int startIndex = (page_number-1)*RPP+1;
            int endIndex = (page_number)*RPP-1;
            int curIndex=startIndex-1;
            while(curIndex<=endIndex && curIndex<searchResults.size()){
                subSearchResult.add(searchResults.get(curIndex++));
            }

            adapter.setResultList(subSearchResult);

    }

    public void LoadResult(final String search_term){
        searchResults = new ArrayList<>();


        //==========================================//
        //                 TEST ZONE                //
        //==========================================//


        String response = "{ \"status\":\"0\"," +
                            "\"error_message\":\"No\"," +
                            "\"search_parameter\":\"sanam re\"," +
                            "\"page\":\"1\"," +
                            "\"number\":\"10\"," +
                            "\"search_results\":[" +

                                "{" +
                                    "\"id\":\"1\"," +
                                    "\"song\":\"Sanam Re \"," +
                                    "\"song_url\":\"/sanam-re\"," +
                                    "\"movie\":\"Sanam Re\"," +
                                    "\"movie_url\":\"www.movie-box.com/sanam-re\"," +
                                    "\"start_url\":\"www.mxlyrics.com\"," +
                                    "\"lyrics\":\"sanam re tu mera sanam hua re. bhigi bhigi sadkon pe tera hi naam likhun.tujhko jo na dekhun khud se hi baat karun  khud jo kho diya hun\"," +
                                    "\"singers\":\"Arjit Singh  Ankit Kumar\"," +
                                    "\"director\":\"Ankit Kumar\"," +
                                    "\"lyricist\":\"Javed Akhtar Ankit Kumar\""+
                                "}," +

                                "{" +
                                "\"id\":\"1\"," +
                                "\"song\":\"Sanam Re \"," +
                                "\"song_url\":\"/sanam-re\"," +
                                "\"movie\":\"Sanam Re\"," +
                                "\"movie_url\":\"www.movie-box.com/sanam-re\"," +
                                "\"start_url\":\"www.mxlyrics.com\"," +
                                "\"lyrics\":\"sanam re tu mera sanam hua re. bhigi bhigi sadkon pe tera hi naam likhun.tujhko jo na dekhun khud se hi baat karun  khud jo kho diya hun\"," +
                                "\"singers\":\"Arjit Singh  Ankit Kumar\"," +
                                "\"director\":\"Ankit Kumar\"," +
                                "\"lyricist\":\"Javed Akhtar Ankit Kumar\""+
                                "}," +

                                "{" +
                                "\"id\":\"1\"," +
                                "\"song\":\"Sanam Re \"," +
                                "\"song_url\":\"/sanam-re\"," +
                                "\"movie\":\"Sanam Re\"," +
                                "\"movie_url\":\"www.movie-box.com/sanam-re\"," +
                                "\"start_url\":\"www.mxlyrics.com\"," +
                                "\"lyrics\":\"sanam re tu mera sanam hua re. bhigi bhigi sadkon pe tera hi naam likhun.tujhko jo na dekhun khud se hi baat karun  khud jo kho diya hun\"," +
                                "\"singers\":\"Arjit Singh  Ankit Kumar\"," +
                                "\"director\":\"Ankit Kumar\"," +
                                "\"lyricist\":\"Javed Akhtar Ankit Kumar\""+
                                "}," +

                                "{" +
                                "\"id\":\"1\"," +
                                "\"song\":\"Sanam Re \"," +
                                "\"song_url\":\"/sanam-re\"," +
                                "\"movie\":\"Sanam Re\"," +
                                "\"movie_url\":\"www.movie-box.com/sanam-re\"," +
                                "\"start_url\":\"www.mxlyrics.com\"," +
                                "\"lyrics\":\"sanam re tu mera sanam hua re. bhigi bhigi sadkon pe tera hi naam likhun.tujhko jo na dekhun khud se hi baat karun  khud jo kho diya hun\"," +
                                "\"singers\":\"Arjit Singh  Ankit Kumar\"," +
                                "\"director\":\"Ankit Kumar\"," +
                                "\"lyricist\":\"Javed Akhtar Ankit Kumar\""+
                                "}," +

                                "{" +
                                "\"id\":\"1\"," +
                                "\"song\":\"Sanam Re \"," +
                                "\"song_url\":\"/sanam-re\"," +
                                "\"movie\":\"Sanam Re\"," +
                                "\"movie_url\":\"www.movie-box.com/sanam-re\"," +
                                "\"start_url\":\"www.mxlyrics.com\"," +
                                "\"lyrics\":\"sanam re tu mera sanam hua re. bhigi bhigi sadkon pe tera hi naam likhun.tujhko jo na dekhun khud se hi baat karun  khud jo kho diya hun\"," +
                                "\"singers\":\"Arjit Singh  Ankit Kumar\"," +
                                "\"director\":\"Ankit Kumar\"," +
                                "\"lyricist\":\"Javed Akhtar Ankit Kumar\""+
                                "}" +

                            "]}";


                Log.e("","============--------=========");
                Log.e("",response);
                Log.e("","============--------=========");

            ParseResults(response);

        //====================//
        //       END          //
        //====================//

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
        String url = "http://www.mixedlyrics.com/";
        StringRequest search_req = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                    Log.e("SA[Result Fetched]",s);
                    ParseResults(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }){
            @Override
            protected Map<String ,String> getParams(){
                HashMap<String  ,String> map = new HashMap<>();
                map.put("search_param",search_term);
                map.put("page",page_number+"");
                map.put("number",result_count+"");

                return map;
            }
        };
    }

    public void ParseResults(String response){

        RootModel rootModel = null;
        RootModelParser parser = new RootModelParser();
        rootModel = parser.parseRootModel(response);

        //appending results list
        for(int i = 0 ;i<rootModel.search_results.size();i++){
            searchResults.add(rootModel.search_results.get(i));
        }

        total_page_count= searchResults.size()/RPP;
        int extraa = (searchResults.size()%RPP==0)?0:1;
        total_page_count+=extraa;
        current_page_number=1;
        resetResults(current_page_number);
        mCurrentPage.setText(current_page_number+"");
        CanMoveForth=(total_page_count>=2)?true:false;

        adapter.setResultList(searchResults);


    }

}
