package com.sdc.android.quickask.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDatabaseHelper extends SQLiteOpenHelper {

    public final String QUESTION_TABLE_CREATE_STATEMENT = "IF NOT EXISTS CREATE TABLE "
            + DatabaseSchema.DATABASE_QUESTIONS_TABLE_NAME
            + " ( "
            + DatabaseSchema.QuestionsCols.QUESTION_UUID + " TEXT UNIQUE PRIMARY KEY,"
            + DatabaseSchema.QuestionsCols.QUESTION_TEXT + " TEXT, "
            + DatabaseSchema.QuestionsCols.QUESTION_DESCRIPTION + " TEXT, "
            + DatabaseSchema.QuestionsCols.QUESTION_SCORE + " INTEGER, "
            + DatabaseSchema.QuestionsCols.RESPONSE_DEADLINE + " TEXT, "
            + DatabaseSchema.QuestionsCols.POST_DATE + " TEXT, "
            + DatabaseSchema.QuestionsCols.USER + " TEXT);";

    public final String RESPONSE_TABLE_CREATE_STATEMENT = "IF NOT EXISTS CREATE TABLE "
            + DatabaseSchema.DATABASE_RESPONSES_TABLE_NAME
            + " ( "
            + DatabaseSchema.ResponsesCols.RESPONSE_UUID + " TEXT UNIQUE PRIMARY KEY,"
            + DatabaseSchema.ResponsesCols.RESPONSE_TEXT + " TEXT, "
            + DatabaseSchema.ResponsesCols.RESPONSE_SCORE + " INTEGER, "
            + DatabaseSchema.ResponsesCols.QUESTION_UUID + " TEXT, "
            + DatabaseSchema.ResponsesCols.POST_DATE + " TEXT, "
            + DatabaseSchema.ResponsesCols.USER + " TEXT);";

    public QuestionDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DatabaseSchema.DATABASE_NAME, factory, DatabaseSchema.DATABASE_VERSION);
    }

    @Override
    public String getDatabaseName() {
        return DatabaseSchema.DATABASE_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(QUESTION_TABLE_CREATE_STATEMENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
