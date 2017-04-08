package com.ikostiukova.app.classwork.lesson4;

import com.ikostiukova.app.homework.lesson2.ScannerClass;

/**
 * Created by irmar on 2/21/2017.
 */
public class BiggerNumberRunner {
    public static void main(String[] args) {
        BiggerNumber biggerNumber = new BiggerNumber();
        System.out.println("Please enter two numbers");
        int a = ScannerClass.scannerInInt();
        int b = ScannerClass.scannerInInt();

       int result = biggerNumber.isBiggerNumber(a,b);
        System.out.println(result +" is bigger");

    }
}
