package com.example.weatherupdates;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.R.string;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;

public class WeatherupdatesJsonParser 

{
 
	static Bundle b1 = new Bundle();
	
	public static Bundle getcityandtempvaues(String jsondata)
	{
		try 
		{
			Log.d("DEBUG",jsondata);
			JSONObject rootobject = new JSONObject(jsondata);
			
			String cityname = rootobject.getString("name");
			Log.d("DEBUG", cityname);
			
			JSONObject mainobJsonObject = rootobject.getJSONObject("main");
			Double tempurature = mainobJsonObject.getDouble("temp");
			Log.d("DEBUG", tempurature.toString());
			
			b1.putString("city", cityname);
			
			
			
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return b1;
	}
	
}
