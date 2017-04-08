package com.ikostiukova.app.classwork.lesson4;

/**
 * Created by irmar on 2/20/2017.
 */
public class IsOdd {
    public static boolean isOdd(int a) {
        double b = a / 2;
        if (a == (int) b * 2) {
            return false;
        }
        else return true;
    }
}
