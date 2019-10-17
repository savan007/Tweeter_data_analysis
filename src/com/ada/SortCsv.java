/**
 * 
 */
package com.ada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SortCsv {
	private Map<String,Integer> finalMap ;
	
	public SortCsv(Map<String,Integer> map) {
		this.finalMap = map;
	}

	private File getFile(String csvName) {
		
		
		return new File(csvName);
	}

	public Map<String,ArrayList<Tweets>> csvReader(String csvName) {
		Map<String,ArrayList<Tweets>> map = new HashMap<>();
		BufferedReader bufferedReader = null;
        String data = "";
        String splitBy = ",";
        
        String temp = "";
        try {

            bufferedReader = new BufferedReader(new FileReader(getFile(csvName)));
            while ((data = bufferedReader.readLine()) != null) {
            	String[] csvData = null;
               
            	if (temp == "") {
                 csvData = splitData(data,splitBy);
                		
            	}else {
            		csvData=splitData(temp+data,splitBy);
            	}
                
             
                if(csvData.length<17) {
                	temp=temp+data;
                	continue;
                }
                	else {
                		Tweets twData = setData(csvData);
                		createNewMap(map,twData); 
                		temp="";   
                	}
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
	}

	public String[] splitData(String line, String splitCsv) {
		
		char car = '"';
		String [] str = line.split(String.valueOf(car));
		String temp="";
		if(str.length >= 3) {
			for (int  i=0; i< str.length;i++) {
				if (i==3) {
					temp=temp+String.valueOf(car)+str[i].replaceAll(",","");
				} else {
					temp=temp+String.valueOf(car)+str[i];
				}
			}
			return temp.split(splitCsv);
		}
		
		return line.split(splitCsv);
	}

	public void createNewMap(Map<String, ArrayList<Tweets>> map,Tweets twitterData) {
		
		if (map != null && map.get(twitterData.getScreenName()) != null) {
			ArrayList<Tweets> list = map.get(twitterData.getScreenName());
			list.add(twitterData);
			map.put(twitterData.getScreenName(), list);
			int x = finalMap.get(twitterData.getScreenName());
			x = x+1;
			finalMap.put(twitterData.getScreenName(), x);
		} else {
			ArrayList<Tweets> list = new ArrayList<>();
			list.add(twitterData);
			map.put(twitterData.getScreenName(), list);
			finalMap.put(twitterData.getScreenName(),1);
		}
		
	}

	public Tweets setData(String[] tweetD) {
		Tweets tweetData = new Tweets();
		try {
			tweetData.setText(tweetD[1]);
			tweetData.setIsFavorited(tweetD[2]);
			tweetData.setFavoriteCount(tweetD[3]);
			tweetData.setReplyToSN(tweetD[4]);
			tweetData.setCreated(tweetD[5]);
			tweetData.setIsTruncated(tweetD[6]);
			tweetData.setReplyToSID(tweetD[7]);
			tweetData.setId(tweetD[8]);
			tweetData.setReplyToUID(tweetD[9]);
			tweetData.setStatusSource(tweetD[10]);
			tweetData.setScreenName(tweetD[11]);
			tweetData.setRetweetCount(tweetD[12]);
			tweetData.setIsRetweet(tweetD[13]);
			tweetData.setIsRetweeted(tweetD[14]);
			tweetData.setLongitude(tweetD[15]);
			tweetData.setLatitute(tweetD[16]);
			
		}catch (Exception e) {
			e.printStackTrace();
			tweetData = null;
		}
		return tweetData;
	}
	//return the map
	
	public Map<String, Integer> getMap() {
		return finalMap;
	}

	//for map to set
	
	public void setMap(Map<String, Integer> map) {
		this.finalMap = map;
	}	
}
