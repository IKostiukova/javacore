package com.ikostiukova.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by irmar on 2/16/2017.
 */
public class RightAngledTriangle {
    public static boolean isRightAngledTriangle(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0) {
            //return Math.sqrt(a)== (Math.sqrt(b) + Math.sqrt(c)) || Math.sqrt(b) == (Math.sqrt(a) + Math.sqrt(c)) || Math.sqrt(c) == (Math.sqrt(a) + Math.sqrt(b));
              return a*a==b*b+c*c || b*b == a*a + c*c || c*c == a*a +b*b;
        }
        else return false;
    }
}
