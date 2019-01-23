package com.camp.bit.todolist.db;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static final String SQL_CREATE_ENTRIES=
            "CREATE TABLE "+ ToEntry.TABLE_NAME+" ("+
                    ToEntry._ID+" INTEGER PRIMARY KEY,"+
                    ToEntry.COLUMN_DATE + " INTEGER,"+
                    ToEntry.COLUMN_STATE +" INTEGER," +
                    ToEntry.COLUMN_CONTENT+" TEXT)";
    public static final String SQL_DELETE_ENRTIES=
            "DROP TABLE IF EXISTS "+ ToEntry.TABLE_NAME;

    private TodoContract() {

    }

    public static class ToEntry implements BaseColumns{
        public static final String TABLE_NAME="entry";
//        public static final String COLUMN_NAME_TITLE="title";
        public static final String COLUMN_CONTENT="content";
        public static final String COLUMN_DATE="time";
        public static final String COLUMN_STATE="state";
//        public static final String COLUMN_PRIORITY="priority";

    }



}
