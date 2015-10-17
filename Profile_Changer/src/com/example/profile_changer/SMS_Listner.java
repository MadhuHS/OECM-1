package com.example.profile_changer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMS_Listner extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Bundle b1 = intent.getExtras();
		SmsMessage[] msg = null;
		Object[] pdu = null;
		String inMsg,inNumber;
		String regNumber="999954321";
		String mode_Code = "*123#";
		
		if(b1!= null)
		{
			pdu = (Object[]) b1.get("pdus");
			msg = new SmsMessage[pdu.length];
			
			for(int i = 0; i<msg.length;i++)
			{
			
			msg[i] = SmsMessage.createFromPdu((byte[]) pdu[i]);
			inNumber = msg[i].getDisplayOriginatingAddress();
			inMsg =msg[i].getDisplayMessageBody();
			
			
			if(inNumber.equalsIgnoreCase(regNumber)&&inMsg.equalsIgnoreCase(mode_Code))
			{
			Log.d("[DEBUG]","Inside if statement");
			Log.d("[DEBUG]","inMessage "+inMsg + " inNumber "+inNumber); 
			Log.d("[DEBUG]","Code"+mode_Code + " Number "+regNumber); 
	
			AudioManager am = (AudioManager) context.getSystemService(context.AUDIO_SERVICE);
			  am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
				
			}
			
			Log.d("[DEBUG]","inMessage "+inMsg + " inNumber "+inNumber); 
			Log.d("[DEBUG]","Code"+mode_Code + " Number "+regNumber);
			
			}
			
		 
		}
		
		

	}

}
