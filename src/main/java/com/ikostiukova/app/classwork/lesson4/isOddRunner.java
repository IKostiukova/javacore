package com.ikostiukova.app.classwork.lesson4;

import com.ikostiukova.app.homework.lesson2.ScannerClass;

import java.util.InputMismatchException;

/**
 * Created by irmar on 2/20/2017.
 */
public class isOddRunner {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        try{
        int a = ScannerClass.scannerInInt();
        boolean result = IsOdd.isOdd(a);

        if (result == true) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
        }
        catch (InputMismatchException e){
            System.out.println("Seems you enter wrong number");
        }
    }
}

