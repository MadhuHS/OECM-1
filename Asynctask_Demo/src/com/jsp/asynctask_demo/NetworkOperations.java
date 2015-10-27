package com.jsp.asynctask_demo;

import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.NotificationCompat;
import android.widget.Button;
import android.widget.TextView;

public class NetworkOperations extends AsyncTask<String,Integer,Void> 
{

	Button downloadbutton;
	TextView msgtextview;
	Context context;
	NotificationCompat.Builder builder;
	NotificationManager notmgr;
	
	public NetworkOperations(Button downloadbutton,TextView msgtextview,Context context)
	{
		this.downloadbutton = downloadbutton;
		this.msgtextview = msgtextview;
		this.context = context;

	}
	
	
	
	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		
		builder = new NotificationCompat.Builder(context);
		builder.setSmallIcon(R.drawable.ic_action_download);
		builder.setContentTitle("Download started...");
		builder.setProgress(100,0,false);
		notmgr = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		notmgr.notify(1,builder.build());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Void doInBackground(String... arg0) 
	{
		for(int i = 0 ; i<=100;i++)
		{
			try 
			{
				Thread.sleep(300);
				publishProgress(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}
	
	@Override
	protected void onProgressUpdate(Integer... values) {
		super.onProgressUpdate(values);
		
		builder.setProgress(100,values[0],false);
		builder.setContentText(values[0].toString()+"%");
		notmgr.notify(1,builder.build());
		msgtextview.setText(values[0].toString());
	}
	
	@Override
	protected void onPostExecute(Void result) 
	{
		super.onPostExecute(result);
		downloadbutton.setEnabled(true);
		builder.setContentTitle("Download completed...");
		notmgr.notify(1,builder.build());
		msgtextview.setText("Download completed....");
	
	}
		

}
