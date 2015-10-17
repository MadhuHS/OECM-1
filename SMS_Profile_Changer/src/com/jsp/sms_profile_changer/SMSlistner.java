package com.jsp.sms_profile_changer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMSlistner extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		String regNumber="9999912345";
		String regCode = "*123#";
		String inNumber;
		String inCode;
		SmsMessage[] msg = null;
		
		Bundle bundle = intent.getExtras();
		Log.d("[DEBUG]",intent.getAction() );
		if(bundle!=null)
		{
			Object[] pdus =  (Object[]) bundle.get("pdus");
			msg = new SmsMessage[pdus.length];
			
			for (int i = 0; i < msg.length; i++) 
			{
				msg[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
				inCode =  msg[i].getDisplayMessageBody();
				inNumber =  msg[i].getDisplayOriginatingAddress();
				
				
				if(inNumber.equals(regNumber)&& inCode.equals(regCode))
				{
				AudioManager am = (AudioManager) context.getSystemService(context.AUDIO_SERVICE);
				am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
				
				}
			}
	
		}
		

	}

}
