package com.ada;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		String csvName = "C:\\Users\\savan_007\\Desktop\\lakehead_data\\ADA\\ADA\\bin\\docTweet.csv";
		SortCsv sCsv = new SortCsv(new LinkedHashMap<String,Integer>());
		 Map<String,ArrayList<Tweets>> tweetMap = sCsv.csvReader(csvName);
		 System.out.println("map1 size:"+tweetMap.size());
		 Map<String,Integer> countMap = sCsv.getMap();
		 countMap =  SortedList.sortByValue(countMap);	 
		
 		for (Map.Entry<String, Integer> entry:countMap.entrySet()) {
			
				System.out.println("userName: "+entry.getKey()+"   "
						+ "number of tweets:"+ countMap.get(entry.getKey()));
			} 			
	}
}
