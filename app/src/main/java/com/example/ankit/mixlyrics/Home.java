package com.example.ankit.mixlyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Home extends AppCompatActivity {


    EditText search_term;
    TextView search_btn;
    String searchType="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Config.init();
        search_btn = (TextView) findViewById(R.id.fire_search_home);
        search_term = (EditText) findViewById(R.id.home_search_input);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Home.this,SearchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("searchTerm" , search_term.getText().toString());
                bundle.putString("searchType", searchType);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        search_term.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_SEARCH) {
                    Intent intent =  new Intent(Home.this,SearchActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("searchTerm" , search_term.getText().toString());
                    bundle.putString("searchType", searchType);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }

}
