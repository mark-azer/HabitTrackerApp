package com.example.android.habittrackerapp.data;

import android.provider.BaseColumns;

public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {}

    /**
     * Inner class that defines constant values for the habits database table.
     * Each entry in the table represents a single habit.
     */
    public static final class HabitEntry implements BaseColumns {

        /**
         * Name of database table for pets
         */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the habit (only for use in the database table).
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habit.
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME = "name";

        /**
         * Hours spent on the habit in a day.
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_HOURS = "hours";

        /**
         * Location of the habit.
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_LOCATION = "location";
    }
}
