package com.example.ankit.mixlyrics;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

class RootModelParser {

		Search_resultsModelParser search_results_parser = new Search_resultsModelParser();

	public RootModelParser() {
	}

	public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);
					ArrayList<Search_resultsModel> search_resultss = new ArrayList<>();
					JSONArray search_results_arr = jsobj.getJSONArray("search_results");
					for(int i = 0 ;i<search_results_arr.length();i++){

 						search_resultss.add(search_results_parser.parseSearch_resultsModel(search_results_arr.get(i).toString()));

					}
					Log.e("parser",""+search_resultss.size());
					local_model = new RootModel(
							jsobj.getString("search_parameter") ,
							jsobj.getInt("page")+"" ,
							"" ,
							jsobj.getString("status") ,
							search_resultss,
							jsobj.getInt("number")+"");

				// {"page": 1, "status": 0, "number": 10, "search_parameter": "tum ho ", "search_results": [{"song": "Woh Ho Tum Sad", "start_url": "http://www.lyricsmasti.com", "song_url": "/song/6905/lyrics-of-Woh-Ho-Tum-Sad.html", "lyrics": "Barbaadi Ki Taraf Moda Hai\r\n Kyun Moda Hai\r\nJisne Mera Dil Toda Hai\r\nDil Toda Hai\r\nBarbaadi Ki Taraf Moda Hai\r\nJisne Mera Dil Toda Hai\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nHo  Tere Surkh Naazuk Larazte Labon Pe\r\nKisi Aur Deewaane Ka Yun Naam Hoga\r\nLyricsMAsti.com\r\nTere Surkh Naazuk Larazte Labon Pe\r\nKisi Aur Deewaane Ka Yun Naam Hoga\r\nNa Socha Tha Maine Kabhi Jaane Jaana\r\nMera Pyaar Bhi Aise Naakaam Hoga\r\nThaamke Yeh Daaman Chhoda Hai, Kyoon Chhoda Hai\r\nBarbaadi Ki Taraf Moda Hai\r\nJisne Mera Dil Toda Hai\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum \r\nMohabbat Mein Tumne Kisi Roz Dilbar\r\nMujhe Apni Baahon Ka Sahaara Diya Tha\r\nHo, Mohabbat Mein Tumne Kisi Roz Dilbar\r\nMujhe Apni Baahon Ka Sahaara Diya Tha\r\nMeri Chaahaton Ko Khayaalon Ko Tumne\r\nBada Khubsoorat Nazaara Diya Tha\r\nAb Gham Se Rishta Joda Hai, Kyoon Joda Hai\r\nBarbaadi Ki Taraf Moda Hai\r\nJisne Mera Dil Toda Hai\r\nLyricsMasti.com\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum", "movie": "Muskaan - 2004", "id": "25327", "singers": "['Sonu Niigam']", "lyricist": "['Sameer']", "director": "['Nikhil Vinay']", "movie_url": "/3207/songs-of-movie-Muskaan.html"}, {"song": "Mene Jisko Dil Yeh  Diya Hai (Woh Ho Tum)", "start_url": "http://www.lyricsmasti.com", "song_url": "/song/6902/lyrics-of-Mene-Jisko-Dil-Yeh-Diya-Hai-Woh-Ho-Tum.html", "lyrics": "Maine Jisko Dil Yeh Diya Hai, Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai, Jisko Pyaar Kiya Hai\r\nMaine Jisko Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai\r\nWoh Ho Tum Woh Ho Tum, Woh Ho Tum Woh Ho Tum - 2\r\n\r\nMaine Jisko Dil Yeh Diya Hai, Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai, Jisko Pyaar Kiya Hai\r\nMaine Jisko Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai\r\nLyricsMasti.com\r\n\r\nWoh Ho Tum Woh Ho Tum, Woh Ho Tum Woh Ho Tum - 2\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\n\r\nTumhein Paake Dilbar Mujhe Lag Raha Hai\r\nMeri Zindagi Mein Na Ab Kuch Kami Hai\r\nHo O O \r\nTumhein Paake Dilbar Mujhe Lag Raha Hai\r\nMeri Zindagi Mein Na Ab Kuch Kami Hai\r\nTumhaare Labon Pe Jo Bikhri Kali Hai\r\nWoh Shabnam Nahin Hai\r\nWafa Ki Nami Hai\r\n\r\n[Jisne Mera Chain Liya Hai\r\nMera Chain Liya Hai ] 2\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai\r\n\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\n\r\nSambhaala Tha Maine Bahut Apne Dil Ko\r\nMagar Yeh Deewaana Machalne Laga Hai\r\nOh  Sambhaala Tha Maine Bahut Apne Dil Ko\r\nMagar Yeh Deewaana Machalne Laga Hai\r\nMili Teri Meri Nazar Jab Se Dilbar\r\nKhayaalon Ka Mausam Badalne Laga Hai\r\n[Mere Bas Mein Na Mera Jiya Hai\r\n Mera Jiya Hai ] 2\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\nDil Yeh Diya Hai\r\nLyricsMasti.com\r\nMaine Jisko Pyaar Kiya Hai\r\nJisko Pyaar Kiya Hai\r\n\r\nMaine Jisko Dil Yeh Diya Hai\r\nMaine Jisko Pyaar Kiya Hai\r\n\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum\r\n\r\nWoh Ho Tum Woh Ho Tum\r\nWoh Ho Tum Woh Ho Tum", "movie": "Muskaan - 2004", "id": "25259", "singers": "['Sonu Niigam,Anuradha Paudwal']", "lyricist": "['Sameer']", "director": "['Nikhil Vinay']", "movie_url": "/3207/songs-of-movie-Muskaan.html"}, {"song": "Tum Hi Ho", "start_url": "http://www.lyricsmasti.com", "song_url": "/song/8140/lyrics-of-Tum-Hi-Ho.html", "lyrics": "Hum Tere Bin Ab Reh Nahi Sakte\r\nTere Bina Kya Wajood Mera\r\nHum Tere Bin Ab Reh Nahi Sakte\r\nTere Bina Kya Wajood Mera\r\nTujhse Juda Agar Ho Jaenge \r\nTo K

			}
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}