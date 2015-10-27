package com.example.weatherupdates;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class GetLatestUpdates extends AsyncTask<String,Void,Void> {

	
	TextView cityvaluetextview;
	TextView tempraturevaluetexview;
	URL connecturl;
	InputStream ins;
	Bundle result;
	String cityname;
	
	GetLatestUpdates(TextView cityvalueTextView,TextView tempraturevaluetTextView)
	{
		this.cityvaluetextview = cityvalueTextView;
		this.tempraturevaluetexview = tempraturevaluetTextView;
	}
	
	@Override
	protected Void doInBackground(String... updateurl) 
	{
		try 
		{
			connecturl  = new URL(updateurl[0]);
			HttpURLConnection connection = (HttpURLConnection) connecturl.openConnection();
			ins = connection.getInputStream();
			InputStreamReader insr = new InputStreamReader(ins);
			BufferedReader br = new BufferedReader(insr);
			
			String line="";
			StringBuffer buffer= new StringBuffer();
			
			while((line = br.readLine())!= null)
			{
				buffer.append(line+"\r\n");
			}
			
			String jsondata =  buffer.toString();
			result = WeatherupdatesJsonParser.getcityandtempvaues(jsondata);
		      cityname =  result.getString("city");
		
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) 
	{
		cityvaluetextview.setText(cityname);
		//tempraturevaluetexview.setText();
		super.onPostExecute(result);
	}
	
	

}
