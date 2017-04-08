package com.ikostiukova.app.classwork.lesson6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by irmar on 3/23/2017.
 */
public class DoWhile {
    public static int doWhile(int a, int b){
         do{
            System.out.println("In loop: A is "+a+ ",B is" + b);
            a--;
        }while (a>b);
        return a; // вернуть масив

    }

}

