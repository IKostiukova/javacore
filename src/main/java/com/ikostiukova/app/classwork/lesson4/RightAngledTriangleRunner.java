package com.ikostiukova.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by irmar on 2/16/2017.
 */
public class RightAngledTriangleRunner {
    public static void main(String[] args) {
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 side of triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = rightAngledTriangle.isRightAngledTriangle(a,b,c);
        System.out.println(result);
    }
}


