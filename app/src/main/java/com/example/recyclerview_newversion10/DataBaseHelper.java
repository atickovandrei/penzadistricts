package com.example.application15;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



class DatabaseHelper extends SQLiteOpenHelper {
    private static String DB_PATH;
    private static String DB_NAME = "primer.db";
    private static final int SCHEMA = 3;
    static final String TABLE = "districts";

    static final String COLUMN_ID = "_id";
    static final String COLUMN_NAME = "name_district";
    static final String COLUMN_ABOUT = "about_district";
    private Context myContext;

    DatabaseHelper(Context context) {
        super(context, DB_NAME, null, SCHEMA);
        this.myContext=context;
        DB_PATH =context.getFilesDir().getPath() + DB_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {
    }

    void create_db(){
        InputStream myInput = null;
        OutputStream myOutput = null;
        try {
            File file = new File(DB_PATH);
            if (!file.exists()) {
                this.getReadableDatabase();
                myInput = myContext.getAssets().open(DB_NAME);
                String outFileName = DB_PATH;


                myOutput = new FileOutputStream(outFileName);

                byte[] buffer = new byte[1024];
                int length;
                while ((length = myInput.read(buffer)) > 0) {
                    myOutput.write(buffer, 0, length);
                }

                myOutput.flush();
                myOutput.close();
                myInput.close();
            }
        }
        catch(IOException ex){
            Log.d("DatabaseHelper", ex.getMessage());
        }
    }
    public SQLiteDatabase open()throws SQLException {

        return SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
    }
}



/*
public class DataBaseHelper extends SQLiteOpenHelper {


    public static final int DB_VERSION = 1;
    public static String DB_PATH = "";
    public static final String DB_NAME = "primer.db";
    static final String TABLE_NAME = "districts";


    public static final String KEY_ID = "id_district";
    static final String KEY_TITLE = "name_district";

    private Context mContext;
    private SQLiteDatabase mDataBase;
    private boolean mNeedUpdate;



    DataBaseHelper (Context context){

        super(context, DB_NAME, null, DB_VERSION);
        if (android.os.Build.VERSION.SDK_INT >=17)
            DB_PATH =context.getApplicationInfo().dataDir + "/databases";
        else
            DB_PATH ="/data/data/" + context.getPackageName() + "/databases/";

        this.mContext = context;

        copyDataBase();

        this.getReadableDatabase();
    }


    void updateDataBase() throws IOException{

        if (mNeedUpdate){

            File dbFile = new File(DB_PATH+DB_NAME);
            if(dbFile.exists())
                dbFile.delete();

            copyDataBase();

            mNeedUpdate = false;
        }
    }


    private boolean checkDataBase () {
        File dbFile = new File (DB_PATH + DB_NAME);
        return dbFile.exists();
    }

    private void copyDataBase(){

        if(!checkDataBase()) {
            this.getReadableDatabase();
            this.close();
            try {
                copyDBFile();
            } catch (IOException mIOException){
                throw new Error("ErrorCopyingDatabase");
            }
        }
    }

    private void copyDBFile() throws IOException {
        InputStream mInput = mContext.getAssets().open(DB_NAME);
        OutputStream mOutput = new FileOutputStream(DB_PATH + DB_NAME);
        byte[] mBuffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(mBuffer)) > 0)
            mOutput.write(mBuffer, 0, mLength);
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }

    String [][] getQuery (SQLiteDatabase db, String sql){

        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();

        String [][] lists = new String [cursor.getCount()][cursor.getColumnCount()];

        int j = 0;

        while (cursor.isAfterLast()) {
            for (int i = 0; i < cursor.getColumnCount(); i++  ){
                lists [j][i]= cursor.getString(i);
            }
            cursor.moveToNext();
            j++;

        }
        cursor.close();
        return lists;
    }

    public boolean openDataBase() throws SQLException {
        mDataBase = SQLiteDatabase.openDatabase(DB_PATH + DB_NAME, null, SQLiteDatabase.CREATE_IF_NECESSARY);
        return mDataBase != null;
    }

    @Override
    public synchronized void close() {
        if (mDataBase != null)
            mDataBase.close();
        super.close();

    }

    @Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion ) {
        if (newVersion > oldVersion)
            mNeedUpdate = true;
    }
}
*/
