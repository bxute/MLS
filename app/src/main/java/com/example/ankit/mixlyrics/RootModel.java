package com.example.ankit.mixlyrics;

import java.util.ArrayList;

class RootModel {

		public String search_parameter;
		public String page;
		public String error_message;
		public String status;
		public ArrayList<Search_resultsModel> search_results;
		public String number;

public RootModel(String search_parameter, String page, String error_message, String status, ArrayList<Search_resultsModel> search_results, String number) {

		this.search_parameter = search_parameter;
		this.page = page;
		this.error_message = error_message;
		this.status = status;
		this.search_results = search_results;
		this.number = number;

	}

}