package in.co.mismart.azim24x7care;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String dbname = "mydb";
    private static final int version = 1 ;

    public DataBaseHelper(Context context){
        super(context,dbname,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE PRODUCTS (ID TEXT, NAME TEXT ,GENDER TEXT)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertData(String t1, String t2, String t3, String t4, String t5)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME",t1);
        values.put("LASTNAME",t2);
        values.put("PHONE",t3);
        values.put("EMAIL",t4);
        values.put("PASSWORD",t5);
        long result= db.insert("PRODUCTS",null,values);

        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
