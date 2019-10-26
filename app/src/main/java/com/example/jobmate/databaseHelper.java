package com.example.jobmate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Jobmate.db";
    public static final String TABLE_NAME="provider_table";
    public static final String COL_1="ID";
    public static final String COL_2="EMAIL";
    public static final String COL_3="FIRSTNAME";
    public static final String COL_4="LASTNAME";
    public static final String COL_5="PASSWORD";
    public static final String COL_6="RPEATPASSWORD";
    public static final String COL_7="COMPANYNAME";
    public static final String TABLE_NAME1="finder_table";
    public static final String COL_11="ID";
    public static final String COL_22="EMAIL";
    public static final String COL_33="FIRSTNAME";
    public static final String COL_44="LASTNAME";
    public static final String COL_55="PASSWORD";
    public static final String COL_66="RPEATPASSWORD";
    public static final String COL_77="DATEBIRTH";
    public static final String TABLE_NAME2="job";
    public static final String COL_01="ID";
    public static final String COL_02="COMPANYNAME";
    public static final String COL_03="DESCRIPTION";
    public static final String COL_04="SALARY";
    public static final String COL_05="PHONENUMBER";
    public static final String COL_06="JOBTYPE";
    public databaseHelper(Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,FIRSTNAME TEXT,LASTNAME TEXT, PASSWORD TEXT,RPEATPASSWORD TEXT,COMPANYNAME TEXT)");
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,FIRSTNAME TEXT,LASTNAME TEXT, PASSWORD TEXT,RPEATPASSWORD TEXT,DATEBIRTH TEXT)");
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,COMPANYNAME VARCHAR,DESCRIPTION VARCHAR, SALARY TEXT,PHONENUMBER VARCHAR,JOBTYPE VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db);

    }

    public boolean insertData(String email, String firstname,String lastname,String password,String repeatpassword,String companyname) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,firstname);
        contentValues.put(COL_4,lastname);
        contentValues.put(COL_5,password);
        contentValues.put(COL_6,repeatpassword);
        contentValues.put(COL_7,companyname);
        long ins = db.insert(TABLE_NAME,null,contentValues);
        if(ins==-1) return false;
        else  return true;
    }
    public boolean insertDataF(String email, String firstname,String lastname,String password,String repeatpassword,String datebirth) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_22,email);
        contentValues.put(COL_33,firstname);
        contentValues.put(COL_44,lastname);
        contentValues.put(COL_55,password);
        contentValues.put(COL_66,repeatpassword);
        contentValues.put(COL_77,datebirth);
        long ins = db.insert(TABLE_NAME1,null,contentValues);
        if(ins==-1) return false;
        else  return true;
    }
    public boolean insertDataJ(String cname, String description,String salary,String phno,String jtype) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_02,cname);
        contentValues.put(COL_03,description);
        contentValues.put(COL_04,salary);
        contentValues.put(COL_05,phno);
        contentValues.put(COL_06,jtype);
        long ins = db.insert(TABLE_NAME2,null,contentValues);
        if(ins==-1) return false;
        else  return true;
    }
    public Cursor viewData(){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="Select * from "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        return cursor;

    }
    public Cursor ViewData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

}


