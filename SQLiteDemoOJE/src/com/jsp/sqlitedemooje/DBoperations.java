package com.jsp.sqlitedemooje;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBoperations extends SQLiteOpenHelper {

	String qryCreattable = "CREATE TABLE USER_INFO(Username TEXT,Password TEXT);";
	
	public DBoperations(Context context) 
	{
		super(context,"dbUSER_REGISTER",null,1);
		Log.d("DEBUG", "DB created...");

	}

	@Override
	public void onCreate(SQLiteDatabase sqdb) 
	{
		sqdb.execSQL(qryCreattable);
		Log.d("DEBUG","Table created....");
	}

	public void insertusnpwd(DBoperations db,String entUsername,String entPassword)
	{
		SQLiteDatabase sqdb =  db.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("Username", entUsername);
		values.put("Password", entPassword);
		sqdb.insert("USER_INFO",null, values);
		Log.d("DEBUG","Row inserted...");
	}
	
	public Cursor retriveinfo(DBoperations db)
	{
		SQLiteDatabase sqdb = getReadableDatabase();
		String[] columns = {"Username","Password"};
		Cursor cursor =  sqdb.query("USER_INFO",columns,null,null, null, null, null, null);
		return cursor;
	}
	
	
	public void updateprofile(DBoperations dbo,String newusername,String newpassword)
	{
		SQLiteDatabase sqdb = dbo.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("Username", "'jsp'");
		values.put("Password","'1234'");
		String[] whereargs = {"Username"};
		String whereClause = "Username like 'jspiders'"; 
		sqdb.update("USER_INFO", values, whereClause,whereargs);
		
		//sqdb.execSQL("UPDATE USER_INFO SET Password='1234',Username='spiders' WHERE Username like 'jspiders'");
		Log.d("DEBUG","Row updated...");
	}
	
	
	public void deleteprofile(DBoperations dbo,String username)
	{
	  SQLiteDatabase sqdb =	 dbo.getWritableDatabase();
	  
	 /* String whereClause = "Username like "+"'"+username+"'";
	  String[] whereArgs = {"Username"};
	  sqdb.delete("USER_INFO", whereClause, whereArgs);*/
	  
	  sqdb.execSQL("Delete from USER_INFO where Username = "+"'"+username+"'");
	  
	  
	  
	  Log.d("DEBUG","Row deleted...");
	  
	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
