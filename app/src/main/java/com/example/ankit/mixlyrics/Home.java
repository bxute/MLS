package com.example.ankit.mixlyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    EditText search_term;
    TextView search_btn;
    RadioGroup search_method_radio;
    String searchType="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        search_btn = (TextView) findViewById(R.id.fire_search_home);
        search_term = (EditText) findViewById(R.id.home_search_input);
        search_method_radio = (RadioGroup) findViewById(R.id.search_method_radio);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Home.this,SearchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("searchTerm" , search_term.getText().toString());
                bundle.putString("searchType" , searchType );
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        search_method_radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int number) {
                if(number == 1.0){
                    searchType = "Lyrics";
                }
                if(number == 2.0){
                    searchType = "Artist";
                }
                if(number == 3.0){
                    searchType = "Album";
                }
            }
        });


    }

}
