package com.ikostiukova.app.classwork.lesson4;
import com.ikostiukova.app.homework.lesson2.ScannerClass;

/**
 * Created by irmar on 2/16/2017.
 */
public class RightAngledTriangleRunner {
    public static void main(String[] args) {
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        System.out.println("Please enter 3 side of triangle");
        int a = ScannerClass.scannerInInt();
        int b = ScannerClass.scannerInInt();
        int c = ScannerClass.scannerInInt();

        boolean result = rightAngledTriangle.isRightAngledTriangle(a,b,c);
        System.out.println(result);
    }
}


