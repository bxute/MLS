package com.example.ankit.mixlyrics;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

class RootModelParser {

		Search_resultsModelParser search_results_parser = new Search_resultsModelParser();

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<Search_resultsModel> search_resultss = new ArrayList<>();
					JSONArray search_results_arr = jsobj.getJSONArray("search_results");
					for(int i = 0 ;i<search_results_arr.length();i++){

 						search_resultss.add(search_results_parser.parseSearch_resultsModel(search_results_arr.get(i).toString()));

					}

					local_model = new RootModel(jsobj.getString("search_parameter") , jsobj.getString("page") , jsobj.getString("error_message") , jsobj.getString("status") , search_resultss, jsobj.getString("number") );

			}
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}