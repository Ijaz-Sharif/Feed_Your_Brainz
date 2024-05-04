package com.example.quizapp.SqlDataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.quizapp.Model.User;

public class MyDatabase extends SQLiteOpenHelper {
    public static final String DBName = "User_Database";
    public static final String TName = "UserRecord";


    Context context;







    public static final String Col_1 = "User_Email";
    public static final String Col_2 = "User_Password";
    public static final String Col_3 = "User_Id";
    public MyDatabase(Context context) {

        super(context, DBName, null, 1);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // create table with its types of data that store record
        db.execSQL(" create table " + TName + "(" + Col_1 + " TEXT," + Col_2 + " TEXT,"
                + Col_3 + " INTEGER PRIMARY KEY AUTOINCREMENT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TName);
        onCreate(db);
    }
    public void addUser(User user) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(Col_1,user.getEmail());
        cv.put(Col_2,user.getPassword());
        long result=  db.insert(TName,null,cv);
        if(result!=-1){
            Toast.makeText(context, "User add successfully", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(context, "User not add successfully", Toast.LENGTH_LONG).show();

        }
        db.close();
    }
    public User getUserData(String userName ,String password){
        User user=null;
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor =  db.rawQuery("SELECT * FROM UserRecord WHERE User_Email ='" + userName + "' AND User_Password ='" + password + "'", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            user=new User(cursor.getString(0),cursor.getString(1),String.valueOf(cursor.getInt(2)));
            cursor.moveToNext();
        }
        return user;
    }
}
