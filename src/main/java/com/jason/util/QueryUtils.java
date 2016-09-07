package com.jason.util;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
public class QueryUtils {
    public static String like(String column, String value) {
        return column + " LIKE CONCAT('%', '" + value + "', '%')";
    }
}
