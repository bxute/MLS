package com.example.ankit.mixlyrics;

import org.json.JSONException;
import org.json.JSONObject;

class Search_resultsModelParser {

	public Search_resultsModelParser() {
	}

	public Search_resultsModel parseSearch_resultsModel(String json_object) {
			Search_resultsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Search_resultsModel(jsobj.getString("director") , jsobj.getString("lyrics") , jsobj.getString("id") , jsobj.getString("movie") , jsobj.getString("song_url") , jsobj.getString("lyricist") , jsobj.getString("start_url") , jsobj.getString("song") , jsobj.getString("movie_url") , jsobj.getString("singers") );

			}
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}