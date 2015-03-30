package com.example.asmitasinha23.final1;

/**
 * Created by asmitasinha23 on 30-Mar-15.
 */
import android.provider.BaseColumns;

public interface Constants extends BaseColumns {
    public static final String TABLE_NAME = "pizza";

    // Columns in the Events database
    public static final String SIZE = "size";
    public static final String CRUST = "crust";
    public static final String TOPPINGS_WHOLE = "toppingsWhole";
    public static final String TOPPINGS_LEFT = "toppingsLeft";
    public static final String TOPPINGS_RIGHT = "toppingsRight";
}
