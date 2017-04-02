package com.cbt.coimbatorebustransit.data;

import android.provider.BaseColumns;

/**
 * Created by Lenovo on 4/2/2017.
 */

public final class BusContract {
    private BusContract(){}

    public static final class busentry implements BaseColumns{

        public final static String TABLE_NAME = "bus";

        public final static String _id = BaseColumns._ID;
        public final static String COLUMN_SOURCE="SOURCE";
        public final static String COLUMN_DESTINATION="DESTINATION";
        public final static String COLUMN_BUSNO=" BUS NUMBERS";


    }

}
