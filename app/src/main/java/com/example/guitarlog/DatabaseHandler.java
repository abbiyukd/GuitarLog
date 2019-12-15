package com.example.guitarlog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    // static variable
    private static final int DATABASE_VERSION = 1;

    // Database name
    private static final String DATABASE_NAME = "modulandroid";

    // table name
    private static final String TABLE_MAHASISWA = "mahasiswa";

    // column tables
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "username";
    private static final String KEY_TALL = "password";

    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MAHASISWA_TABLE = "CREATE TABLE " + TABLE_MAHASISWA + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_TALL + " TEXT" + ")";
        db.execSQL(CREATE_MAHASISWA_TABLE);
    }

    // on Upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MAHASISWA);
        onCreate(db);
    }

    public void addUser(User usermodel){
        SQLiteDatabase db  = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, usermodel.getUsername());
        values.put(KEY_TALL, usermodel.getPassword());
        db.insert(TABLE_MAHASISWA, null, values);
        db.close();
    }

    public User getMahasiswa(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_MAHASISWA, new String[] { KEY_ID,
                        KEY_NAME, KEY_TALL }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        User mahasiswa = new User(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        // return mahasiswa
        return mahasiswa;
    }

    public User getLogin(String username) {
        User mahasiswa;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_MAHASISWA, new String[] { KEY_ID,
                        KEY_NAME, KEY_TALL }, KEY_NAME + "=?",
                new String[] { username }, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        int nomor = cursor.getCount();

        if(nomor>0){
            mahasiswa = new User(Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1), cursor.getString(2));
        } else {
            mahasiswa = new User(0,
                    "failed", "failed");
        }

        // return mahasiswa
        return mahasiswa;
    }

    // get All Record
    public List<User> getAllRecord() {
        List<User> mahasiswaList = new ArrayList<User>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_MAHASISWA;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                User userModels = new User();
                userModels.setId(Integer.parseInt(cursor.getString(0)));
                userModels.setUsername(cursor.getString(1));
                userModels.setPassword(cursor.getString(2));

                mahasiswaList.add(userModels);
            } while (cursor.moveToNext());
        }

        // return mahasiwa list
        return mahasiswaList;
    }

    public int updateMahasiswa(User mahasiswa) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, mahasiswa.getUsername());
        values.put(KEY_TALL, mahasiswa.getPassword());

        // updating row
        return db.update(TABLE_MAHASISWA, values, KEY_ID + " = ?",
                new String[] { String.valueOf(mahasiswa.getId()) });
    }

    public void deleteModel(User mahasiswa) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_MAHASISWA, KEY_ID + " = ?",
                new String[] { String.valueOf(mahasiswa.getId()) });
        db.close();
    }

}
